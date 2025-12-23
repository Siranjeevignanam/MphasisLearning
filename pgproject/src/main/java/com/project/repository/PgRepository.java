package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.model.Pg;

@Repository
public interface PgRepository extends JpaRepository<Pg,Long>{

	@Query(value="SELECT * FROM Pg  WHERE city = :city AND available = true",nativeQuery =true)
	List<Pg> findByCity(@Param("city") String city); 
	@Query(value="SELECT * FROM Pg  WHERE locality = :locality AND available = true",nativeQuery =true)
	List<Pg> findByLocality(@Param("locality")String locality);
}
