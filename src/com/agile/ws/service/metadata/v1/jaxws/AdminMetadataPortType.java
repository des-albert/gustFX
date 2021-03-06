
package com.agile.ws.service.metadata.v1.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.agile.ws.schema.metadata.v1.jaxws.ChangeApprovalPasswordRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.ChangeApprovalPasswordResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.ChangeLoginPasswordRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.ChangeLoginPasswordResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.ConvertCurrencyRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.ConvertCurrencyResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.CreateTransferAuthorityRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.CreateTransferAuthorityResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAgileClassRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAgileClassResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAllClassesRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAllClassesResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAttributesRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAttributesResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAutoNumbersRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetAutoNumbersResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetListsRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetListsResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetNodeRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetNodeResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetSubClassesRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetSubClassesResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetTableMetadataRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetTableMetadataResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetTransferAuthorityRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetTransferAuthorityResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetUserGroupsRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetUserGroupsResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.GetUsersRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.GetUsersResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.ModifyTransferAuthorityRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.ModifyTransferAuthorityResponseType;
import com.agile.ws.schema.metadata.v1.jaxws.RemoveTransferAuthorityRequestType;
import com.agile.ws.schema.metadata.v1.jaxws.RemoveTransferAuthorityResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdminMetadata_PortType", targetNamespace = "http://xmlns.oracle.com/AgileServices/Core/AdminMetadata/V1")
@XmlSeeAlso({
    com.agile.ws.schema.common.v1.jaxws.ObjectFactory.class,
    com.agile.ws.schema.metadata.v1.jaxws.ObjectFactory.class
})
public interface AdminMetadataPortType {


