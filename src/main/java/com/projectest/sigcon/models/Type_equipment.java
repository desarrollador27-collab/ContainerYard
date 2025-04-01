package com.projectest.sigcon.models;

public enum Type_equipment{
	DRY_VAN("DRY VAN"),
	HIGH_CUBE("HIGH CUBE"),
	HIGH_CUBE_REFORCE("HIGH CUBE REFORCE"),
	REEFER("REEFER"),
	OPEN_TOP("OPEN TOP"),
	FLAT_RACK("FLAT RACK");
	
	private String displayName;
	
	Type_equipment(String displayName){this.displayName = displayName;}
	
	public String getDisplayName() {return displayName;}
}