package com.almabase.Assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almabase.Assignment.service.BirthdayService;

@RestController
@RequestMapping("/wish")
public class BrithdayController {
	
	@Autowired
	BirthdayService birthdayService;

	@GetMapping("{username}")
	public String getBirthday(@PathVariable String username) {
		return birthdayService.getBirthdayWish(username);
	}
}
