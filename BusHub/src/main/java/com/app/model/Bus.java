package com.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table
public class Bus {
	@Id
	@GeneratedValue
	private int busId;
	private String busName;
	private String busSource;
	private String busDestination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date busOnBoardDate;
	private double busPrice;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date busArrivalDate;
	private String busType;
	private String busStatus;
}
