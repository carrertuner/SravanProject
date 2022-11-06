package com.ct.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.demo.entity.EmpDetails;
import com.ct.demo.service.EmpDetailsService;

@RestController
@RequestMapping("/empdetails") // http://localhost:9919//empdetails/
public class EmpDetailsController {
	@Autowired
	EmpDetailsService service;

	@PostMapping("/addempdetails") // http://localhost:9919/empdetails/addempdetails
	public String insertEmpDetails(@RequestBody EmpDetails empdetails) {
		return service.addEmpDetails(empdetails);
	}

	@PutMapping("/updateempdetails") // http://localhost:9919/empdetails/updateempdetails
	public String updateEmpDetails(@RequestBody EmpDetails empdetails) {
		return service.updateEmpDetails(empdetails);
	}

	@DeleteMapping("/deleteempdetails/{fname}") // http://localhost:9919/empdetails/deleteempdetails/varun
	public String deleteEmpDetails(@PathVariable("fname") String firstName) {
		return service.deleteEmpDetails(firstName);
	}

	@GetMapping("/getempdetails/{fname}") // http://localhost:9919/empdetails/getempdetails/varun
	public EmpDetails getEmpDetails(@PathVariable("fname") String firstName) {
		return service.getEmpDetails(firstName);
	}
}
