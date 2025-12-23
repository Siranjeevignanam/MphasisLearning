package com.project.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="owner_id")
	private Long ownerId;
	
@NotBlank
	private String name;
@NotBlank
	private String mobile;
@NotBlank
	private String email;
@NotNull
	private int age;
	
	@OneToMany(mappedBy="owner")
	private List<Pg> pgList;

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Pg> getPgList() {
		return pgList;
	}

	public void setPgList(List<Pg> pgList) {
		this.pgList = pgList;
	}
	
	public Owner()
	{
		
	}

	public Owner(Long ownerId, String name, String mobile, String email, int age, List<Pg> pgList) {
		super();
		this.ownerId = ownerId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.pgList = pgList;
	}
	
	
}
