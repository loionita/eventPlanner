package com.projects.eventplanner.model;

public enum PlanningType {
	DAILY("daily"), PROFESSIONAL("professional"), TRIP("trip"), WEDDING("wedding");

	private String value;

	private PlanningType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
