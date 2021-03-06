package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeAppMenu_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeAppMenu_element() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : appMenuType of type {urn:enterprise.soap.sforce.com}AppMenuType
     * java type: com.sforce.soap.enterprise.AppMenuType
     */
    private boolean appMenuType__is_set = false;

    private com.sforce.soap.enterprise.AppMenuType appMenuType;

    public com.sforce.soap.enterprise.AppMenuType getAppMenuType() {
      return appMenuType;
    }

    public void setAppMenuType(com.sforce.soap.enterprise.AppMenuType appMenuType) {
      this.appMenuType = appMenuType;
      appMenuType__is_set = true;
    }

    protected void setAppMenuType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("appMenuType", "urn:enterprise.soap.sforce.com","appMenuType","urn:enterprise.soap.sforce.com","AppMenuType",1,1,true))) {
        setAppMenuType((com.sforce.soap.enterprise.AppMenuType)__typeMapper.readObject(__in, _lookupTypeInfo("appMenuType", "urn:enterprise.soap.sforce.com","appMenuType","urn:enterprise.soap.sforce.com","AppMenuType",1,1,true), com.sforce.soap.enterprise.AppMenuType.class));
      }
    }

    private void writeFieldAppMenuType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("appMenuType", "urn:enterprise.soap.sforce.com","appMenuType","urn:enterprise.soap.sforce.com","AppMenuType",1,1,true), appMenuType, appMenuType__is_set);
    }

    /**
     * element : networkId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean networkId__is_set = false;

    private java.lang.String networkId;

    public java.lang.String getNetworkId() {
      return networkId;
    }

    public void setNetworkId(java.lang.String networkId) {
      this.networkId = networkId;
      networkId__is_set = true;
    }

    protected void setNetworkId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("networkId", "urn:enterprise.soap.sforce.com","networkId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setNetworkId(__typeMapper.readString(__in, _lookupTypeInfo("networkId", "urn:enterprise.soap.sforce.com","networkId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNetworkId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("networkId", "urn:enterprise.soap.sforce.com","networkId","urn:enterprise.soap.sforce.com","ID",1,1,true), networkId, networkId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribeAppMenu_element ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAppMenuType(__out, __typeMapper);
      writeFieldNetworkId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAppMenuType(__in, __typeMapper);
      setNetworkId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "appMenuType", appMenuType);
      toStringHelper(sb, "networkId", networkId);
    }


}
