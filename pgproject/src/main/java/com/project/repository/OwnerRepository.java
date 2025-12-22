package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

//Optional<Owner> findById(Long long1);
	

}
