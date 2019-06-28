
package com.agile.ws.service.business.v1.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BusinessObjectService", targetNamespace = "http://xmlns.oracle.com/AgileServices/Core/Business/V1", wsdlLocation = "http://agile.us.cray.com:80/CoreService/services/BusinessObject?wsdl")
public class BusinessObjectService
    extends Service
{

    private final static URL BUSINESSOBJECTSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUSINESSOBJECTSERVICE_EXCEPTION;
    private final static QName BUSINESSOBJECTSERVICE_QNAME = new QName("http://xmlns.oracle.com/AgileServices/Core/Business/V1", "BusinessObjectService");

    static {
        WebServiceException e = null;
        URL url = null;
        try {
            url = new URL(com.agile.ws.service.business.v1.jaxws.BusinessObjectService.class.getResource("."), "http://agile.us.cray.com:80/CoreService/services/BusinessObject?wsdl");
        } catch (MalformedURLException murl) {
            e = new WebServiceException(murl);
        }
        BUSINESSOBJECTSERVICE_WSDL_LOCATION = url;
        BUSINESSOBJECTSERVICE_EXCEPTION = e;
    }

    public BusinessObjectService() {
        super(__getWsdlLocation(), BUSINESSOBJECTSERVICE_QNAME);
    }

    public BusinessObjectService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSINESSOBJECTSERVICE_QNAME, features);
    }

    public BusinessObjectService(URL wsdlLocation) {
        super(wsdlLocation, BUSINESSOBJECTSERVICE_QNAME);
    }

    public BusinessObjectService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSINESSOBJECTSERVICE_QNAME, features);
    }

    public BusinessObjectService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusinessObjectService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BusinessObjectPortType
     */
    @WebEndpoint(name = "BusinessObject")
    public BusinessObjectPortType getBusinessObject() {
        return super.getPort(new QName("http://xmlns.oracle.com/AgileServices/Core/Business/V1", "BusinessObject"), BusinessObjectPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BusinessObjectPortType
     */
    @WebEndpoint(name = "BusinessObject")
    public BusinessObjectPortType getBusinessObject(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/AgileServices/Core/Business/V1", "BusinessObject"), BusinessObjectPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSINESSOBJECTSERVICE_EXCEPTION!= null) {
            throw BUSINESSOBJECTSERVICE_EXCEPTION;
        }
        return BUSINESSOBJECTSERVICE_WSDL_LOCATION;
    }

}
