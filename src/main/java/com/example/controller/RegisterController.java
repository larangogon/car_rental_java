package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Register;
import org.springframework.web.bind.annotation.PathVariable;
import ar.edu.larioja.control.stock.Services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Register/v1")
public class RegisterController {

    @Autowired
    private RegisterService RegisterService;

    @GetMapping(produces="application/json",path = "/")
    public ResponseEntity<String> HelloWorld(){

        return new ResponseEntity<>("Hello World!!", HttpStatus.OK );

    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/add")
    public ResponseEntity<Register> agregarRegister(@RequestBody Register Register){

        return new ResponseEntity <> ( RegisterService.createRegister ( register ), HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json",path = "/all")
    public ResponseEntity<List<Register>> getAllRegisters(){

        return new ResponseEntity <> ( RegisterService.getAllRegister (), HttpStatus.OK );


    }

    @GetMapping(path = "/{registerId}", produces = "application/json")
    public ResponseEntity<Register> getEmployee(@PathVariable(value = "crandId") Long registerId) {
        return new ResponseEntity<>(RegisterService.getRegister (registerId), HttpStatus.OK);
    }

	private String name;

	public void processRegister(Rental rental, long timeStamp) {

		System.out.println("admini " + this.name + 
				" START PROCESSING THE CUSTOMER'S PURCHASE " + rental.getUserId() + 
				" IN THE TIME: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");

		for (int i = 0; i < rental.getAutomobileId().length; i++) { 
				this.waitPerseconds(rental.getAutomobileId()[i]); 
				System.out.println("Processed the product " + (i + 1) +  
				" ->Time: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}

		System.out.println("admini " + this.name + " FINISHED PROCESSING " + 
				rental.getUserId() + " IN THE TIME: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	}


	private void waitPerseconds(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}