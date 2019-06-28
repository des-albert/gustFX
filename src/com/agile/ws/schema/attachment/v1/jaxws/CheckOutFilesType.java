
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              This complexType defines any
 *                 file present in the attachment tab of an Agile
 *                 Object based on information about its fileId.
 *                 @fileId          - Refers to the fileId of the of any
 *                 file present in the
 *                 attachment tab of a given Agile Object             
 * 
 * <p>Java class for CheckOutFilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckOutFilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckOutFilesType", propOrder = {
    "fileId"
})
public class CheckOutFilesType {

    @XmlElement(required = true, nillable = true)
    protected List<Integer> fileId;

    /**
     * Gets the value of the fileId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFileId() {
        if (fileId == null) {
            fileId = new ArrayList<Integer>();
        }
        return this.fileId;
    }

}
