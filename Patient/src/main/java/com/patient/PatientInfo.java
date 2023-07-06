package com.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private String Contact_details;
	
	private String address;
	
	private String pincode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_details() {
		return Contact_details;
	}

	public void setContact_details(String contact_details) {
		Contact_details = contact_details;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "PatientInfo [id=" + id + ", name=" + name + ", Contact_details=" + Contact_details + ", address="
				+ address + ", pincode=" + pincode + "]";
	}

	public PatientInfo(int id, String name, String contact_details, String address, String pincode) {
		super();
		this.id = id;
		this.name = name;
		Contact_details = contact_details;
		this.address = address;
		this.pincode = pincode;
	}

	public PatientInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
		
	
	
	
	

}
