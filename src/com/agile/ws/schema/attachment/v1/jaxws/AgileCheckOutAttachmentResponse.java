
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 AgileCheckOutAttachmentResponse holds complete
 *                 information about any file             object checked
 *                 out from the Agile system using the CheckOutAttachment
 *                 service.                 @rowId            -  Refers to
 *                 the row id of the file present in attachment tab
 *                 of an Agile object             @fileId           -
 *                 Refers to FileId of the file present in attachment tab
 *                 of an                         Agile object. If multiple
 *                 files are downloaded from the same          rowId then
 *                 the fileIDs are separated by semicolon.
 *                 @fileType         -  File type represents the extension
 *                 of the file, as uploaded
 *                 into the Agile system.              @fileSize         -
 *                 Refers to the size of the file under consideration,
 *                 represented as number of bytes.             @name
 *                 -  The file name of the attachment that was checked out
 *                 @description      -  The description of the attachment
 *                 that was checked out, as
 *                 per the description used while uploading the file into
 *                 the                                   Agile system.
 *                 @content          -  The actual information present in
 *                 the file that was checked
 *                 out, represented as an array of bytes. The same can be
 *                 converted into a physical file.
 *                 @fileDownloadUrl -  Refers to the download Servlet Url
 *                 for file present in attachment
 *                 tab of an Agile object. Client can use this Url to
 *                 download the file.                       @url
 *                 -  If the content of the file is a URL, then the URL is
 *                 returned       
 * 
 * <p>Java class for AgileCheckOutAttachmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCheckOutAttachmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fileDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileCheckOutAttachmentResponse", propOrder = {
    "rowId",
    "fileId",
    "fileType",
    "fileSize",
    "name",
    "description",
    "content",
    "fileDownloadURL",
    "url"
})
public class AgileCheckOutAttachmentResponse {

    @XmlElement(nillable = true)
    protected Integer rowId;
    @XmlElement(nillable = true)
    protected String fileId;
    @XmlElement(nillable = true)
    protected String fileType;
    @XmlElement(nillable = true)
    protected Long fileSize;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler content;
    @XmlElement(nillable = true)
    protected List<String> fileDownloadURL;
    @XmlElement(nillable = true)
    protected String url;

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
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

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
     * Gets the value of the fileDownloadURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileDownloadURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileDownloadURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileDownloadURL() {
        if (fileDownloadURL == null) {
            fileDownloadURL = new ArrayList<String>();
        }
        return this.fileDownloadURL;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
