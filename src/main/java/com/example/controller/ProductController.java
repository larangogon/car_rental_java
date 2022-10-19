package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("list", service.list());
        return "index";
    }

    @RequestMapping("/showProduct")
    public String show(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "save";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product product) {
        service.save(product);
        return "redirect:/";
    }

    @RequestMapping(value = "/showProduct/{id}")
    public String edit(@PathVariable(value = "id") int id, Model model) {
        Product product = service.get(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @RequestMapping(value = "/destacado/{id}")
    public String destacado(@PathVariable(value = "id") int id, Model model) {
        Product product = service.get(id);
        model.addAttribute("product", product);
        return "destacado";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int id) {
        this.service.delete(id);
        return "redirect:/";
    }

}
