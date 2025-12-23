package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exception.PgException;
import com.project.model.Owner;
import com.project.model.Tenant;
import com.project.service.OwnerService;
import com.project.service.TenantService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	TenantService service;
	
	@Autowired
	OwnerService ownerservice;
	
	
	@PostMapping("/addtenant")
	public void addTenant(@RequestBody Tenant newTenant)
	{
		if(newTenant.getAge()>=18)
		{
			service.addTenant(newTenant);
		}
		else throw new PgException("Age should be above 18");
	}
	
	@GetMapping("/tenants/{pgid}")
	public List<Tenant> listTenantById(@PathVariable Long pgid)
	{
		return service.getTenantsById(pgid);
	}
	
	@PostMapping("/addtenant")
	public void addOwner(@RequestBody Owner newOwner)
	{
		if(newOwner.getAge()>=18)
		{
			ownerservice.addOwner(newOwner);
		}
		else throw new PgException("Age should be above 18");
	}

	
}
