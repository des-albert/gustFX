package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeCompactLayoutsResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeCompactLayoutsResult() {}

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
     * element : compactLayouts of type {urn:enterprise.soap.sforce.com}DescribeCompactLayout
     * java type: com.sforce.soap.enterprise.DescribeCompactLayout[]
     */
    private boolean compactLayouts__is_set = false;

    private com.sforce.soap.enterprise.DescribeCompactLayout[] compactLayouts = new com.sforce.soap.enterprise.DescribeCompactLayout[0];

    public com.sforce.soap.enterprise.DescribeCompactLayout[] getCompactLayouts() {
      return compactLayouts;
    }

    public void setCompactLayouts(com.sforce.soap.enterprise.DescribeCompactLayout[] compactLayouts) {
      this.compactLayouts = compactLayouts;
      compactLayouts__is_set = true;
    }

    protected void setCompactLayouts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("compactLayouts", "urn:enterprise.soap.sforce.com","compactLayouts","urn:enterprise.soap.sforce.com","DescribeCompactLayout",1,-1,true))) {
        setCompactLayouts((com.sforce.soap.enterprise.DescribeCompactLayout[])__typeMapper.readObject(__in, _lookupTypeInfo("compactLayouts", "urn:enterprise.soap.sforce.com","compactLayouts","urn:enterprise.soap.sforce.com","DescribeCompactLayout",1,-1,true), com.sforce.soap.enterprise.DescribeCompactLayout[].class));
      }
    }

    private void writeFieldCompactLayouts(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("compactLayouts", "urn:enterprise.soap.sforce.com","compactLayouts","urn:enterprise.soap.sforce.com","DescribeCompactLayout",1,-1,true), compactLayouts, compactLayouts__is_set);
    }

    /**
     * element : defaultCompactLayoutId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean defaultCompactLayoutId__is_set = false;

    private java.lang.String defaultCompactLayoutId;

    public java.lang.String getDefaultCompactLayoutId() {
      return defaultCompactLayoutId;
    }

    public void setDefaultCompactLayoutId(java.lang.String defaultCompactLayoutId) {
      this.defaultCompactLayoutId = defaultCompactLayoutId;
      defaultCompactLayoutId__is_set = true;
    }

    protected void setDefaultCompactLayoutId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("defaultCompactLayoutId", "urn:enterprise.soap.sforce.com","defaultCompactLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setDefaultCompactLayoutId(__typeMapper.readString(__in, _lookupTypeInfo("defaultCompactLayoutId", "urn:enterprise.soap.sforce.com","defaultCompactLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDefaultCompactLayoutId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("defaultCompactLayoutId", "urn:enterprise.soap.sforce.com","defaultCompactLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true), defaultCompactLayoutId, defaultCompactLayoutId__is_set);
    }

    /**
     * element : recordTypeCompactLayoutMappings of type {urn:enterprise.soap.sforce.com}RecordTypeCompactLayoutMapping
     * java type: com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[]
     */
    private boolean recordTypeCompactLayoutMappings__is_set = false;

    private com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings = new com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[0];

    public com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] getRecordTypeCompactLayoutMappings() {
      return recordTypeCompactLayoutMappings;
    }

    public void setRecordTypeCompactLayoutMappings(com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings) {
      this.recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings;
      recordTypeCompactLayoutMappings__is_set = true;
    }

    protected void setRecordTypeCompactLayoutMappings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("recordTypeCompactLayoutMappings", "urn:enterprise.soap.sforce.com","recordTypeCompactLayoutMappings","urn:enterprise.soap.sforce.com","RecordTypeCompactLayoutMapping",0,-1,true))) {
        setRecordTypeCompactLayoutMappings((com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[])__typeMapper.readObject(__in, _lookupTypeInfo("recordTypeCompactLayoutMappings", "urn:enterprise.soap.sforce.com","recordTypeCompactLayoutMappings","urn:enterprise.soap.sforce.com","RecordTypeCompactLayoutMapping",0,-1,true), com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[].class));
      }
    }

    private void writeFieldRecordTypeCompactLayoutMappings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("recordTypeCompactLayoutMappings", "urn:enterprise.soap.sforce.com","recordTypeCompactLayoutMappings","urn:enterprise.soap.sforce.com","RecordTypeCompactLayoutMapping",0,-1,true), recordTypeCompactLayoutMappings, recordTypeCompactLayoutMappings__is_set);
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
      sb.append("[DescribeCompactLayoutsResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCompactLayouts(__out, __typeMapper);
      writeFieldDefaultCompactLayoutId(__out, __typeMapper);
      writeFieldRecordTypeCompactLayoutMappings(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCompactLayouts(__in, __typeMapper);
      setDefaultCompactLayoutId(__in, __typeMapper);
      setRecordTypeCompactLayoutMappings(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "compactLayouts", compactLayouts);
      toStringHelper(sb, "defaultCompactLayoutId", defaultCompactLayoutId);
      toStringHelper(sb, "recordTypeCompactLayoutMappings", recordTypeCompactLayoutMappings);
    }


}
