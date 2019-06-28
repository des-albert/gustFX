
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for
 *                 getFileFF operation.                 @folderNumber     -
 *                 Refers to the number of the Agile Folder Object.
 *                 @folderVersion    -  Refers to the version of the Agile
 *                 Folder Object.             @files            -  Contains
 *                 information about the files which were downloaded
 *                 from the specified Agile Folder Object using the web
 *                 service.    @outputParameters -  Optional name,value
 *                 pair for addressing future requirements.    
 * 
 * <p>Java class for AgileGetFileFFResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetFileFFResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folderVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="files" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileFileAttachmentResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileGetFileFFResponse", propOrder = {
    "folderNumber",
    "folderVersion",
    "files",
    "outputParameters"
})
public class AgileGetFileFFResponse {

    @XmlElement(required = true, nillable = true)
    protected String folderNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer folderVersion;
    @XmlElement(nillable = true)
    protected List<AgileFileAttachmentResponseType> files;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

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
     * {@link AgileFileAttachmentResponseType }
     * 
     * 
     */
    public List<AgileFileAttachmentResponseType> getFiles() {
        if (files == null) {
            files = new ArrayList<AgileFileAttachmentResponseType>();
        }
        return this.files;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
