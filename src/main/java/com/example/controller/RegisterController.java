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
}