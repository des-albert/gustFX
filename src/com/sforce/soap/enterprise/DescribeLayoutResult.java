package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeLayoutResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeLayoutResult() {}

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
     * element : layouts of type {urn:enterprise.soap.sforce.com}DescribeLayout
     * java type: com.sforce.soap.enterprise.DescribeLayout[]
     */
    private boolean layouts__is_set = false;

    private com.sforce.soap.enterprise.DescribeLayout[] layouts = new com.sforce.soap.enterprise.DescribeLayout[0];

    public com.sforce.soap.enterprise.DescribeLayout[] getLayouts() {
      return layouts;
    }

    public void setLayouts(com.sforce.soap.enterprise.DescribeLayout[] layouts) {
      this.layouts = layouts;
      layouts__is_set = true;
    }

    protected void setLayouts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("layouts", "urn:enterprise.soap.sforce.com","layouts","urn:enterprise.soap.sforce.com","DescribeLayout",1,-1,true))) {
        setLayouts((com.sforce.soap.enterprise.DescribeLayout[])__typeMapper.readObject(__in, _lookupTypeInfo("layouts", "urn:enterprise.soap.sforce.com","layouts","urn:enterprise.soap.sforce.com","DescribeLayout",1,-1,true), com.sforce.soap.enterprise.DescribeLayout[].class));
      }
    }

    private void writeFieldLayouts(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("layouts", "urn:enterprise.soap.sforce.com","layouts","urn:enterprise.soap.sforce.com","DescribeLayout",1,-1,true), layouts, layouts__is_set);
    }

    /**
     * element : recordTypeMappings of type {urn:enterprise.soap.sforce.com}RecordTypeMapping
     * java type: com.sforce.soap.enterprise.RecordTypeMapping[]
     */
    private boolean recordTypeMappings__is_set = false;

    private com.sforce.soap.enterprise.RecordTypeMapping[] recordTypeMappings = new com.sforce.soap.enterprise.RecordTypeMapping[0];

    public com.sforce.soap.enterprise.RecordTypeMapping[] getRecordTypeMappings() {
      return recordTypeMappings;
    }

    public void setRecordTypeMappings(com.sforce.soap.enterprise.RecordTypeMapping[] recordTypeMappings) {
      this.recordTypeMappings = recordTypeMappings;
      recordTypeMappings__is_set = true;
    }

    protected void setRecordTypeMappings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("recordTypeMappings", "urn:enterprise.soap.sforce.com","recordTypeMappings","urn:enterprise.soap.sforce.com","RecordTypeMapping",0,-1,true))) {
        setRecordTypeMappings((com.sforce.soap.enterprise.RecordTypeMapping[])__typeMapper.readObject(__in, _lookupTypeInfo("recordTypeMappings", "urn:enterprise.soap.sforce.com","recordTypeMappings","urn:enterprise.soap.sforce.com","RecordTypeMapping",0,-1,true), com.sforce.soap.enterprise.RecordTypeMapping[].class));
      }
    }

    private void writeFieldRecordTypeMappings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("recordTypeMappings", "urn:enterprise.soap.sforce.com","recordTypeMappings","urn:enterprise.soap.sforce.com","RecordTypeMapping",0,-1,true), recordTypeMappings, recordTypeMappings__is_set);
    }

    /**
     * element : recordTypeSelectorRequired of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean recordTypeSelectorRequired__is_set = false;

    private boolean recordTypeSelectorRequired;

    public boolean getRecordTypeSelectorRequired() {
      return recordTypeSelectorRequired;
    }

    public boolean isRecordTypeSelectorRequired() {
      return recordTypeSelectorRequired;
    }

    public void setRecordTypeSelectorRequired(boolean recordTypeSelectorRequired) {
      this.recordTypeSelectorRequired = recordTypeSelectorRequired;
      recordTypeSelectorRequired__is_set = true;
    }

    protected void setRecordTypeSelectorRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("recordTypeSelectorRequired", "urn:enterprise.soap.sforce.com","recordTypeSelectorRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setRecordTypeSelectorRequired(__typeMapper.readBoolean(__in, _lookupTypeInfo("recordTypeSelectorRequired", "urn:enterprise.soap.sforce.com","recordTypeSelectorRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldRecordTypeSelectorRequired(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("recordTypeSelectorRequired", "urn:enterprise.soap.sforce.com","recordTypeSelectorRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), recordTypeSelectorRequired, recordTypeSelectorRequired__is_set);
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
      sb.append("[DescribeLayoutResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldLayouts(__out, __typeMapper);
      writeFieldRecordTypeMappings(__out, __typeMapper);
      writeFieldRecordTypeSelectorRequired(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setLayouts(__in, __typeMapper);
      setRecordTypeMappings(__in, __typeMapper);
      setRecordTypeSelectorRequired(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "layouts", layouts);
      toStringHelper(sb, "recordTypeMappings", recordTypeMappings);
      toStringHelper(sb, "recordTypeSelectorRequired", recordTypeSelectorRequired);
    }


}