package ar.edu.larioja.control.stock.Controllers;


import ar.edu.larioja.control.stock.Models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import ar.edu.larioja.control.stock.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(produces="application/json",path = "/")
    public ResponseEntity<String> HelloWorld(){

        return new ResponseEntity<>("Hello World!!", HttpStatus.OK );

    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/add")
    public ResponseEntity<Category> agregarCategory(@RequestBody Category category){

        return new ResponseEntity <> ( categoryService.createCategory ( category ), HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json",path = "/all")
    public ResponseEntity<List<Category>> getAllCategories(){

        return new ResponseEntity <> ( categoryService.getAllCategory (), HttpStatus.OK );


    }

    @GetMapping(path = "/{categoryId}", produces = "application/json")
    public ResponseEntity<Category> getEmployee(@PathVariable(value = "categoryId") Long categoryId) {
        return new ResponseEntity<>(categoryService.getCategory (categoryId), HttpStatus.OK);
    }



}
