
package com.agile.ws.service.metadata.v1.jaxws;

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
@WebServiceClient(name = "AdminMetadataService", targetNamespace = "http://xmlns.oracle.com/AgileServices/Core/AdminMetadata/V1", wsdlLocation = "http://agile.us.cray.com:80/CoreService/services/AdminMetaData?wsdl")
public class AdminMetadataService
    extends Service
{

    private final static URL ADMINMETADATASERVICE_WSDL_LOCATION;
    private final static WebServiceException ADMINMETADATASERVICE_EXCEPTION;
    private final static QName ADMINMETADATASERVICE_QNAME = new QName("http://xmlns.oracle.com/AgileServices/Core/AdminMetadata/V1", "AdminMetadataService");

    static {
        WebServiceException e = null;
        URL url = null;
        try {
            url = new URL(com.agile.ws.service.metadata.v1.jaxws.AdminMetadataService.class.getResource("."), "http://agile.us.cray.com:80/CoreService/services/AdminMetaData?wsdl");
        } catch (MalformedURLException murl) {
            e = new WebServiceException(murl);
        }
        ADMINMETADATASERVICE_WSDL_LOCATION = url;
        ADMINMETADATASERVICE_EXCEPTION = e;
    }

    public AdminMetadataService() {
        super(__getWsdlLocation(), ADMINMETADATASERVICE_QNAME);
    }

    public AdminMetadataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINMETADATASERVICE_QNAME, features);
    }

    public AdminMetadataService(URL wsdlLocation) {
        super(wsdlLocation, ADMINMETADATASERVICE_QNAME);
    }

    public AdminMetadataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINMETADATASERVICE_QNAME, features);
    }

    public AdminMetadataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminMetadataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdminMetadataPortType
     */
    @WebEndpoint(name = "AdminMetadata")
    public AdminMetadataPortType getAdminMetadata() {
        return super.getPort(new QName("http://xmlns.oracle.com/AgileServices/Core/AdminMetadata/V1", "AdminMetadata"), AdminMetadataPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminMetadataPortType
     */
    @WebEndpoint(name = "AdminMetadata")
    public AdminMetadataPortType getAdminMetadata(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/AgileServices/Core/AdminMetadata/V1", "AdminMetadata"), AdminMetadataPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINMETADATASERVICE_EXCEPTION!= null) {
            throw ADMINMETADATASERVICE_EXCEPTION;
        }
        return ADMINMETADATASERVICE_WSDL_LOCATION;
    }

}
