package com.example.democrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.democrud.model.User;
import com.example.democrud.service.api.UserServiceAPI;

@Controller
@RequestMapping("/home")
public class UserController {

	@Autowired
	private UserServiceAPI UserServiceAPI;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", UserServiceAPI.getAll());
		return "index";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("user", new User());
		return "save";
	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("user", userServiceAPI.get(id));
		} else {
			model.addAttribute("yser", new User());
		}
		return "save";
	}

	@PostMapping("/save")
	public String save(User user, Model model) {
		userServiceAPI.save(user);
		return "redirect:/home/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		userServiceAPI.delete(id);

		return "redirect:/home/";
	}

}
