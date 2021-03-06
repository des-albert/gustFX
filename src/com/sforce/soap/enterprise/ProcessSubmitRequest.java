package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ProcessSubmitRequest extends com.sforce.soap.enterprise.ProcessRequest {

    /**
     * Constructor
     */
    public ProcessSubmitRequest() {}

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
     * element : objectId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean objectId__is_set = false;

    private java.lang.String objectId;

    public java.lang.String getObjectId() {
      return objectId;
    }

    public void setObjectId(java.lang.String objectId) {
      this.objectId = objectId;
      objectId__is_set = true;
    }

    protected void setObjectId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("objectId", "urn:enterprise.soap.sforce.com","objectId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setObjectId(__typeMapper.readString(__in, _lookupTypeInfo("objectId", "urn:enterprise.soap.sforce.com","objectId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldObjectId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("objectId", "urn:enterprise.soap.sforce.com","objectId","urn:enterprise.soap.sforce.com","ID",1,1,true), objectId, objectId__is_set);
    }

    /**
     * element : submitterId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean submitterId__is_set = false;

    private java.lang.String submitterId;

    public java.lang.String getSubmitterId() {
      return submitterId;
    }

    public void setSubmitterId(java.lang.String submitterId) {
      this.submitterId = submitterId;
      submitterId__is_set = true;
    }

    protected void setSubmitterId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("submitterId", "urn:enterprise.soap.sforce.com","submitterId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setSubmitterId(__typeMapper.readString(__in, _lookupTypeInfo("submitterId", "urn:enterprise.soap.sforce.com","submitterId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubmitterId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("submitterId", "urn:enterprise.soap.sforce.com","submitterId","urn:enterprise.soap.sforce.com","ID",1,1,true), submitterId, submitterId__is_set);
    }

    /**
     * element : processDefinitionNameOrId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean processDefinitionNameOrId__is_set = false;

    private java.lang.String processDefinitionNameOrId;

    public java.lang.String getProcessDefinitionNameOrId() {
      return processDefinitionNameOrId;
    }

    public void setProcessDefinitionNameOrId(java.lang.String processDefinitionNameOrId) {
      this.processDefinitionNameOrId = processDefinitionNameOrId;
      processDefinitionNameOrId__is_set = true;
    }

    protected void setProcessDefinitionNameOrId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("processDefinitionNameOrId", "urn:enterprise.soap.sforce.com","processDefinitionNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setProcessDefinitionNameOrId(__typeMapper.readString(__in, _lookupTypeInfo("processDefinitionNameOrId", "urn:enterprise.soap.sforce.com","processDefinitionNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProcessDefinitionNameOrId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("processDefinitionNameOrId", "urn:enterprise.soap.sforce.com","processDefinitionNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true), processDefinitionNameOrId, processDefinitionNameOrId__is_set);
    }

    /**
     * element : skipEntryCriteria of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean skipEntryCriteria__is_set = false;

    private java.lang.Boolean skipEntryCriteria;

    public java.lang.Boolean getSkipEntryCriteria() {
      return skipEntryCriteria;
    }

    public void setSkipEntryCriteria(java.lang.Boolean skipEntryCriteria) {
      this.skipEntryCriteria = skipEntryCriteria;
      skipEntryCriteria__is_set = true;
    }

    protected void setSkipEntryCriteria(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("skipEntryCriteria", "urn:enterprise.soap.sforce.com","skipEntryCriteria","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setSkipEntryCriteria((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("skipEntryCriteria", "urn:enterprise.soap.sforce.com","skipEntryCriteria","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSkipEntryCriteria(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("skipEntryCriteria", "urn:enterprise.soap.sforce.com","skipEntryCriteria","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), skipEntryCriteria, skipEntryCriteria__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "ProcessSubmitRequest");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
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
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ProcessSubmitRequest ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldObjectId(__out, __typeMapper);
      writeFieldSubmitterId(__out, __typeMapper);
      writeFieldProcessDefinitionNameOrId(__out, __typeMapper);
      writeFieldSkipEntryCriteria(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setObjectId(__in, __typeMapper);
      setSubmitterId(__in, __typeMapper);
      setProcessDefinitionNameOrId(__in, __typeMapper);
      setSkipEntryCriteria(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "objectId", objectId);
      toStringHelper(sb, "submitterId", submitterId);
      toStringHelper(sb, "processDefinitionNameOrId", processDefinitionNameOrId);
      toStringHelper(sb, "skipEntryCriteria", skipEntryCriteria);
    }


}
