package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum SoqlOperator {


  
	/**
	 * Enumeration  : equals
	 */
	equals("equals"),

  
	/**
	 * Enumeration  : excludes
	 */
	excludes("excludes"),

  
	/**
	 * Enumeration  : greaterThan
	 */
	greaterThan("greaterThan"),

  
	/**
	 * Enumeration  : greaterThanOrEqualTo
	 */
	greaterThanOrEqualTo("greaterThanOrEqualTo"),

  
	/**
	 * Enumeration  : in
	 */
	in("in"),

  
	/**
	 * Enumeration  : includes
	 */
	includes("includes"),

  
	/**
	 * Enumeration  : lessThan
	 */
	lessThan("lessThan"),

  
	/**
	 * Enumeration  : lessThanOrEqualTo
	 */
	lessThanOrEqualTo("lessThanOrEqualTo"),

  
	/**
	 * Enumeration  : like
	 */
	like("like"),

  
	/**
	 * Enumeration  : notEquals
	 */
	notEquals("notEquals"),

  
	/**
	 * Enumeration  : notIn
	 */
	notIn("notIn"),

  
	/**
	 * Enumeration  : within
	 */
	within("within"),

  
	/**
	 * Enumeration  : notLike
	 */
	notLike("notLike"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SoqlOperator e : EnumSet.allOf(SoqlOperator.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SoqlOperator(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
