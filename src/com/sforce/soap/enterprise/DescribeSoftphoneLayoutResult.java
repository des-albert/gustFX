package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeSoftphoneLayoutResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeSoftphoneLayoutResult() {}

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
     * element : callTypes of type {urn:enterprise.soap.sforce.com}DescribeSoftphoneLayoutCallType
     * java type: com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[]
     */
    private boolean callTypes__is_set = false;

    private com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[] callTypes = new com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[0];

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[] getCallTypes() {
      return callTypes;
    }

    public void setCallTypes(com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[] callTypes) {
      this.callTypes = callTypes;
      callTypes__is_set = true;
    }

    protected void setCallTypes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("callTypes", "urn:enterprise.soap.sforce.com","callTypes","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutCallType",1,-1,true))) {
        setCallTypes((com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[])__typeMapper.readObject(__in, _lookupTypeInfo("callTypes", "urn:enterprise.soap.sforce.com","callTypes","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutCallType",1,-1,true), com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType[].class));
      }
    }

    private void writeFieldCallTypes(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("callTypes", "urn:enterprise.soap.sforce.com","callTypes","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutCallType",1,-1,true), callTypes, callTypes__is_set);
    }

    /**
     * element : id of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean id__is_set = false;

    private java.lang.String id;

    public java.lang.String getId() {
      return id;
    }

    public void setId(java.lang.String id) {
      this.id = id;
      id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("id", "urn:enterprise.soap.sforce.com","id","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setId(__typeMapper.readString(__in, _lookupTypeInfo("id", "urn:enterprise.soap.sforce.com","id","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("id", "urn:enterprise.soap.sforce.com","id","urn:enterprise.soap.sforce.com","ID",1,1,true), id, id__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
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
      sb.append("[DescribeSoftphoneLayoutResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCallTypes(__out, __typeMapper);
      writeFieldId(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCallTypes(__in, __typeMapper);
      setId(__in, __typeMapper);
      setName(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "callTypes", callTypes);
      toStringHelper(sb, "id", id);
      toStringHelper(sb, "name", name);
    }


}
