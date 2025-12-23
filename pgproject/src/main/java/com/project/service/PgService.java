package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Owner;
import com.project.model.Pg;
import com.project.repository.PgRepository;

@Service
public class PgService {

	@Autowired
	OwnerService ownerservice;

	@Autowired
	PgRepository repo;

	public List<Pg> getPgByCity(String city) {
		return repo.findByCity(city);
	}

	public List<Pg> getPgByLocality(String locality) {
		return repo.findByLocality(locality);
	}

	public Pg getPgById(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("PG not found"));
	}

	public Pg addPg(Pg pg) {
		if (pg.getOwner() != null && pg.getOwner().getOwnerId() != null) {
			Owner owner = ownerservice.getOwnerById(pg.getOwner().getOwnerId());
			pg.setOwner(owner);
		}
		return repo.save(pg);
	}

	public List<Pg> getAllPg() {
		return repo.findAll();
	}

	public void deletePg(Long id) {
		repo.deleteById(id);
	}

	public Pg updateAvailability(Long pgId) {
		Pg pg = getPgById(pgId);

		if (pg.isAvailable() == true) {
			pg.setAvailable(false);
		} else {
			pg.setAvailable(!pg.isAvailable());
		}

		return repo.save(pg);
	}

	public Pg updatePg(Long pgId, Pg updatedPg) {
		Pg existingPg = getPgById(pgId);

		existingPg.setName(updatedPg.getName());
		existingPg.setCity(updatedPg.getCity());
		existingPg.setLocality(updatedPg.getLocality());
		existingPg.setRent(updatedPg.getRent());
		existingPg.setRent(updatedPg.getRent());
		existingPg.setAvailable(updatedPg.isAvailable());
		return repo.save(existingPg);
	}
}
