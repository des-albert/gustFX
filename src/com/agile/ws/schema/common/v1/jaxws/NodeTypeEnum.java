
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASS"/>
 *     &lt;enumeration value="SUBCLASS"/>
 *     &lt;enumeration value="TAB"/>
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="ATTRIBUTE"/>
 *     &lt;enumeration value="AUTONUMBER"/>
 *     &lt;enumeration value="NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NodeTypeEnum")
@XmlEnum
public enum NodeTypeEnum {

    CLASS,
    SUBCLASS,
    TAB,
    TABLE,
    ATTRIBUTE,
    AUTONUMBER,
    NODE;

    public String value() {
        return name();
    }

    public static NodeTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
