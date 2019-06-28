
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="PARTIAL_SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="RETRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseStatusCode")
@XmlEnum
public enum ResponseStatusCode {

    SUCCESS,
    PARTIAL_SUCCESS,
    FAILURE,
    WARNING,
    RETRY;

    public String value() {
        return name();
    }

    public static ResponseStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
