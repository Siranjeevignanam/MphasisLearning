package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Pg;

@Repository
public interface PgRepository extends JpaRepository<Pg,Long>{

	List<Pg> findByCity(String city);
	List<Pg> findByLocality(String Locality);
}
