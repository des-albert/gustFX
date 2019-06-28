
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'commentROObject' operation. It contains an array
 *                 of requests named commentRObjectRequest to support batch
 *                 operations.                 @commentRObjectRequest -  An
 *                 array of requests of type
 *                 AgileCommentRObjectRequestType.
 *                 Details of the object to be commented by the webservice
 *                 are specified in these requests.    
 * 
 * <p>Java class for CommentRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="commentRObjectRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileCommentRObjectRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentRObjectRequestType", propOrder = {
    "commentRObjectRequest"
})
public class CommentRObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileCommentRObjectRequestType> commentRObjectRequest;

    /**
     * Gets the value of the commentRObjectRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentRObjectRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentRObjectRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileCommentRObjectRequestType }
     * 
     * 
     */
    public List<AgileCommentRObjectRequestType> getCommentRObjectRequest() {
        if (commentRObjectRequest == null) {
            commentRObjectRequest = new ArrayList<AgileCommentRObjectRequestType>();
        }
        return this.commentRObjectRequest;
    }

}
