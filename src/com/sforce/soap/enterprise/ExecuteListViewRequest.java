package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ExecuteListViewRequest implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ExecuteListViewRequest() {}

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
     * element : developerNameOrId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean developerNameOrId__is_set = false;

    private java.lang.String developerNameOrId;

    public java.lang.String getDeveloperNameOrId() {
      return developerNameOrId;
    }

    public void setDeveloperNameOrId(java.lang.String developerNameOrId) {
      this.developerNameOrId = developerNameOrId;
      developerNameOrId__is_set = true;
    }

    protected void setDeveloperNameOrId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("developerNameOrId", "urn:enterprise.soap.sforce.com","developerNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setDeveloperNameOrId(__typeMapper.readString(__in, _lookupTypeInfo("developerNameOrId", "urn:enterprise.soap.sforce.com","developerNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeveloperNameOrId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("developerNameOrId", "urn:enterprise.soap.sforce.com","developerNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true), developerNameOrId, developerNameOrId__is_set);
    }

    /**
     * element : limit of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean limit__is_set = false;

    private java.lang.Integer limit;

    public java.lang.Integer getLimit() {
      return limit;
    }

    public void setLimit(java.lang.Integer limit) {
      this.limit = limit;
      limit__is_set = true;
    }

    protected void setLimit(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("limit", "urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setLimit((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("limit", "urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldLimit(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("limit", "urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true), limit, limit__is_set);
    }

    /**
     * element : offset of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean offset__is_set = false;

    private java.lang.Integer offset;

    public java.lang.Integer getOffset() {
      return offset;
    }

    public void setOffset(java.lang.Integer offset) {
      this.offset = offset;
      offset__is_set = true;
    }

    protected void setOffset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("offset", "urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setOffset((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("offset", "urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldOffset(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("offset", "urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true), offset, offset__is_set);
    }

    /**
     * element : orderBy of type {urn:enterprise.soap.sforce.com}ListViewOrderBy
     * java type: com.sforce.soap.enterprise.ListViewOrderBy[]
     */
    private boolean orderBy__is_set = false;

    private com.sforce.soap.enterprise.ListViewOrderBy[] orderBy = new com.sforce.soap.enterprise.ListViewOrderBy[0];

    public com.sforce.soap.enterprise.ListViewOrderBy[] getOrderBy() {
      return orderBy;
    }

    public void setOrderBy(com.sforce.soap.enterprise.ListViewOrderBy[] orderBy) {
      this.orderBy = orderBy;
      orderBy__is_set = true;
    }

    protected void setOrderBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("orderBy", "urn:enterprise.soap.sforce.com","orderBy","urn:enterprise.soap.sforce.com","ListViewOrderBy",1,-1,true))) {
        setOrderBy((com.sforce.soap.enterprise.ListViewOrderBy[])__typeMapper.readObject(__in, _lookupTypeInfo("orderBy", "urn:enterprise.soap.sforce.com","orderBy","urn:enterprise.soap.sforce.com","ListViewOrderBy",1,-1,true), com.sforce.soap.enterprise.ListViewOrderBy[].class));
      }
    }

    private void writeFieldOrderBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("orderBy", "urn:enterprise.soap.sforce.com","orderBy","urn:enterprise.soap.sforce.com","ListViewOrderBy",1,-1,true), orderBy, orderBy__is_set);
    }

    /**
     * element : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean sobjectType__is_set = false;

    private java.lang.String sobjectType;

    public java.lang.String getSobjectType() {
      return sobjectType;
    }

    public void setSobjectType(java.lang.String sobjectType) {
      this.sobjectType = sobjectType;
      sobjectType__is_set = true;
    }

    protected void setSobjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sobjectType", "urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setSobjectType(__typeMapper.readString(__in, _lookupTypeInfo("sobjectType", "urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSobjectType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sobjectType", "urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true), sobjectType, sobjectType__is_set);
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
      sb.append("[ExecuteListViewRequest ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldDeveloperNameOrId(__out, __typeMapper);
      writeFieldLimit(__out, __typeMapper);
      writeFieldOffset(__out, __typeMapper);
      writeFieldOrderBy(__out, __typeMapper);
      writeFieldSobjectType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDeveloperNameOrId(__in, __typeMapper);
      setLimit(__in, __typeMapper);
      setOffset(__in, __typeMapper);
      setOrderBy(__in, __typeMapper);
      setSobjectType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "developerNameOrId", developerNameOrId);
      toStringHelper(sb, "limit", limit);
      toStringHelper(sb, "offset", offset);
      toStringHelper(sb, "orderBy", orderBy);
      toStringHelper(sb, "sobjectType", sobjectType);
    }


}