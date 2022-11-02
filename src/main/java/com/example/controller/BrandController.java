package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Brand;
import org.springframework.web.bind.annotation.PathVariable;
import ar.edu.larioja.control.stock.Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Brand/v1")
public class BrandController {

    @Autowired
    private BrandService BrandService;

    @GetMapping(produces="application/json",path = "/")
    public ResponseEntity<String> HelloWorld(){

        return new ResponseEntity<>("Hello World!!", HttpStatus.OK );

    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/add")
    public ResponseEntity<Brand> agregarBrand(@RequestBody Brand brand){

        return new ResponseEntity <> ( BrandService.createBrand ( brand ), HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json",path = "/all")
    public ResponseEntity<List<Brand>> getAllBrands(){

        return new ResponseEntity <> ( BrandService.getAllBrand (), HttpStatus.OK );


    }

    @GetMapping(path = "/{brandId}", produces = "application/json")
    public ResponseEntity<Brand> getEmployee(@PathVariable(value = "crandId") Long brandId) {
        return new ResponseEntity<>(BrandService.getBrand (brandId), HttpStatus.OK);
    }
}
