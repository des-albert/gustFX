
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Request object for checkInFF
 *                 operation.                 @folderNumber     -  Refers
 *                 to the number of the Agile Folder Object containing
 *                 the file that has to be checked in.             @file
 *                 -  Refers to the file that has to be checked in.
 *                 @fileRef          -  Refers to the file refernce that
 *                 has to be checked in.
 *                 This file should already be uploaded into the DFM.
 *                 @inputParameters -  Optional name,value pair for
 *                 addressing future requirements.       
 * 
 * <p>Java class for AgileCheckInFFRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCheckInFFRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="file" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}CheckInFileFFType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileRef" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}CheckInFileRefFFType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileCheckInFFRequest", propOrder = {
    "folderNumber",
    "file",
    "fileRef",
    "inputParameters"
})
public class AgileCheckInFFRequest {

    @XmlElement(required = true, nillable = true)
    protected String folderNumber;
    @XmlElement(nillable = true)
    protected List<CheckInFileFFType> file;
    @XmlElement(nillable = true)
    protected List<CheckInFileRefFFType> fileRef;
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
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInFileFFType }
     * 
     * 
     */
    public List<CheckInFileFFType> getFile() {
        if (file == null) {
            file = new ArrayList<CheckInFileFFType>();
        }
        return this.file;
    }

    /**
     * Gets the value of the fileRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInFileRefFFType }
     * 
     * 
     */
    public List<CheckInFileRefFFType> getFileRef() {
        if (fileRef == null) {
            fileRef = new ArrayList<CheckInFileRefFFType>();
        }
        return this.fileRef;
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
