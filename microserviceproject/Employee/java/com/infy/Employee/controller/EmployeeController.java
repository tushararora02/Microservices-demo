package com.infy.Employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.Employee.model.DepartmentDTO;
import com.infy.Employee.model.EmployeeDTO;
import com.infy.Employee.model.ProjectDTO;
import com.infy.Employee.service.EmployeeService;





@RestController
@RequestMapping(value="/EmployeeDetails")
public class EmployeeController {
	
	@Autowired
	private EmployeeService serv;
	
	@RequestMapping(value="/getEmployee/{empId}",method=RequestMethod.GET)
	public EmployeeDTO getEmployeeofId(@PathVariable Integer empId)
	{
		EmployeeDTO empdto=serv.getEmployeeofId(empId);
		DepartmentDTO deptdto=new RestTemplate().getForObject("http://localhost:8685/departmentDetailsApi/getdept?deptCode="+empdto.getDept().getDeptCode(), DepartmentDTO.class);
		
		List<ProjectDTO> listofproject= new RestTemplate().getForObject("http://localhost:8700/ProjectDetailApi/getProject/"+empdto.getEmpId(), List.class);
       
		
		empdto.setDept(deptdto);
		empdto.setListofproject(listofproject);
		return empdto;
	}
	
	
	

}
