package com.infy.Project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.Project.entity.ProjectEntity;


@Repository
public interface ProjectRepo extends JpaRepository<ProjectEntity, Integer> {
	
	
	List<ProjectEntity> findByEmpId(Integer empId);

}
