
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINS_NONE_OF"/>
 *     &lt;enumeration value="CONTAINS_ANY_WORD"/>
 *     &lt;enumeration value="CONTAINS_ALL_WORDS"/>
 *     &lt;enumeration value="CONTAINS_PHRASE"/>
 *     &lt;enumeration value="ISNOTNULL"/>
 *     &lt;enumeration value="ISNULL"/>
 *     &lt;enumeration value="NOTCONTAINS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="NOTSTARTSWITH"/>
 *     &lt;enumeration value="STARTSWITH"/>
 *     &lt;enumeration value="NOTLIKE"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="NEQ"/>
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NOOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorsType")
@XmlEnum
public enum OperatorsType {

    CONTAINS_NONE_OF,
    CONTAINS_ANY_WORD,
    CONTAINS_ALL_WORDS,
    CONTAINS_PHRASE,
    ISNOTNULL,
    ISNULL,
    NOTCONTAINS,
    CONTAINS,
    NOTSTARTSWITH,
    STARTSWITH,
    NOTLIKE,
    LIKE,
    LE,
    LT,
    GE,
    GT,
    NEQ,
    EQ,
    NOOP;

    public String value() {
        return name();
    }

    public static OperatorsType fromValue(String v) {
        return valueOf(v);
    }

}
