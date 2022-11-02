package com.example.controller;

import com.example.model.Automobile;
import com.example.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AutomobileController {

    @Autowired
    AutomobileService service;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("list", service.list());
        return "index";
    }

    @RequestMapping("/showAutomobile")
    public String show(Model model) {
        Automobile automobile = new Automobilet();
        model.addAttribute("automobile", automobile);
        return "save";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("automobile") Automobile automobile) {
        service.save(automobile);
        return "redirect:/";
    }

    @RequestMapping(value = "/showAutomobile/{id}")
    public String edit(@PathVariable(value = "id") int id, Model model) {
        Automobile automobile = service.get(id);
        model.addAttribute("automobile", automobile);
        return "edit";
    }

    @RequestMapping(value = "/destacado/{id}")
    public String destacado(@PathVariable(value = "id") int id, Model model) {
        Automobile automobile = service.get(id);
        model.addAttribute("automobile", automobile);
        return "destacado";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int id) {
        this.service.delete(id);
        return "redirect:/";
    }

}
