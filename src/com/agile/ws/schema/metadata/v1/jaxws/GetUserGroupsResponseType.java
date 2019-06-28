
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;
import com.agile.ws.schema.common.v1.jaxws.AgileUserGroupType;


/**
 *              Response object for
 *                 'getUsers' operation. It contains an element
 *                 holding an array of responses.
 *                 @usergroups        -  An array of usergroups of type
 *                 AgileUserGroupType, retrieved
 *                 by the 'getUserGroups' webservice operation.           
 * 
 * <p>Java class for GetUserGroupsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserGroupsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="usergroups" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserGroupsResponseType", propOrder = {
    "usergroups"
})
public class GetUserGroupsResponseType
    extends AbstractResponseType
{

    protected List<AgileUserGroupType> usergroups;

    /**
     * Gets the value of the usergroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usergroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsergroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserGroupType }
     * 
     * 
     */
    public List<AgileUserGroupType> getUsergroups() {
        if (usergroups == null) {
            usergroups = new ArrayList<AgileUserGroupType>();
        }
        return this.usergroups;
    }

}
