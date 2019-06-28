
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_common_site_"/>
 *     &lt;enumeration value="_all_sites_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteType")
@XmlEnum
public enum SiteType {

    @XmlEnumValue("_common_site_")
    COMMON_SITE("_common_site_"),
    @XmlEnumValue("_all_sites_")
    ALL_SITES("_all_sites_");
    private final String value;

    SiteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteType fromValue(String v) {
        for (SiteType c: SiteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
