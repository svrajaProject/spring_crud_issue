package com.gl.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.business.dao.BussinessDao;
import com.gl.business.model.Bussiness;

@Controller
@RequestMapping("home")
public class HomeController {

	@Autowired
	BussinessDao bussinessDao;

	@GetMapping("list")
	public String listBusiness(Model model) {
//		System.out.println("I am there!");
		List<Bussiness> bussinesse = bussinessDao.findAll();
		model.addAttribute("bussinesse", bussinesse);
		return "business-list";
	}


}
