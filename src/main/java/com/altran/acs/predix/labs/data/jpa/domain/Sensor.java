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
    
	private Date tmStmp;	
	private String name;
	private Double val;
	
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

	public Date getTmStmp() {
		return tmStmp;
	}
	public void setTmStmp(Date tmStmp) {
		this.tmStmp = tmStmp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double value) {
		this.val = value;
	}
}
