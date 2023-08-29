package com.infy.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Project.model.ProjectDTO;
import com.infy.Project.service.ProjectService;

@RestController
@RequestMapping(value="/ProjectDetailApi")
public class ProjectController 
{
	@Autowired
	private ProjectService service;
	
	@RequestMapping(value="/getProject/{empId}",method=RequestMethod.GET)
	public List<ProjectDTO> getprojectbyempId(@PathVariable Integer empId)
	{
		List<ProjectDTO> listofprojectCode=service.findProjectcodebyEmpId(empId);
		return listofprojectCode;
	}

}
