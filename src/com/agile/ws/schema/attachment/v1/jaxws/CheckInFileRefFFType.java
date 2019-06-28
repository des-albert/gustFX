
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              Defines a file to be checked
 *                 in with the CheckInFileFF operation.              @rowId
 *                 -  The row Id of the file in File Folder tab, into which
 *                 the                                   content will be
 *                 checked in.             @fileName         -  Name of the
 *                 file. This must have the same extension as
 *                 the file checked out.             @fileId           -
 *                 The fileId of the file to be checked in. This file
 *                 should                                   be already
 *                 uploaded into the DFM.    @fileSize         -  The
 *                 fileSize of the file to be checked in. This file should
 *                 be already uploaded into the DFM.             
 * 
 * <p>Java class for CheckInFileRefFFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInFileRefFFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInFileRefFFType", propOrder = {
    "rowId",
    "fileName",
    "fileId"
})
public class CheckInFileRefFFType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rowId;
    @XmlElement(required = true, nillable = true)
    protected String fileName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fileId;

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowId(Integer value) {
        this.rowId = value;
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

}
