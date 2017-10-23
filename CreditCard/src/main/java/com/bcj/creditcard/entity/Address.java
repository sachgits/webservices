package com.bcj.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Address {

	
	@Id
	@GeneratedValue
	private int Id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	
	
	
	@Override
	public String toString() {
		return "Address [cId=" + Id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}
	public Address() {
		super();
	}
	public int getcId() {
		return Id;
	}
	public void setcId(int cId) {
		this.Id = cId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}	
	
	
}
