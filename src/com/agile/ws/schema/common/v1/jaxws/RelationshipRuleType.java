
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType"/>
 *         &lt;element name="controlObjectStatusID" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileStatusIdentifierType"/>
 *         &lt;element name="affectedObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType"/>
 *         &lt;element name="affectedObjectStatusID" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileStatusIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipRuleType", propOrder = {
    "controlObject",
    "controlObjectStatusID",
    "affectedObject",
    "affectedObjectStatusID"
})
public class RelationshipRuleType {

    @XmlElement(required = true, nillable = true)
    protected ObjectReferentIdType controlObject;
    @XmlElement(required = true, nillable = true)
    protected AgileStatusIdentifierType controlObjectStatusID;
    @XmlElement(required = true, nillable = true)
    protected ObjectReferentIdType affectedObject;
    @XmlElement(required = true, nillable = true)
    protected AgileStatusIdentifierType affectedObjectStatusID;

    /**
     * Gets the value of the controlObject property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public ObjectReferentIdType getControlObject() {
        return controlObject;
    }

    /**
     * Sets the value of the controlObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public void setControlObject(ObjectReferentIdType value) {
        this.controlObject = value;
    }

    /**
     * Gets the value of the controlObjectStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link AgileStatusIdentifierType }
     *     
     */
    public AgileStatusIdentifierType getControlObjectStatusID() {
        return controlObjectStatusID;
    }

    /**
     * Sets the value of the controlObjectStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileStatusIdentifierType }
     *     
     */
    public void setControlObjectStatusID(AgileStatusIdentifierType value) {
        this.controlObjectStatusID = value;
    }

    /**
     * Gets the value of the affectedObject property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public ObjectReferentIdType getAffectedObject() {
        return affectedObject;
    }

    /**
     * Sets the value of the affectedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public void setAffectedObject(ObjectReferentIdType value) {
        this.affectedObject = value;
    }

    /**
     * Gets the value of the affectedObjectStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link AgileStatusIdentifierType }
     *     
     */
    public AgileStatusIdentifierType getAffectedObjectStatusID() {
        return affectedObjectStatusID;
    }

    /**
     * Sets the value of the affectedObjectStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileStatusIdentifierType }
     *     
     */
    public void setAffectedObjectStatusID(AgileStatusIdentifierType value) {
        this.affectedObjectStatusID = value;
    }

}
