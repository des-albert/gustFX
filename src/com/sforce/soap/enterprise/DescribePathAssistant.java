package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribePathAssistant implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribePathAssistant() {}

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
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("active", "urn:enterprise.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setActive(__typeMapper.readBoolean(__in, _lookupTypeInfo("active", "urn:enterprise.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldActive(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("active", "urn:enterprise.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), active, active__is_set);
    }

    /**
     * element : apiName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean apiName__is_set = false;

    private java.lang.String apiName;

    public java.lang.String getApiName() {
      return apiName;
    }

    public void setApiName(java.lang.String apiName) {
      this.apiName = apiName;
      apiName__is_set = true;
    }

    protected void setApiName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("apiName", "urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setApiName(__typeMapper.readString(__in, _lookupTypeInfo("apiName", "urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApiName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apiName", "urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), apiName, apiName__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : pathPicklistField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean pathPicklistField__is_set = false;

    private java.lang.String pathPicklistField;

    public java.lang.String getPathPicklistField() {
      return pathPicklistField;
    }

    public void setPathPicklistField(java.lang.String pathPicklistField) {
      this.pathPicklistField = pathPicklistField;
      pathPicklistField__is_set = true;
    }

    protected void setPathPicklistField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("pathPicklistField", "urn:enterprise.soap.sforce.com","pathPicklistField","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setPathPicklistField(__typeMapper.readString(__in, _lookupTypeInfo("pathPicklistField", "urn:enterprise.soap.sforce.com","pathPicklistField","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPathPicklistField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("pathPicklistField", "urn:enterprise.soap.sforce.com","pathPicklistField","http://www.w3.org/2001/XMLSchema","string",1,1,true), pathPicklistField, pathPicklistField__is_set);
    }

    /**
     * element : picklistsForRecordType of type {urn:enterprise.soap.sforce.com}PicklistForRecordType
     * java type: com.sforce.soap.enterprise.PicklistForRecordType[]
     */
    private boolean picklistsForRecordType__is_set = false;

    private com.sforce.soap.enterprise.PicklistForRecordType[] picklistsForRecordType = new com.sforce.soap.enterprise.PicklistForRecordType[0];

    public com.sforce.soap.enterprise.PicklistForRecordType[] getPicklistsForRecordType() {
      return picklistsForRecordType;
    }

    public void setPicklistsForRecordType(com.sforce.soap.enterprise.PicklistForRecordType[] picklistsForRecordType) {
      this.picklistsForRecordType = picklistsForRecordType;
      picklistsForRecordType__is_set = true;
    }

    protected void setPicklistsForRecordType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("picklistsForRecordType", "urn:enterprise.soap.sforce.com","picklistsForRecordType","urn:enterprise.soap.sforce.com","PicklistForRecordType",0,-1,true))) {
        setPicklistsForRecordType((com.sforce.soap.enterprise.PicklistForRecordType[])__typeMapper.readObject(__in, _lookupTypeInfo("picklistsForRecordType", "urn:enterprise.soap.sforce.com","picklistsForRecordType","urn:enterprise.soap.sforce.com","PicklistForRecordType",0,-1,true), com.sforce.soap.enterprise.PicklistForRecordType[].class));
      }
    }

    private void writeFieldPicklistsForRecordType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("picklistsForRecordType", "urn:enterprise.soap.sforce.com","picklistsForRecordType","urn:enterprise.soap.sforce.com","PicklistForRecordType",0,-1,true), picklistsForRecordType, picklistsForRecordType__is_set);
    }

    /**
     * element : recordTypeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean recordTypeId__is_set = false;

    private java.lang.String recordTypeId;

    public java.lang.String getRecordTypeId() {
      return recordTypeId;
    }

    public void setRecordTypeId(java.lang.String recordTypeId) {
      this.recordTypeId = recordTypeId;
      recordTypeId__is_set = true;
    }

    protected void setRecordTypeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("recordTypeId", "urn:enterprise.soap.sforce.com","recordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setRecordTypeId(__typeMapper.readString(__in, _lookupTypeInfo("recordTypeId", "urn:enterprise.soap.sforce.com","recordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRecordTypeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("recordTypeId", "urn:enterprise.soap.sforce.com","recordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true), recordTypeId, recordTypeId__is_set);
    }

    /**
     * element : steps of type {urn:enterprise.soap.sforce.com}DescribePathAssistantStep
     * java type: com.sforce.soap.enterprise.DescribePathAssistantStep[]
     */
    private boolean steps__is_set = false;

    private com.sforce.soap.enterprise.DescribePathAssistantStep[] steps = new com.sforce.soap.enterprise.DescribePathAssistantStep[0];

    public com.sforce.soap.enterprise.DescribePathAssistantStep[] getSteps() {
      return steps;
    }

    public void setSteps(com.sforce.soap.enterprise.DescribePathAssistantStep[] steps) {
      this.steps = steps;
      steps__is_set = true;
    }

    protected void setSteps(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("steps", "urn:enterprise.soap.sforce.com","steps","urn:enterprise.soap.sforce.com","DescribePathAssistantStep",0,-1,true))) {
        setSteps((com.sforce.soap.enterprise.DescribePathAssistantStep[])__typeMapper.readObject(__in, _lookupTypeInfo("steps", "urn:enterprise.soap.sforce.com","steps","urn:enterprise.soap.sforce.com","DescribePathAssistantStep",0,-1,true), com.sforce.soap.enterprise.DescribePathAssistantStep[].class));
      }
    }

    private void writeFieldSteps(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("steps", "urn:enterprise.soap.sforce.com","steps","urn:enterprise.soap.sforce.com","DescribePathAssistantStep",0,-1,true), steps, steps__is_set);
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
      sb.append("[DescribePathAssistant ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldActive(__out, __typeMapper);
      writeFieldApiName(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldPathPicklistField(__out, __typeMapper);
      writeFieldPicklistsForRecordType(__out, __typeMapper);
      writeFieldRecordTypeId(__out, __typeMapper);
      writeFieldSteps(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActive(__in, __typeMapper);
      setApiName(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setPathPicklistField(__in, __typeMapper);
      setPicklistsForRecordType(__in, __typeMapper);
      setRecordTypeId(__in, __typeMapper);
      setSteps(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "active", active);
      toStringHelper(sb, "apiName", apiName);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "pathPicklistField", pathPicklistField);
      toStringHelper(sb, "picklistsForRecordType", picklistsForRecordType);
      toStringHelper(sb, "recordTypeId", recordTypeId);
      toStringHelper(sb, "steps", steps);
    }


}
