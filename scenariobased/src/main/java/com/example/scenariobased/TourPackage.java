package com.example.scenariobased;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TourPackage {
	
	@Id
	private String package_id;
	private String source;
	private String destination;
	private double basic_fare;
	
	public TourPackage() {
		super();
	}

	public TourPackage(String package_id, String source, String destination, double basic_fare) {
		super();
		this.package_id = package_id;
		this.source = source;
		this.destination = destination;
		this.basic_fare = basic_fare;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getBasic_fare() {
		return basic_fare;
	}

	public void setBasic_fare(double basic_fare) {
		this.basic_fare = basic_fare;
	}

	@Override
	public String toString() {
		return "TourPackage [package_id=" + package_id + ", source=" + source + ", destination=" + destination
				+ ", basic_fare=" + basic_fare + "]";
	}
}
