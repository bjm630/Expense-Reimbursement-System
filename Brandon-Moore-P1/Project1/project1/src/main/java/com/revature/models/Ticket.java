package com.revature.models;

import java.sql.Timestamp;

public class Ticket {

	private Integer ticketID;
	private Timestamp date;
	private String type;
	private Double cost;
	private String description;
	private String status;
	private Integer userID;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(Integer ticketID, Timestamp date, String type, Double cost, String description, String status, Integer userID) {
		super();
		this.ticketID = ticketID;
		this.type = type;
		this.date = date;
		this.cost = cost;
		this.description = description;
		this.status = status;
		this.userID = userID;
	}
	

	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", date=" + date + ", type=" + type + ", cost=" + cost
				+ ", description=" + description + ", status=" + status + ", userID=" + userID + "]";
	}

	public Integer getTicketID() {
		return ticketID;
	}

	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getuserID() {
		return userID;
	}

	public void setUser_id(Integer userID) {
		this.userID = userID;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((ticketID == null) ? 0 : ticketID.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (ticketID == null) {
			if (other.ticketID != null)
				return false;
		} else if (!ticketID.equals(other.ticketID))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
