package com.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Pg {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pg_id")
	private Long pgId;
	
	@NotBlank
	private String name;
	@NotBlank
	private String city;
	@NotBlank
	private String locality;
	@NotNull
	private Integer rent;
	@NotNull
	private Boolean available;
	
	@OneToMany(mappedBy="pg")
	List<Tenant> tenants;
	
	
	public Boolean isAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="owner_id")
	private Owner owner;

	public Long getPgId() {
		return pgId;
	}

	public void setPgId(Long pgId) {
		this.pgId = pgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Integer getRent() {
		return rent;
	}

	public void setRent(Integer rent) {
		this.rent = rent;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	
	public Pg(Long pgId, String name, String city, String locality, Integer rent,Boolean available, Owner owner) {
		super();
		this.pgId = pgId;
		this.name = name;
		this.city = city;
		this.locality = locality;
		this.rent = rent;
		this.available = available;
		this.owner = owner;
	}

	public Pg() {
		// TODO Auto-generated constructor stub
	}

	
}
