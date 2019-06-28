
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *              Response object for
 *                 'getThumbnail' operation.
 *                 @thumbnailData -  Details of thumbnail of each agile
 *                 object.             
 * 
 * <p>Java class for AgileGetThumbnailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetThumbnailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thumbnailData" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileThumbnailData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileGetThumbnailResponse", propOrder = {
    "thumbnailData"
})
public class AgileGetThumbnailResponse {

    protected List<AgileThumbnailData> thumbnailData;

    /**
     * Gets the value of the thumbnailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thumbnailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThumbnailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileThumbnailData }
     * 
     * 
     */
    public List<AgileThumbnailData> getThumbnailData() {
        if (thumbnailData == null) {
            thumbnailData = new ArrayList<AgileThumbnailData>();
        }
        return this.thumbnailData;
    }

}
