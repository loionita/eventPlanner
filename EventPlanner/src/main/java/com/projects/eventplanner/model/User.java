package com.projects.eventplanner.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@NotEmpty
	@Column(name = "FIRSTNAME")
	private String firstName;

	@NotEmpty
	@Column(name = "LASTNAME")
	private String lastName;

	@NotEmpty
	@Column(unique = true, name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	@NotEmpty
	@Enumerated(EnumType.STRING)
	@Column(name = "PLANNING_TYPE")
	private List<PlanningType> planningType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<PlanningType> getPlanningType() {
		return planningType;
	}

	public void setPlanningType(List<PlanningType> planningType) {
		this.planningType = planningType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
