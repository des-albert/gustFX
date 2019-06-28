package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ShareAccessLevel {


  
	/**
	 * Enumeration  : Read
	 */
	Read("Read"),

  
	/**
	 * Enumeration  : Edit
	 */
	Edit("Edit"),

  
	/**
	 * Enumeration  : All
	 */
	All("All"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ShareAccessLevel e : EnumSet.allOf(ShareAccessLevel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ShareAccessLevel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
