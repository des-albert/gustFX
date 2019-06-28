
package com.agile.ws.schema.attachment.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              This request type is used to
 *                 set the Row Id of a file present in attachment
 *                 tab of Agile object                 @rowId          -
 *                 Refers to row ID of the attachment row in attachment tab
 *                 of an Agile object                         @files
 *                 -  Is used to get individual files from a row containing
 *                 multiple files.                       If the files
 *                 element is not specified then all the files under the
 *                 row                                 is downloaded.                
 * 
 * <p>Java class for AgileFileAttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileFileAttachmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="files" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileGetFileRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileFileAttachmentRequestType", propOrder = {
    "rowId",
    "files"
})
public class AgileFileAttachmentRequestType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rowId;
    @XmlElement(nillable = true)
    protected AgileGetFileRequestType files;

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
     *     {@link AgileGetFileRequestType }
     *     
     */
    public AgileGetFileRequestType getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileGetFileRequestType }
     *     
     */
    public void setFiles(AgileGetFileRequestType value) {
        this.files = value;
    }

}
