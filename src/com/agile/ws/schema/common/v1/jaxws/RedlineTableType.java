
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedlineTableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedlineTableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TABLE_REDLINETITLEBLOCK"/>
 *     &lt;enumeration value="TABLE_REDLINEPAGETWO"/>
 *     &lt;enumeration value="TABLE_REDLINEPAGETHREE"/>
 *     &lt;enumeration value="TABLE_REDLINEBOM"/>
 *     &lt;enumeration value="TABLE_REDLINEMANUFACTURERS"/>
 *     &lt;enumeration value="TABLE_REDLINEPRICELINES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RedlineTableType")
@XmlEnum
public enum RedlineTableType {

    TABLE_REDLINETITLEBLOCK,
    TABLE_REDLINEPAGETWO,
    TABLE_REDLINEPAGETHREE,
    TABLE_REDLINEBOM,
    TABLE_REDLINEMANUFACTURERS,
    TABLE_REDLINEPRICELINES;

    public String value() {
        return name();
    }

    public static RedlineTableType fromValue(String v) {
        return valueOf(v);
    }

}
