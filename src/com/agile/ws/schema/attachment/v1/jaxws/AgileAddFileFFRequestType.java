
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *                 Each of the batched
 *                 requests for the AddFileFF operation are of this type.
 *                 This request establishes the necessary details for the
 *                 file that has to be              added based on the
 *                 specifications of the parent folder containing the
 *                 attachment             and the actual file(s) to be
 *                 added to that folder.                 @folderNumber
 *                 -  Refers to unique number of the Agile Folder Object
 *                 into which.                                   the new
 *                 attachment will be added under the Files tab of that
 *                 particular Agile Folder Object
 *                 @files             -  A set of files containing
 *                 information about their actual file
 *                 content and the corresponding file names. These files
 *                 will be                                   added to the
 *                 Agile folder Object specified in the request.
 *                 @fileRefs          -  Refers to information about the
 *                 file reference to be added
 *                 to files tab of an File Folder Object. Used when file
 *                 has            already been uploaded into DFM.
 *                 @urls              -  Refers to information about the
 *                 url to be added to attachment
 *                 tab of an Agile Object.    @inputParameters -  Optional
 *                 name,value pair for addressing future requirements.             
 * 
 * <p>Java class for AgileAddFileFFRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAddFileFFRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="files" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AddFileFFType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileRefs" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AddFileReferenceFFType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urls" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AddUrlFFType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileAddFileFFRequestType", propOrder = {
    "folderNumber",
    "files",
    "fileRefs",
    "urls",
    "inputParameters"
})
public class AgileAddFileFFRequestType {

    @XmlElement(required = true, nillable = true)
    protected String folderNumber;
    @XmlElement(nillable = true)
    protected List<AddFileFFType> files;
    @XmlElement(nillable = true)
    protected List<AddFileReferenceFFType> fileRefs;
    @XmlElement(nillable = true)
    protected List<AddUrlFFType> urls;
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
     * {@link AddFileFFType }
     * 
     * 
     */
    public List<AddFileFFType> getFiles() {
        if (files == null) {
            files = new ArrayList<AddFileFFType>();
        }
        return this.files;
    }

    /**
     * Gets the value of the fileRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddFileReferenceFFType }
     * 
     * 
     */
    public List<AddFileReferenceFFType> getFileRefs() {
        if (fileRefs == null) {
            fileRefs = new ArrayList<AddFileReferenceFFType>();
        }
        return this.fileRefs;
    }

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddUrlFFType }
     * 
     * 
     */
    public List<AddUrlFFType> getUrls() {
        if (urls == null) {
            urls = new ArrayList<AddUrlFFType>();
        }
        return this.urls;
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
