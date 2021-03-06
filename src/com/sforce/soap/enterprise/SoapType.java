package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum SoapType {


  
	/**
	 * Enumeration  : ID
	 */
	ID("tns:ID"),

  
	/**
	 * Enumeration  : base64Binary
	 */
	base64Binary("xsd:base64Binary"),

  
	/**
	 * Enumeration  : _boolean
	 */
	_boolean("xsd:boolean"),

  
	/**
	 * Enumeration  : _double
	 */
	_double("xsd:double"),

  
	/**
	 * Enumeration  : _int
	 */
	_int("xsd:int"),

  
	/**
	 * Enumeration  : string
	 */
	string("xsd:string"),

  
	/**
	 * Enumeration  : date
	 */
	date("xsd:date"),

  
	/**
	 * Enumeration  : dateTime
	 */
	dateTime("xsd:dateTime"),

  
	/**
	 * Enumeration  : time
	 */
	time("xsd:time"),

  
	/**
	 * Enumeration  : location
	 */
	location("tns:location"),

  
	/**
	 * Enumeration  : address
	 */
	address("tns:address"),

  
	/**
	 * Enumeration  : anyType
	 */
	anyType("xsd:anyType"),

  
	/**
	 * Enumeration  : RelationshipReferenceTo
	 */
	RelationshipReferenceTo("urn:RelationshipReferenceTo"),

  
	/**
	 * Enumeration  : JunctionIdListNames
	 */
	JunctionIdListNames("urn:JunctionIdListNames"),

  
	/**
	 * Enumeration  : SearchLayoutFieldsDisplayed
	 */
	SearchLayoutFieldsDisplayed("urn:SearchLayoutFieldsDisplayed"),

  
	/**
	 * Enumeration  : SearchLayoutField
	 */
	SearchLayoutField("urn:SearchLayoutField"),

  
	/**
	 * Enumeration  : SearchLayoutButtonsDisplayed
	 */
	SearchLayoutButtonsDisplayed("urn:SearchLayoutButtonsDisplayed"),

  
	/**
	 * Enumeration  : SearchLayoutButton
	 */
	SearchLayoutButton("urn:SearchLayoutButton"),

  
	/**
	 * Enumeration  : RecordTypesSupported
	 */
	RecordTypesSupported("urn:RecordTypesSupported"),

  
	/**
	 * Enumeration  : StringList
	 */
	StringList("tns:StringList"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SoapType e : EnumSet.allOf(SoapType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SoapType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
