
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              This complexType defines any
 *                 file present in the attachment tab of an Agile
 *                 Object based on information about its fileId.
 *                 @rowId  - rowId of the attachment to be checked out.
 *                 @files  - Refers to the fileId of the of a file present
 *                 in the                            attachment row for a
 *                 given rowId. This should only be used
 *                 if the row contains multiple files and the requirement
 *                 is to                       get only selected files.             
 * 
 * <p>Java class for CheckOutAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckOutAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="files" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}CheckOutFilesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckOutAttachmentType", propOrder = {
    "rowId",
    "files"
})
public class CheckOutAttachmentType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rowId;
    @XmlElement(nillable = true)
    protected CheckOutFilesType files;

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
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link CheckOutFilesType }
     *     
     */
    public CheckOutFilesType getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckOutFilesType }
     *     
     */
    public void setFiles(CheckOutFilesType value) {
        this.files = value;
    }

}
