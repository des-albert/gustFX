package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class MergeResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public MergeResult() {}

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
     * element : errors of type {urn:enterprise.soap.sforce.com}Error
     * java type: com.sforce.soap.enterprise.Error[]
     */
    private boolean errors__is_set = false;

    private com.sforce.soap.enterprise.Error[] errors = new com.sforce.soap.enterprise.Error[0];

    public com.sforce.soap.enterprise.Error[] getErrors() {
      return errors;
    }

    public void setErrors(com.sforce.soap.enterprise.Error[] errors) {
      this.errors = errors;
      errors__is_set = true;
    }

    protected void setErrors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true))) {
        setErrors((com.sforce.soap.enterprise.Error[])__typeMapper.readObject(__in, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true), com.sforce.soap.enterprise.Error[].class));
      }
    }

    private void writeFieldErrors(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true), errors, errors__is_set);
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
     * element : mergedRecordIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean mergedRecordIds__is_set = false;

    private java.lang.String[] mergedRecordIds = new java.lang.String[0];

    public java.lang.String[] getMergedRecordIds() {
      return mergedRecordIds;
    }

    public void setMergedRecordIds(java.lang.String[] mergedRecordIds) {
      this.mergedRecordIds = mergedRecordIds;
      mergedRecordIds__is_set = true;
    }

    protected void setMergedRecordIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("mergedRecordIds", "urn:enterprise.soap.sforce.com","mergedRecordIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setMergedRecordIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("mergedRecordIds", "urn:enterprise.soap.sforce.com","mergedRecordIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldMergedRecordIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("mergedRecordIds", "urn:enterprise.soap.sforce.com","mergedRecordIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), mergedRecordIds, mergedRecordIds__is_set);
    }

    /**
     * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean success__is_set = false;

    private boolean success;

    public boolean getSuccess() {
      return success;
    }

    public boolean isSuccess() {
      return success;
    }

    public void setSuccess(boolean success) {
      this.success = success;
      success__is_set = true;
    }

    protected void setSuccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setSuccess(__typeMapper.readBoolean(__in, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldSuccess(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), success, success__is_set);
    }

    /**
     * element : updatedRelatedIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean updatedRelatedIds__is_set = false;

    private java.lang.String[] updatedRelatedIds = new java.lang.String[0];

    public java.lang.String[] getUpdatedRelatedIds() {
      return updatedRelatedIds;
    }

    public void setUpdatedRelatedIds(java.lang.String[] updatedRelatedIds) {
      this.updatedRelatedIds = updatedRelatedIds;
      updatedRelatedIds__is_set = true;
    }

    protected void setUpdatedRelatedIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("updatedRelatedIds", "urn:enterprise.soap.sforce.com","updatedRelatedIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setUpdatedRelatedIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("updatedRelatedIds", "urn:enterprise.soap.sforce.com","updatedRelatedIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldUpdatedRelatedIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("updatedRelatedIds", "urn:enterprise.soap.sforce.com","updatedRelatedIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), updatedRelatedIds, updatedRelatedIds__is_set);
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
      sb.append("[MergeResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldErrors(__out, __typeMapper);
      writeFieldId(__out, __typeMapper);
      writeFieldMergedRecordIds(__out, __typeMapper);
      writeFieldSuccess(__out, __typeMapper);
      writeFieldUpdatedRelatedIds(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setErrors(__in, __typeMapper);
      setId(__in, __typeMapper);
      setMergedRecordIds(__in, __typeMapper);
      setSuccess(__in, __typeMapper);
      setUpdatedRelatedIds(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "errors", errors);
      toStringHelper(sb, "id", id);
      toStringHelper(sb, "mergedRecordIds", mergedRecordIds);
      toStringHelper(sb, "success", success);
      toStringHelper(sb, "updatedRelatedIds", updatedRelatedIds);
    }


}
