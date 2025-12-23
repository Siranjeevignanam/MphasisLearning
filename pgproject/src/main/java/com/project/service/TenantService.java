package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Tenant;
import com.project.repository.TenantRepository;

@Service
public class TenantService {

	@Autowired
	TenantRepository repo;
	
	public void addTenant(Tenant tenant)
	{
		 repo.save(tenant);
	}
	
	public List<Tenant> getTenantsById(Long id)
	{
		return repo.findTenantByPg_pgId(id);
	}
}
