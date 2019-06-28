
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 *              AddFileFFType defines any
 *                 file that will be used for adding into the Agile system
 *                 using             the AddFileFF service.
 *                 @fileName        -  This element represents the file
 *                 name of the attachment will be
 *                 added to a File Folder using the web service.
 *                 @fileContent     -  The actual information present in
 *                 the file, whose content is to be
 *                 added to a File Folder using the web service. The
 *                 content is                                  represented
 *                 as an array of bytes.     @contentId   -  This refers to
 *                 the content id of the SOAP attachment. The content of
 *                 the file to be added can be sent as SOAP attachment.
 *                 @description     -  The description of the new
 *                 attachment that is to be added to the
 *                 File Folder object.             @unzip           -  Set
 *                 this to "true" if the input file Content is a
 *                 zipped file and if it         is desired to add the
 *                 unzipped content of the same into the File Folder.             
 * 
 * <p>Java class for AddFileFFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFileFFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AddFileFFType", propOrder = {
    "fileName",
    "fileContent",
    "contentId",
    "description",
    "unzip"
})
public class AddFileFFType {

    @XmlElement(required = true, nillable = true)
    protected String fileName;
    @XmlElement(nillable = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileContent;
    @XmlElement(nillable = true)
    protected String contentId;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    protected Boolean unzip;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFileContent(DataHandler value) {
        this.fileContent = value;
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
