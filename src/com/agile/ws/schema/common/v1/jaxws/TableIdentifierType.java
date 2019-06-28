
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              TableIdentifierType defines
 *                 a table in the Agile PLM system using relevant details
 *                 viz. tableId, corresponding classID, className, objectId
 *                 etc. It's used as part of    relevant response objects.
 *                 @classId             -  The classId of the the Agile
 *                 object whose table is referred in
 *                 tableID/tableName.             @className           -
 *                 The className of the Agile object whose table is
 *                 referred in
 *                 tableID/tableName.             @objectId            -
 *                 The unique object identification id as maintained by the
 *                 Agile                                     system for
 *                 each object.             @objectName          -  The
 *                 name of the Object whose table is defined by
 *                 TableIdentifierType.             @tableId             -
 *                 Each table of an Agile object has a unique
 *                 identification number,
 *                 using which the table is identified in the Agile system.
 *                 @tableName           -  Refers to the API name of the
 *                 table in the Agile system.
 *                 @tableDisplayName    -  Refers to the display name of
 *                 the table defined by TableIdentifierType.              
 * 
 * <p>Java class for TableIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableIdentifierType", propOrder = {
    "classId",
    "className",
    "objectId",
    "objectName",
    "tableId",
    "tableName",
    "tableDisplayName"
})
public class TableIdentifierType {

    @XmlElement(nillable = true)
    protected Integer classId;
    @XmlElement(nillable = true)
    protected String className;
    @XmlElement(nillable = true)
    protected Integer objectId;
    @XmlElement(nillable = true)
    protected String objectName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer tableId;
    @XmlElement(required = true, nillable = true)
    protected String tableName;
    @XmlElement(nillable = true)
    protected String tableDisplayName;

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassId(Integer value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the tableId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTableId(Integer value) {
        this.tableId = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the tableDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDisplayName() {
        return tableDisplayName;
    }

    /**
     * Sets the value of the tableDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDisplayName(String value) {
        this.tableDisplayName = value;
    }

}
