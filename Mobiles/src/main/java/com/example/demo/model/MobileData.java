package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
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
	private int CamPix;

	@Override
	public String toString() {
		return "MobileData [imei=" + imei + ", name=" + name + ", company=" + company + ", CamPix=" + CamPix + "]";
	}
	
	
}
