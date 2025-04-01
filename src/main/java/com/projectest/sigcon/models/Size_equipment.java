package com.projectest.sigcon.models;

public enum Size_equipment{
    TWENTY_FOOT("20 feet"),
    FORTY_FOOT("40 feet");
	
	private String displayName;
	
	Size_equipment(String displayName){this.displayName = displayName;}
	
	public String getDisplayName() {return displayName;}
}