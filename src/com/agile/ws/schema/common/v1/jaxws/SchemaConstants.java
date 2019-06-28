
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemaConstants.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemaConstants">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="attributeId"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="revision"/>
 *     &lt;enumeration value="site"/>
 *     &lt;enumeration value="returnUpdatedObject"/>
 *     &lt;enumeration value="manufacturer_name"/>
 *     &lt;enumeration value="redline_change"/>
 *     &lt;enumeration value="program_template"/>
 *     &lt;enumeration value="updateExistingObject"/>
 *     &lt;enumeration value="folderVersion"/>
 *     &lt;enumeration value="queryResultsMaxSize"/>
 *     &lt;enumeration value="queryOnlyLatestVersions"/>
 *     &lt;enumeration value="acceptNewRevision"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchemaConstants")
@XmlEnum
public enum SchemaConstants {

    @XmlEnumValue("attributeId")
    ATTRIBUTE_ID("attributeId"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("revision")
    REVISION("revision"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("returnUpdatedObject")
    RETURN_UPDATED_OBJECT("returnUpdatedObject"),
    @XmlEnumValue("manufacturer_name")
    MANUFACTURER_NAME("manufacturer_name"),
    @XmlEnumValue("redline_change")
    REDLINE_CHANGE("redline_change"),
    @XmlEnumValue("program_template")
    PROGRAM_TEMPLATE("program_template"),
    @XmlEnumValue("updateExistingObject")
    UPDATE_EXISTING_OBJECT("updateExistingObject"),
    @XmlEnumValue("folderVersion")
    FOLDER_VERSION("folderVersion"),
    @XmlEnumValue("queryResultsMaxSize")
    QUERY_RESULTS_MAX_SIZE("queryResultsMaxSize"),
    @XmlEnumValue("queryOnlyLatestVersions")
    QUERY_ONLY_LATEST_VERSIONS("queryOnlyLatestVersions"),
    @XmlEnumValue("acceptNewRevision")
    ACCEPT_NEW_REVISION("acceptNewRevision");
    private final String value;

    SchemaConstants(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemaConstants fromValue(String v) {
        for (SchemaConstants c: SchemaConstants.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
