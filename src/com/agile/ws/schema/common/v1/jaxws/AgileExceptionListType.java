
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileExceptionListType
 *                 contains a list of exceptions of type
 *                 AgileExceptionType.                @id
 *                 -  A string referring to the identification element of
 *                 the                                      Agile exception
 *                 list. For batched request the request index
 *                 number is used to group the exceptions (e.g if there are
 *                 two requests           and the first one throws
 *                 exceptions then the id is equal to "0")
 *                 @exception           -  A set of exceptions, all of
 *                 which are of type AgileExceptionType
 *                 Details of the actual exceptions are enlisted within
 *                 these                                     elements.             
 * 
 * <p>Java class for AgileExceptionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExceptionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exception" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileExceptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileExceptionListType", propOrder = {
    "id",
    "exception"
})
public class AgileExceptionListType {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected List<AgileExceptionType> exception;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileExceptionType }
     * 
     * 
     */
    public List<AgileExceptionType> getException() {
        if (exception == null) {
            exception = new ArrayList<AgileExceptionType>();
        }
        return this.exception;
    }

}