    /**
     * 
     * 	  The getAllClasses webservice operation retrives all Agile classes from the PLM
     * 	  system. The class filteration details are specified in the request object. A 
     * 	  list of Agile classes retrieved as per the filter is obtained in the response.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetAllClassesResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getAllClasses", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAllClasses")
    @ResponseWrapper(localName = "getAllClassesResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAllClassesResponse")
    public GetAllClassesResponseType getAllClasses(
        @WebParam(name = "request", targetNamespace = "")
        GetAllClassesRequestType request);

    /**
     * 
     * 	  The getAllClasses webservice operation retrives all Agile sub classes for a given
     * 	  base class in Agile PLM. The request object contains relevant details for the same.
     * 	  A list of Agile subclasses classes are obtained in the response.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetSubClassesResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getSubClasses", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetSubClasses")
    @ResponseWrapper(localName = "getSubClassesResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetSubClassesResponse")
    public GetSubClassesResponseType getSubClasses(
        @WebParam(name = "request", targetNamespace = "")
        GetSubClassesRequestType request);

    /**
     * 
     * 	  The getNode webservice operation retrives Agile nodes for a given node identifier. 
     * 	  The request object consists of a node identifier and an option to enable recursive 
     * 	  retrieval of nodes. The response contains the node queried for in the form of an
     * 	  AdminNodeType object. Child nodes (if available) may be recursively fetched from
     * 	  this node.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetNodeResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getNode", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetNode")
    @ResponseWrapper(localName = "getNodeResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetNodeResponse")
    public GetNodeResponseType getNode(
        @WebParam(name = "request", targetNamespace = "")
        GetNodeRequestType request);

    /**
     * 
     * 	  The getLists webservice operation retrives Agile lists for a given list identifier. 
     * 	  The request object consists of a list identifier with which the list to be retrieved
     * 	  is specified. The lists retrieved are AdminListType objects from the response.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetListsResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getLists", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetLists")
    @ResponseWrapper(localName = "getListsResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetListsResponse")
    public GetListsResponseType getLists(
        @WebParam(name = "request", targetNamespace = "")
        GetListsRequestType request);

    /**
     * 
     * 	  The getAttributes webservice operation retrives Agile attributes for a particular class
     * 	  and attribute identifier. The attributes are obtained in the form of AttributeType objects
     * 	  in the response.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetAttributesResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getAttributes", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAttributes")
    @ResponseWrapper(localName = "getAttributesResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAttributesResponse")
    public GetAttributesResponseType getAttributes(
        @WebParam(name = "request", targetNamespace = "")
        GetAttributesRequestType request);

    /**
     * 
     * 	  The getTableMetadata webservice operation retrives metadata information about an Agile table
     * 	  in the PLM, given details identifying the table. The request object consists of a class identifier
     * 	  and a table identifier. The table metadata information is obtained through the response
     * 	  in the form of attribute type objects.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetTableMetadataResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getTableMetadata", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetTableMetadata")
    @ResponseWrapper(localName = "getTableMetadataResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetTableMetadataResponse")
    public GetTableMetadataResponseType getTableMetadata(
        @WebParam(name = "request", targetNamespace = "")
        GetTableMetadataRequestType request);

    /**
     * 
     * 	  The getAutoNumbers webservice operation retrives a suitable autonumber for an Agile object given
     * 	  class and autonumber identifiers. The autonumber for the object fetched by the webservice is
     * 	  obtained through the response in the form of AutoNumberType objects.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetAutoNumbersResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getAutoNumbers", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAutoNumbers")
    @ResponseWrapper(localName = "getAutoNumbersResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAutoNumbersResponse")
    public GetAutoNumbersResponseType getAutoNumbers(
        @WebParam(name = "request", targetNamespace = "")
        GetAutoNumbersRequestType request);

    /**
     * 
     * 	  The getUsers webservice operation retrives information about users in Agile PLM. The request
     * 	  does not contain any element. The list of users fetched by the webservice is obtained through
     * 	  the response as AgileUserType objects
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetUsersResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetUsersResponse")
    public GetUsersResponseType getUsers(
        @WebParam(name = "request", targetNamespace = "")
        GetUsersRequestType request);

    /**
     * 
     * 	  The getUserGroups webservice operation retrives information about users groups in Agile PLM.
     * 	  The request does not contain any element. A list of user groups fetched by the webservice is
     * 	  obtained through the response as AgileUserGroupType objects.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetUserGroupsResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getUserGroups", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetUserGroups")
    @ResponseWrapper(localName = "getUserGroupsResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetUserGroupsResponse")
    public GetUserGroupsResponseType getUserGroups(
        @WebParam(name = "request", targetNamespace = "")
        GetUserGroupsRequestType request);

    /**
     * 
     * 	  The convertCurrency webservice operation is used to convert a certain amount of money
     * 	  to from one form of currency to another. The request object consists of money, date
     * 	  and currency input. The converted currency is obtained through the response object.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.ConvertCurrencyResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "convertCurrency", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ConvertCurrency")
    @ResponseWrapper(localName = "convertCurrencyResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ConvertCurrencyResponse")
    public ConvertCurrencyResponseType convertCurrency(
        @WebParam(name = "request", targetNamespace = "")
        ConvertCurrencyRequestType request);

    /**
     * 
     * 	  The changeLoginPassword webservice operation is used to change the login password
     * 	  for an Agile user. User identifier and new password information is supplied in the request.
     * 	  If the current user's password is to be reset then the old password must also be specified.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.ChangeLoginPasswordResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "changeLoginPassword", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ChangeLoginPassword")
    @ResponseWrapper(localName = "changeLoginPasswordResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ChangeLoginPasswordResponse")
    public ChangeLoginPasswordResponseType changeLoginPassword(
        @WebParam(name = "request", targetNamespace = "")
        ChangeLoginPasswordRequestType request);

    /**
     * 
     * 	  The changeApprovalPassword webservice operation is used to change the approval password
     * 	  for an Agile user. User identifier and new password information is supplied in the request.
     * 	  If the current user's approval password is to be reset then the old approval password must
     * 	  also be specified.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.ChangeApprovalPasswordResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "changeApprovalPassword", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ChangeApprovalPassword")
    @ResponseWrapper(localName = "changeApprovalPasswordResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ChangeApprovalPasswordResponse")
    public ChangeApprovalPasswordResponseType changeApprovalPassword(
        @WebParam(name = "request", targetNamespace = "")
        ChangeApprovalPasswordRequestType request);

    /**
     * 
     * 	  The createTransferAuthority webservice operation is used to create a transfer authority
     * 	  record from an Agile user to another. The request contains information about the user from whom
     * 	  the authority is transferred and the user to whom the authority will be granted, the dates from and
     * 	  up to which the transfer is effective and the criteria identifying the authority to be transferred. 
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.CreateTransferAuthorityResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "createTransferAuthority", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.CreateTransferAuthority")
    @ResponseWrapper(localName = "createTransferAuthorityResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.CreateTransferAuthorityResponse")
    public CreateTransferAuthorityResponseType createTransferAuthority(
        @WebParam(name = "request", targetNamespace = "")
        CreateTransferAuthorityRequestType request);

    /**
     * 
     * 	  The getTransferAuthority webservice operation is used to retrieve a transfer authority
     * 	  record from the transfer authority record manager. A criteria identifying the authority 
     * 	  to be retrieved is specified in the request. 
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetTransferAuthorityResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getTransferAuthority", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetTransferAuthority")
    @ResponseWrapper(localName = "getTransferAuthorityResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetTransferAuthorityResponse")
    public GetTransferAuthorityResponseType getTransferAuthority(
        @WebParam(name = "request", targetNamespace = "")
        GetTransferAuthorityRequestType request);

    /**
     * 
     * 	  The ModifyTransferAuthority webservice operation is used to retrieve a transfer authority
     * 	  record from the transfer authority record manager. A criteria identifying the authority 
     * 	  to be retrieved is specified in the request. 
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.ModifyTransferAuthorityResponseType
     */
    @WebMethod(operationName = "ModifyTransferAuthority")
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "ModifyTransferAuthority", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ModifyTransferAuthority")
    @ResponseWrapper(localName = "ModifyTransferAuthorityResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.ModifyTransferAuthorityResponse")
    public ModifyTransferAuthorityResponseType modifyTransferAuthority(
        @WebParam(name = "request", targetNamespace = "")
        ModifyTransferAuthorityRequestType request);

    /**
     * 
     * 	  The removeTransferAuthority webservice operation is used to remove a transfer authority
     * 	  record from the transfer authority record manager. A criteria identifying the authority 
     * 	  to be retrieved is specified in the request. 
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.RemoveTransferAuthorityResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "removeTransferAuthority", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.RemoveTransferAuthority")
    @ResponseWrapper(localName = "removeTransferAuthorityResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.RemoveTransferAuthorityResponse")
    public RemoveTransferAuthorityResponseType removeTransferAuthority(
        @WebParam(name = "request", targetNamespace = "")
        RemoveTransferAuthorityRequestType request);

    /**
     * 
     * 	  The getAgileClass webservice operation retrives an Agile classes from the PLM system given the Agile Class Identifiers. A ClassType with the details of the Agile class is obtained in the response.
     * 	  
     * 
     * @param request
     * @return
     *     returns com.agile.ws.schema.metadata.v1.jaxws.GetAgileClassResponseType
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getAgileClass", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAgileClass")
    @ResponseWrapper(localName = "getAgileClassResponse", targetNamespace = "http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1", className = "com.agile.ws.schema.metadata.v1.jaxws.GetAgileClassResponse")
    public GetAgileClassResponseType getAgileClass(
        @WebParam(name = "request", targetNamespace = "")
        GetAgileClassRequestType request);

}
