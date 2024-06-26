package com.excel.pet.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.pet.entity.Users;


/*---------------------User Repository---------------------------*/
public interface UserRepo extends JpaRepository<Users, Integer>{

	Optional<Users> findByEmail(String email);

}
