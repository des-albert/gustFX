package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FieldPermissions extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FieldPermissions() {}

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
     * element : Field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Field__is_set = false;

    private java.lang.String Field;

    public java.lang.String getField() {
      return Field;
    }

    public void setField(java.lang.String Field) {
      this.Field = Field;
      Field__is_set = true;
    }

    protected void setField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Field", "urn:sobject.enterprise.soap.sforce.com","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setField(__typeMapper.readString(__in, _lookupTypeInfo("Field", "urn:sobject.enterprise.soap.sforce.com","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Field", "urn:sobject.enterprise.soap.sforce.com","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true), Field, Field__is_set);
    }

    /**
     * element : Parent of type {urn:sobject.enterprise.soap.sforce.com}PermissionSet
     * java type: com.sforce.soap.enterprise.sobject.PermissionSet
     */
    private boolean Parent__is_set = false;

    private com.sforce.soap.enterprise.sobject.PermissionSet Parent;

    public com.sforce.soap.enterprise.sobject.PermissionSet getParent() {
      return Parent;
    }

    public void setParent(com.sforce.soap.enterprise.sobject.PermissionSet Parent) {
      this.Parent = Parent;
      Parent__is_set = true;
    }

    protected void setParent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true))) {
        setParent((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true), com.sforce.soap.enterprise.sobject.PermissionSet.class));
      }
    }

    private void writeFieldParent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true), Parent, Parent__is_set);
    }

    /**
     * element : ParentId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ParentId__is_set = false;

    private java.lang.String ParentId;

    public java.lang.String getParentId() {
      return ParentId;
    }

    public void setParentId(java.lang.String ParentId) {
      this.ParentId = ParentId;
      ParentId__is_set = true;
    }

    protected void setParentId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setParentId(__typeMapper.readString(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), ParentId, ParentId__is_set);
    }

    /**
     * element : PermissionsEdit of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean PermissionsEdit__is_set = false;

    private java.lang.Boolean PermissionsEdit;

    public java.lang.Boolean getPermissionsEdit() {
      return PermissionsEdit;
    }

    public void setPermissionsEdit(java.lang.Boolean PermissionsEdit) {
      this.PermissionsEdit = PermissionsEdit;
      PermissionsEdit__is_set = true;
    }

    protected void setPermissionsEdit(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PermissionsEdit", "urn:sobject.enterprise.soap.sforce.com","PermissionsEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setPermissionsEdit((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("PermissionsEdit", "urn:sobject.enterprise.soap.sforce.com","PermissionsEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldPermissionsEdit(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PermissionsEdit", "urn:sobject.enterprise.soap.sforce.com","PermissionsEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), PermissionsEdit, PermissionsEdit__is_set);
    }

    /**
     * element : PermissionsRead of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean PermissionsRead__is_set = false;

    private java.lang.Boolean PermissionsRead;

    public java.lang.Boolean getPermissionsRead() {
      return PermissionsRead;
    }

    public void setPermissionsRead(java.lang.Boolean PermissionsRead) {
      this.PermissionsRead = PermissionsRead;
      PermissionsRead__is_set = true;
    }

    protected void setPermissionsRead(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PermissionsRead", "urn:sobject.enterprise.soap.sforce.com","PermissionsRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setPermissionsRead((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("PermissionsRead", "urn:sobject.enterprise.soap.sforce.com","PermissionsRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldPermissionsRead(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PermissionsRead", "urn:sobject.enterprise.soap.sforce.com","PermissionsRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), PermissionsRead, PermissionsRead__is_set);
    }

    /**
     * element : SobjectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SobjectType__is_set = false;

    private java.lang.String SobjectType;

    public java.lang.String getSobjectType() {
      return SobjectType;
    }

    public void setSobjectType(java.lang.String SobjectType) {
      this.SobjectType = SobjectType;
      SobjectType__is_set = true;
    }

    protected void setSobjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSobjectType(__typeMapper.readString(__in, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSobjectType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), SobjectType, SobjectType__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FieldPermissions");
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
      sb.append("[FieldPermissions ");
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
      writeFieldField(__out, __typeMapper);
      writeFieldParent(__out, __typeMapper);
      writeFieldParentId(__out, __typeMapper);
      writeFieldPermissionsEdit(__out, __typeMapper);
      writeFieldPermissionsRead(__out, __typeMapper);
      writeFieldSobjectType(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setField(__in, __typeMapper);
      setParent(__in, __typeMapper);
      setParentId(__in, __typeMapper);
      setPermissionsEdit(__in, __typeMapper);
      setPermissionsRead(__in, __typeMapper);
      setSobjectType(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Field", Field);
      toStringHelper(sb, "Parent", Parent);
      toStringHelper(sb, "ParentId", ParentId);
      toStringHelper(sb, "PermissionsEdit", PermissionsEdit);
      toStringHelper(sb, "PermissionsRead", PermissionsRead);
      toStringHelper(sb, "SobjectType", SobjectType);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
