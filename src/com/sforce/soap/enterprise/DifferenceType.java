package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum DifferenceType {


  
	/**
	 * Enumeration  : DIFFERENT
	 */
	DIFFERENT("DIFFERENT"),

  
	/**
	 * Enumeration  : NULL
	 */
	NULL("NULL"),

  
	/**
	 * Enumeration  : SAME
	 */
	SAME("SAME"),

  
	/**
	 * Enumeration  : SIMILAR
	 */
	SIMILAR("SIMILAR"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DifferenceType e : EnumSet.allOf(DifferenceType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DifferenceType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
