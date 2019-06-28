
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Request object for getFileFF
 *                 operation.                 @folderNumber     -  Refers
 *                 to the unique number of the Agile Folder Object.
 *                 @folderVersion    -  Refers to the version of the
 *                 specified Agile Folder Object.             @allFiles
 *                 -  Set this to 'true' to download all the files present
 *                 in                                   Agile Folder
 *                 Object. 'files' is ignored if this parameter
 *                 is true.    @downloadUrl      -  Boolean flag specifies
 *                 weather to download the attachment content or
 *                 return the download url for the files on the user's
 *                 preferred file server.         Default value is false.
 *                 @files            -  Refers to the file ids of files to
 *                 downloaded, among the files
 *                 present in the specified Agile Folder Object.
 *                 @inputParameters -  Optional name,value pair for
 *                 addressing future requirements.       
 * 
 * <p>Java class for AgileGetFileFFRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetFileFFRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folderVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="downloadUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="files" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileFileAttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileGetFileFFRequest", propOrder = {
    "folderNumber",
    "folderVersion",
    "allFiles",
    "downloadUrl",
    "files",
    "inputParameters"
})
public class AgileGetFileFFRequest {

    @XmlElement(required = true, nillable = true)
    protected String folderNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer folderVersion;
    @XmlElement(nillable = true)
    protected Boolean allFiles;
    @XmlElement(nillable = true)
    protected Boolean downloadUrl;
    @XmlElement(nillable = true)
    protected List<AgileFileAttachmentRequestType> files;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the folderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderNumber() {
        return folderNumber;
    }

    /**
     * Sets the value of the folderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderNumber(String value) {
        this.folderNumber = value;
    }

    /**
     * Gets the value of the folderVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderVersion() {
        return folderVersion;
    }

    /**
     * Sets the value of the folderVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderVersion(Integer value) {
        this.folderVersion = value;
    }

    /**
     * Gets the value of the allFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFiles() {
        return allFiles;
    }

    /**
     * Sets the value of the allFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFiles(Boolean value) {
        this.allFiles = value;
    }

    /**
     * Gets the value of the downloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Sets the value of the downloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadUrl(Boolean value) {
        this.downloadUrl = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileFileAttachmentRequestType }
     * 
     * 
     */
    public List<AgileFileAttachmentRequestType> getFiles() {
        if (files == null) {
            files = new ArrayList<AgileFileAttachmentRequestType>();
        }
        return this.files;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<PropertyListType>();
        }
        return this.inputParameters;
    }

}
