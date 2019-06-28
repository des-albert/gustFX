
package com.agile.ws.schema.search.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileTableType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for
 *                 'executeSavedQuery' operation. It contains an element
 *                 'table' holding             details about the search
 *                 results retrieved by the web service operation.
 *                 @results           -  This contains the results of the
 *                 advanced search operation. The
 *                 results retrieved are of a type AgileTableType.
 *                 Comprehensive
 *                 information about the queried Agile entities may be
 *                 obtained                                   using this
 *                 table.    @outputParameters -  Optional name,value pair
 *                 for addressing future requirements.             
 * 
 * <p>Java class for AgileExecuteSavedQueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExecuteSavedQueryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileTableType" minOccurs="0"/>
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
@XmlType(name = "AgileExecuteSavedQueryResponseType", propOrder = {
    "results",
    "outputParameters"
})
public class AgileExecuteSavedQueryResponseType {

    protected AgileTableType results;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link AgileTableType }
     *     
     */
    public AgileTableType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileTableType }
     *     
     */
    public void setResults(AgileTableType value) {
        this.results = value;
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
