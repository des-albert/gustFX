
package com.agile.ws.schema.business.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              Response object for
 *                 'getMyAssignments' operation.
 *                 @name               - Name of the thumbnail image.
 *                 @iconType           - Flag to indicate whether the
 *                 thumnail is icon type or not.    @bigThumbnail       -
 *                 Big Thumbnail url.    @mediumThumbnail    - Medium
 *                 Thumbnail url.    @smallThumbnail     - Small Thumbnail
 *                 url.             
 * 
 * <p>Java class for AgileThumbnailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileThumbnailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iconType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bigThumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediumThumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smallThumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileThumbnailData", propOrder = {
    "name",
    "iconType",
    "bigThumbnail",
    "mediumThumbnail",
    "smallThumbnail"
})
public class AgileThumbnailData {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean iconType;
    @XmlElement(required = true, nillable = true)
    protected String bigThumbnail;
    @XmlElement(required = true, nillable = true)
    protected String mediumThumbnail;
    @XmlElement(required = true, nillable = true)
    protected String smallThumbnail;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the iconType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIconType() {
        return iconType;
    }

    /**
     * Sets the value of the iconType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIconType(Boolean value) {
        this.iconType = value;
    }

    /**
     * Gets the value of the bigThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigThumbnail() {
        return bigThumbnail;
    }

    /**
     * Sets the value of the bigThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigThumbnail(String value) {
        this.bigThumbnail = value;
    }

    /**
     * Gets the value of the mediumThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumThumbnail() {
        return mediumThumbnail;
    }

    /**
     * Sets the value of the mediumThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumThumbnail(String value) {
        this.mediumThumbnail = value;
    }

    /**
     * Gets the value of the smallThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    /**
     * Sets the value of the smallThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallThumbnail(String value) {
        this.smallThumbnail = value;
    }

}
