package com.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pg {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pg_id")
	private Long pgId;
	private String name;
	private String city;
	private String locality;
	private int rent;
	private boolean available;
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@ManyToOne
	@JsonIgnore
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

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	
	public Pg(Long pgId, String name, String city, String locality, int rent, boolean available, Owner owner) {
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
