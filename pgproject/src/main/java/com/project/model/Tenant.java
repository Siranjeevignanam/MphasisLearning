package com.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tenant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long tenantId;
private String name;
private String email;
private String mobile;
private Integer age;

@ManyToOne
@JoinColumn(name="pg_id")
private Pg pg;


public Pg getPg() {
	return pg;
}
public void setPg(Pg pg) {
	this.pg = pg;
}
public Long getTenantId() {
	return tenantId;
}
public void setTenantId(Long tenantId) {
	this.tenantId = tenantId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}



public Tenant(Long tenantId, String name, String email, String mobile, Integer age, Pg pg) {
	super();
	this.tenantId = tenantId;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.age = age;
	this.pg = pg;
}
public Tenant()
{
	
}
}
