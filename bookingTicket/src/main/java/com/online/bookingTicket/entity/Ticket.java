package com.online.bookingTicket.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ticket_details")
public class Ticket implements Serializable {
	
	@Id
	@GenericGenerator(name="m_auto", strategy="increment")
	@GeneratedValue(generator="m_auto")
	@Column(name = "id")
	private int id;
	
	@Column(name = "from_place")
	private String fromPlace;
	
	@Column(name = "to_place")
	private String toPlace;
	
	@Column(name = "Travel_date")
	private String travelDate;
	
	@Column(name = "Price")
	private double price;
	
	
	@Column(name = "Passengers_count")
	private int passengersCount;
	
	@Column(name = "travel_Status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPassengersCount() {
		return passengersCount;
	}

	public void setPassengersCount(int passengersCount) {
		this.passengersCount = passengersCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", travelDate=" + travelDate
				+ ", price=" + price + ", passengersCount=" + passengersCount + ", status=" + status + "]";
	}
	
	
	
	

}
