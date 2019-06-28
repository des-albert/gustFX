package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class PermissionSetAssignment extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public PermissionSetAssignment() {}

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
     * element : Assignee of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean Assignee__is_set = false;

    private com.sforce.soap.enterprise.sobject.User Assignee;

    public com.sforce.soap.enterprise.sobject.User getAssignee() {
      return Assignee;
    }

    public void setAssignee(com.sforce.soap.enterprise.sobject.User Assignee) {
      this.Assignee = Assignee;
      Assignee__is_set = true;
    }

    protected void setAssignee(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Assignee", "urn:sobject.enterprise.soap.sforce.com","Assignee","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setAssignee((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("Assignee", "urn:sobject.enterprise.soap.sforce.com","Assignee","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldAssignee(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Assignee", "urn:sobject.enterprise.soap.sforce.com","Assignee","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), Assignee, Assignee__is_set);
    }

    /**
     * element : AssigneeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean AssigneeId__is_set = false;

    private java.lang.String AssigneeId;

    public java.lang.String getAssigneeId() {
      return AssigneeId;
    }

    public void setAssigneeId(java.lang.String AssigneeId) {
      this.AssigneeId = AssigneeId;
      AssigneeId__is_set = true;
    }

    protected void setAssigneeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssigneeId", "urn:sobject.enterprise.soap.sforce.com","AssigneeId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAssigneeId(__typeMapper.readString(__in, _lookupTypeInfo("AssigneeId", "urn:sobject.enterprise.soap.sforce.com","AssigneeId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssigneeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssigneeId", "urn:sobject.enterprise.soap.sforce.com","AssigneeId","urn:enterprise.soap.sforce.com","ID",0,1,true), AssigneeId, AssigneeId__is_set);
    }

    /**
     * element : PermissionSet of type {urn:sobject.enterprise.soap.sforce.com}PermissionSet
     * java type: com.sforce.soap.enterprise.sobject.PermissionSet
     */
    private boolean PermissionSet__is_set = false;

    private com.sforce.soap.enterprise.sobject.PermissionSet PermissionSet;

    public com.sforce.soap.enterprise.sobject.PermissionSet getPermissionSet() {
      return PermissionSet;
    }

    public void setPermissionSet(com.sforce.soap.enterprise.sobject.PermissionSet PermissionSet) {
      this.PermissionSet = PermissionSet;
      PermissionSet__is_set = true;
    }

    protected void setPermissionSet(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PermissionSet", "urn:sobject.enterprise.soap.sforce.com","PermissionSet","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true))) {
        setPermissionSet((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, _lookupTypeInfo("PermissionSet", "urn:sobject.enterprise.soap.sforce.com","PermissionSet","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true), com.sforce.soap.enterprise.sobject.PermissionSet.class));
      }
    }

    private void writeFieldPermissionSet(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PermissionSet", "urn:sobject.enterprise.soap.sforce.com","PermissionSet","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true), PermissionSet, PermissionSet__is_set);
    }

    /**
     * element : PermissionSetId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean PermissionSetId__is_set = false;

    private java.lang.String PermissionSetId;

    public java.lang.String getPermissionSetId() {
      return PermissionSetId;
    }

    public void setPermissionSetId(java.lang.String PermissionSetId) {
      this.PermissionSetId = PermissionSetId;
      PermissionSetId__is_set = true;
    }

    protected void setPermissionSetId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PermissionSetId", "urn:sobject.enterprise.soap.sforce.com","PermissionSetId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setPermissionSetId(__typeMapper.readString(__in, _lookupTypeInfo("PermissionSetId", "urn:sobject.enterprise.soap.sforce.com","PermissionSetId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPermissionSetId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PermissionSetId", "urn:sobject.enterprise.soap.sforce.com","PermissionSetId","urn:enterprise.soap.sforce.com","ID",0,1,true), PermissionSetId, PermissionSetId__is_set);
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    protected void setSystemModstamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldSystemModstamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), SystemModstamp, SystemModstamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignment");
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
      sb.append("[PermissionSetAssignment ");
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
      writeFieldAssignee(__out, __typeMapper);
      writeFieldAssigneeId(__out, __typeMapper);
      writeFieldPermissionSet(__out, __typeMapper);
      writeFieldPermissionSetId(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAssignee(__in, __typeMapper);
      setAssigneeId(__in, __typeMapper);
      setPermissionSet(__in, __typeMapper);
      setPermissionSetId(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Assignee", Assignee);
      toStringHelper(sb, "AssigneeId", AssigneeId);
      toStringHelper(sb, "PermissionSet", PermissionSet);
      toStringHelper(sb, "PermissionSetId", PermissionSetId);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}