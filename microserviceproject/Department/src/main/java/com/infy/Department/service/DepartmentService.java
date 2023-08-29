package com.infy.Department.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infy.Department.entity.DepartmentEntity;
import com.infy.Department.model.DepartmentDTO;
import com.infy.Department.repo.DepartmentRepo;

@Service
public class DepartmentService {

  @Autowired
  DepartmentRepo repo;
  
  
  @Qualifier(value="getMapper")
  ModelMapper mapper;
  
  public static  DepartmentDTO setdeptEntitytodepDto(DepartmentEntity departmententity)
  {
	  DepartmentDTO deptdto=new DepartmentDTO();
	  deptdto.setDeptCode(departmententity.getDeptCode());
	  deptdto.setDeptname(departmententity.getDeptName());
	  
	  return deptdto;
  }
  
  
  public DepartmentDTO getDeptbyId(Integer deptCode)
  {
	  Optional<DepartmentEntity> deptentity=repo.findById(deptCode);
	  DepartmentEntity deptentity1=deptentity.get();
	  DepartmentDTO dept=setdeptEntitytodepDto(deptentity1);
	  
	  return  dept;
  }
  
	
}
