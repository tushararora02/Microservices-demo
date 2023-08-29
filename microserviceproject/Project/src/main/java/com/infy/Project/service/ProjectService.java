package com.infy.Project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Project.entity.ProjectEntity;
import com.infy.Project.model.ProjectDTO;
import com.infy.Project.repo.ProjectRepo;

@Service
public class ProjectService {
	
	
	@Autowired
	private ProjectRepo repo;
	
	public static  ProjectDTO convertProjectEntitytoProjectDTO(ProjectEntity projectentity)
	{
		ProjectDTO projectdto=new ProjectDTO();
		projectdto.setProjectCode(projectentity.getProjectCode());
		projectdto.setProjectName(projectentity.getProjectName());
		return projectdto;
	}
	 
    public  List<ProjectDTO> findProjectcodebyEmpId(Integer empId)
    {
    
    	
    	List<ProjectDTO> listofprojectdto=new ArrayList<>();
    	List<ProjectEntity> listofproject=repo.findByEmpId(empId);
    	for (ProjectEntity projectEntity : listofproject) 
    	{
    		ProjectDTO project=convertProjectEntitytoProjectDTO(projectEntity);
    		listofprojectdto.add(project);
			
		}
		
    	return listofprojectdto ;
    }
}
