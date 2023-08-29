package com.infy.Employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Employee.entity.EmployeeEntity;
import com.infy.Employee.model.DepartmentDTO;
import com.infy.Employee.model.EmployeeDTO;
import com.infy.Employee.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
  @Autowired
  private EmployeeRepo repo; 

  public EmployeeDTO getEmployeeofId(Integer empId)
  { 
	EmployeeEntity employeeentity=repo.findById(empId).get();
	EmployeeDTO employeeDto=this.setEmpEntitytoEmpDTO(employeeentity);
	
	
	return employeeDto;
	
    }
  
  
   public EmployeeDTO setEmpEntitytoEmpDTO(EmployeeEntity employeeentity)
  {
	EmployeeDTO employeeDto=new EmployeeDTO();
	employeeDto.setEmpId(employeeentity.getEmpId());
	employeeDto.setEmpName(employeeentity.getEmpName());
	employeeDto.setManagerId(employeeentity.getManagerId());
	DepartmentDTO dept=new DepartmentDTO();
	dept.setDeptCode(employeeentity.getDeptCode());
	employeeDto.setDept(dept);
	
	return employeeDto;
	
    }


}
