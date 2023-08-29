package com.infy.Department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Department.model.DepartmentDTO;
import com.infy.Department.service.DepartmentService;

@RestController
@RequestMapping(value="/departmentDetailsApi")
public class DepartmentController {
	
	@Autowired
	DepartmentService serv;
	
	@RequestMapping(value="/getdept",method=RequestMethod.GET)
	public DepartmentDTO senddeptbyId(@RequestParam Integer deptCode)
	{
		DepartmentDTO dept=serv.getDeptbyId(deptCode);
		return dept;
		
	}

}
