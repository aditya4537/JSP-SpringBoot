package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="mobile")
public class MobileData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imei")
	private int imei;
	
	@Column(name="model")
	private String name;
	
	@Column(name="company")
	private String company;
	
	@Column(name="CameraMegaPixel")
	private int campix;

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCampix() {
		return campix;
	}

	public void setCampix(int campix) {
		this.campix = campix;
	}

	@Override
	public String toString() {
		return "MobileData [imei=" + imei + ", name=" + name + ", company=" + company + ", campix=" + campix + "]";
	}
	
	
}
