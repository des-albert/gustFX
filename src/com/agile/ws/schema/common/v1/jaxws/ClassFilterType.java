
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCRETE"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="TOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassFilterType")
@XmlEnum
public enum ClassFilterType {

    CONCRETE,
    ALL,
    TOP;

    public String value() {
        return name();
    }

    public static ClassFilterType fromValue(String v) {
        return valueOf(v);
    }

}
