
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgileWarningResolutionConstantsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgileWarningResolutionConstantsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="ENABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgileWarningResolutionConstantsType")
@XmlEnum
public enum AgileWarningResolutionConstantsType {

    DISABLE,
    ENABLE;

    public String value() {
        return name();
    }

    public static AgileWarningResolutionConstantsType fromValue(String v) {
        return valueOf(v);
    }

}
