package com.excel.pet.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.pet.entity.Application;
import com.excel.pet.enums.ApplicationStatus;


/*---------------------Application Repository---------------------------*/
public interface ApplicationRepo extends JpaRepository<Application, Integer>{
	
	Optional<Application> findAllByApplicationStatus(Application applicationStatus);
	
}
