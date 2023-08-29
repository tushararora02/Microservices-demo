package com.infy.Employee.model;

import java.util.List;

public class EmployeeDTO 
{
	private Integer  empId;
	private String empName;

	private DepartmentDTO dept;
	
	private Integer managerId;
	
	private List<ProjectDTO> listofproject;
	
	
	
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	
	
	public List<ProjectDTO> getListofproject() {
		return listofproject;
	}
	public void setListofproject(List<ProjectDTO> listofproject) {
		this.listofproject = listofproject;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
		public DepartmentDTO getDept() {
		return dept;
	}
	public void setDept(DepartmentDTO dept) {
		this.dept = dept;
	}
	
	
	
	
	

}
