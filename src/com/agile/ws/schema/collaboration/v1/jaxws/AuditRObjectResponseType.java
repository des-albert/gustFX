
package com.agile.ws.schema.collaboration.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for the
 *                 audit routable operation webservice. It contains an
 *                 element             'response' holding an array of
 *                 responses. Header exceptions will be filled for audit
 *                 exceptions while header warnings will be filled for
 *                 audit warnings.
 *                 @response           -  An array of responses of type
 *                 AgileAuditRObjectResponseType   
 * 
 * <p>Java class for AuditRObjectResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditRObjectResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileAuditRObjectResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditRObjectResponseType", propOrder = {
    "response"
})
public class AuditRObjectResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected AgileAuditRObjectResponseType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link AgileAuditRObjectResponseType }
     *     
     */
    public AgileAuditRObjectResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileAuditRObjectResponseType }
     *     
     */
    public void setResponse(AgileAuditRObjectResponseType value) {
        this.response = value;
    }

}
