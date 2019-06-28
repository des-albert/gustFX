
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIMPLELIST"/>
 *     &lt;enumeration value="CASCADINGLIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListTypeEnum")
@XmlEnum
public enum ListTypeEnum {

    SIMPLELIST,
    CASCADINGLIST;

    public String value() {
        return name();
    }

    public static ListTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
