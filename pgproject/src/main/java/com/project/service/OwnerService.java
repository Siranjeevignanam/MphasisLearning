package com.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Owner;
import com.project.model.Pg;
import com.project.repository.OwnerRepository;

@Service
public class OwnerService {

@Autowired
OwnerRepository repository;

public Owner getOwnerById(Long long1) {
    return repository.findById(long1).orElseThrow(() -> new RuntimeException("Owner not found"));
}

public void addOwner(Owner owner)
{
	
		repository.save(owner);
	
	
}
}
