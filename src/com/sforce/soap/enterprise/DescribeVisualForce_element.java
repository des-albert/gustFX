package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeVisualForce_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeVisualForce_element() {}

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
     * element : includeAllDetails of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean includeAllDetails__is_set = false;

    private boolean includeAllDetails;

    public boolean getIncludeAllDetails() {
      return includeAllDetails;
    }

    public boolean isIncludeAllDetails() {
      return includeAllDetails;
    }

    public void setIncludeAllDetails(boolean includeAllDetails) {
      this.includeAllDetails = includeAllDetails;
      includeAllDetails__is_set = true;
    }

    protected void setIncludeAllDetails(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("includeAllDetails", "urn:enterprise.soap.sforce.com","includeAllDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setIncludeAllDetails(__typeMapper.readBoolean(__in, _lookupTypeInfo("includeAllDetails", "urn:enterprise.soap.sforce.com","includeAllDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldIncludeAllDetails(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("includeAllDetails", "urn:enterprise.soap.sforce.com","includeAllDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), includeAllDetails, includeAllDetails__is_set);
    }

    /**
     * element : namespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean namespacePrefix__is_set = false;

    private java.lang.String namespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return namespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String namespacePrefix) {
      this.namespacePrefix = namespacePrefix;
      namespacePrefix__is_set = true;
    }

    protected void setNamespacePrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("namespacePrefix", "urn:enterprise.soap.sforce.com","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setNamespacePrefix(__typeMapper.readString(__in, _lookupTypeInfo("namespacePrefix", "urn:enterprise.soap.sforce.com","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNamespacePrefix(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("namespacePrefix", "urn:enterprise.soap.sforce.com","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",1,1,true), namespacePrefix, namespacePrefix__is_set);
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
      sb.append("[DescribeVisualForce_element ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldIncludeAllDetails(__out, __typeMapper);
      writeFieldNamespacePrefix(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setIncludeAllDetails(__in, __typeMapper);
      setNamespacePrefix(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "includeAllDetails", includeAllDetails);
      toStringHelper(sb, "namespacePrefix", namespacePrefix);
    }


}
