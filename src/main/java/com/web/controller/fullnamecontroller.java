package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class fullnamecontroller {
	
	@RequestMapping ("/")
	public String fullnameForm()
	{
		return "name";
	}
	
	@RequestMapping ("/submit")
	public String printfullname(@RequestParam String fname,@RequestParam String lname,ModelMap model )
	{
		model.put("k1",fname);
		model.put("k2", lname);
		String fullName = fname +" "+ lname;
		model.put("fullname", fullName);
		return "result";
	}
}
