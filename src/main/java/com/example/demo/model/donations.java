package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="donations")
public class donations {
	
	@Id
	@GeneratedValue
	private long dnid;
	@Column(name="type", nullable=false)
	private String type;
	
	public donations() {
		super();
	}

	public donations(long dnid, String type) {
		super();
		this.dnid = dnid;
		this.type = type;
	}

	public long getDnid() {
		return dnid;
	}

	public void setDnid(long dnid) {
		this.dnid = dnid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
