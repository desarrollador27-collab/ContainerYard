package com.projectest.sigcon.models;

public enum State_equipment{
	DAMAGED("DAMAGED"),
	DIRTY("DIRTY"),
	GOOD("GOOD");
	
	private String displayName;
	
	State_equipment(String displayName){this.displayName = displayName;}
	
	public String getDisplayName() {return displayName;}

}