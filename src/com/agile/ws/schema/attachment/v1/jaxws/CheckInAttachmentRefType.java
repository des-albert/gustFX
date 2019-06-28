
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              CheckInAttachmentType
 *                 defines any file that will be used for checking into the
 *                 Agile system using the CheckInAttachment service.
 *                 @oldFileId       -  In the case of multiple files
 *                 associated with a particlar rowId,
 *                 this element is used to refer to the fileId of the file
 *                 to be                                   checked in,
 *                 among the list of files associated with that rowId.
 *                 Permissible values for this field include the file Id of
 *                 the                                  attachment tab or
 *                 the rowId of the files tab of the file Folder
 *                 object associated with the same file in the attachment
 *                 tab.             @newFileId       -  The fileId of the
 *                 new attachment that has to be added to the
 *                 File Folder object. This file should exist in the DFM.
 *                 @fileName        -  This element represents the file
 *                 name of the attachment will be
 *                 checked in using the web service. It is mandatory to
 *                 ensure that                                  the file
 *                 extension of the the file checked in matches exactly
 *                 with                                 the file extension
 *                 of the file that was checked out.             
 * 
 * <p>Java class for CheckInAttachmentRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInAttachmentRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldFileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newFileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInAttachmentRefType", propOrder = {
    "oldFileId",
    "newFileId",
    "fileName"
})
public class CheckInAttachmentRefType {

    @XmlElement(nillable = true)
    protected Integer oldFileId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer newFileId;
    @XmlElement(required = true, nillable = true)
    protected String fileName;

    /**
     * Gets the value of the oldFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldFileId() {
        return oldFileId;
    }

    /**
     * Sets the value of the oldFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldFileId(Integer value) {
        this.oldFileId = value;
    }

    /**
     * Gets the value of the newFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewFileId() {
        return newFileId;
    }

    /**
     * Sets the value of the newFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewFileId(Integer value) {
        this.newFileId = value;
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

}
