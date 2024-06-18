package com.excel.pet.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.excel.pet.entity.Pets;
import com.excel.pet.enums.Breed;
import com.excel.pet.enums.Species;

/*---------------------Pets Repository---------------------------*/
public interface PetsRepo extends JpaRepository<Pets, Integer>{
	
	Optional<Pets> findByPetId(Integer id);

	Optional<Pets> findByEmail(String email);

	Optional<Pets> findByBreed(Breed breed);


}
