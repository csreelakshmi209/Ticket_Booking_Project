package com.online.bookingTicket.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_details")
public class Bus implements Serializable {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "bus_timings")
	private String bus_Timings;
	
	@Column(name = "from_place")
	private String fromPlace;
	
	@Column(name = "to_place")
	private String toplace;
	
	@Column(name = "Price")
	private double price;

	

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

	public String getBus_Timings() {
		return bus_Timings;
	}

	public void setBus_Timings(String bus_Timings) {
		this.bus_Timings = bus_Timings;
	}

	

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToplace() {
		return toplace;
	}

	public void setToplace(String toplace) {
		this.toplace = toplace;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", bus_Timings=" + bus_Timings + ", fromPlace=" + fromPlace
				+ ", toplace=" + toplace + ", price=" + price + "]";
	}
	
	

	

}
