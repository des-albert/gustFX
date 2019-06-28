
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 *              Request object for
 *                 addFileAttachment operation.             @name
 *                 -  Refers to the name of file to be added to the
 *                 attachment                                  tab of the
 *                 Agile Object. The corresponding file type for
 *                 this attachment is derived from the file extension
 *                 provided                                  in the file
 *                 name.             @description      -  Refers to the
 *                 description of file to be added to the
 *                 attachment tab of Agile Object.             @content
 *                 -  Refers to the content of file to be added to
 *                 attachment                                  tab of the
 *                 Agile Object. This content should be specified
 *                 as an array of bytes.     @contentId    -  This refers
 *                 to the content id of the SOAP attachment. The
 *                 content of the file to be added can be sent as SOAP
 *                 attachment.                      @unzip            -
 *                 Set this to "true" if the input is a zip file
 *                 and if the                                   unzipped
 *                 content of the same is desired in the response.    
 * 
 * <p>Java class for AgileAddFileAttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAddFileAttachmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unzip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileAddFileAttachmentRequestType", propOrder = {
    "name",
    "description",
    "content",
    "contentId",
    "unzip"
})
public class AgileAddFileAttachmentRequestType {

    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler content;
    @XmlElement(nillable = true)
    protected String contentId;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean unzip;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setContent(DataHandler value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentId(String value) {
        this.contentId = value;
    }

    /**
     * Gets the value of the unzip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnzip() {
        return unzip;
    }

    /**
     * Sets the value of the unzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnzip(Boolean value) {
        this.unzip = value;
    }

}
