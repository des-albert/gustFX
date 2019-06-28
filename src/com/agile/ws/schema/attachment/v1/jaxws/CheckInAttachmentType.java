
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 *              CheckInAttachmentType
 *                 defines any file that will be used for checking into the
 *                 Agile system using the CheckInAttachment service.
 *                 @fileId          -  In the case of multiple files
 *                 associated with a particlar rowId,
 *                 this element is used to refer to the fileId of the file
 *                 to be                                   checked in,
 *                 among the list of files associated with that rowId.
 *                 Permissible values for this field include the file Id of
 *                 the                                  attachment tab or
 *                 the rowId of the files tab of the file Folder
 *                 object associated with the same file in the attachment
 *                 tab.                                 This field is
 *                 optional.             @fileName        -  This element
 *                 represents the file name of the attachment will be
 *                 checked in using the web service. It is mandatory to
 *                 ensure that                                  the file
 *                 extension of the the file checked in matches exactly
 *                 with                                 the file extension
 *                 of the file that was checked out.    @contentId   -
 *                 This refers to the content id of the SOAP attachment.
 *                 The content of the file to be checked in can be sent as
 *                 SOAP attachment.               @fileContent     -  The
 *                 actual information present in the file, whose content is
 *                 to be                                  checked in using
 *                 the web service. The content is represented as an
 *                 array of bytes.              
 * 
 * <p>Java class for CheckInAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInAttachmentType", propOrder = {
    "fileId",
    "fileName",
    "contentId",
    "fileContent"
})
public class CheckInAttachmentType {

    @XmlElement(nillable = true)
    protected Integer fileId;
    @XmlElement(required = true, nillable = true)
    protected String fileName;
    @XmlElement(nillable = true)
    protected String contentId;
    @XmlElement(nillable = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileContent;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileId(Integer value) {
        this.fileId = value;
    }

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

}
