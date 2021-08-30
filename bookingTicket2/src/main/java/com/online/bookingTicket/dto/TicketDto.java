package com.online.bookingTicket.dto;

import java.io.Serializable;
import java.util.Date;


public class TicketDto implements Serializable{
	
	private int id;
	private String from;
	private String to;
	private Date travelDate;
	private double price;
	private int passengersCount;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
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
		return "TicketDto [id=" + id + ", from=" + from + ", to=" + to + ", travelDate=" + travelDate + ", price="
				+ price + ", passengersCount=" + passengersCount + ", status=" + status + "]";
	}

}
