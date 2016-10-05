package com.altran.acs.predix.labs.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sensor implements Serializable {

	private static final long serialVersionUID = -8351625367255131992L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
    @NotNull
	private Long deviceId;
    
	private Date timestamp;	
	private String name;
	private Double value;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return this.timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the value
	 */
	public Double getValue() {
		return this.value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

}
