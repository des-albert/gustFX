package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ContentDocumentHistory extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ContentDocumentHistory() {}

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
     * element : ContentDocument of type {urn:sobject.enterprise.soap.sforce.com}ContentDocument
     * java type: com.sforce.soap.enterprise.sobject.ContentDocument
     */
    private boolean ContentDocument__is_set = false;

    private com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument;

    public com.sforce.soap.enterprise.sobject.ContentDocument getContentDocument() {
      return ContentDocument;
    }

    public void setContentDocument(com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument) {
      this.ContentDocument = ContentDocument;
      ContentDocument__is_set = true;
    }

    protected void setContentDocument(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentDocument", "urn:sobject.enterprise.soap.sforce.com","ContentDocument","urn:sobject.enterprise.soap.sforce.com","ContentDocument",0,1,true))) {
        setContentDocument((com.sforce.soap.enterprise.sobject.ContentDocument)__typeMapper.readObject(__in, _lookupTypeInfo("ContentDocument", "urn:sobject.enterprise.soap.sforce.com","ContentDocument","urn:sobject.enterprise.soap.sforce.com","ContentDocument",0,1,true), com.sforce.soap.enterprise.sobject.ContentDocument.class));
      }
    }

    private void writeFieldContentDocument(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentDocument", "urn:sobject.enterprise.soap.sforce.com","ContentDocument","urn:sobject.enterprise.soap.sforce.com","ContentDocument",0,1,true), ContentDocument, ContentDocument__is_set);
    }

    /**
     * element : ContentDocumentId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ContentDocumentId__is_set = false;

    private java.lang.String ContentDocumentId;

    public java.lang.String getContentDocumentId() {
      return ContentDocumentId;
    }

    public void setContentDocumentId(java.lang.String ContentDocumentId) {
      this.ContentDocumentId = ContentDocumentId;
      ContentDocumentId__is_set = true;
    }

    protected void setContentDocumentId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentDocumentId", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setContentDocumentId(__typeMapper.readString(__in, _lookupTypeInfo("ContentDocumentId", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContentDocumentId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentDocumentId", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentId","urn:enterprise.soap.sforce.com","ID",0,1,true), ContentDocumentId, ContentDocumentId__is_set);
    }

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject CreatedBy;

    public com.sforce.soap.enterprise.sobject.SObject getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.SObject CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setCreatedBy((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), CreatedBy, CreatedBy__is_set);
    }

    /**
     * element : CreatedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    protected void setCreatedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setCreatedById(__typeMapper.readString(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCreatedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), CreatedById, CreatedById__is_set);
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    protected void setCreatedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCreatedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CreatedDate, CreatedDate__is_set);
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
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    protected void setIsDeleted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsDeleted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsDeleted, IsDeleted__is_set);
    }

    /**
     * element : NewValue of type {http://www.w3.org/2001/XMLSchema}anyType
     * java type: java.lang.Object
     */
    private boolean NewValue__is_set = false;

    private java.lang.Object NewValue;

    public java.lang.Object getNewValue() {
      return NewValue;
    }

    public void setNewValue(java.lang.Object NewValue) {
      this.NewValue = NewValue;
      NewValue__is_set = true;
    }

    protected void setNewValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("NewValue", "urn:sobject.enterprise.soap.sforce.com","NewValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true))) {
        setNewValue((java.lang.Object)__typeMapper.readObject(__in, _lookupTypeInfo("NewValue", "urn:sobject.enterprise.soap.sforce.com","NewValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true), java.lang.Object.class));
      }
    }

    private void writeFieldNewValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("NewValue", "urn:sobject.enterprise.soap.sforce.com","NewValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true), NewValue, NewValue__is_set);
    }

    /**
     * element : OldValue of type {http://www.w3.org/2001/XMLSchema}anyType
     * java type: java.lang.Object
     */
    private boolean OldValue__is_set = false;

    private java.lang.Object OldValue;

    public java.lang.Object getOldValue() {
      return OldValue;
    }

    public void setOldValue(java.lang.Object OldValue) {
      this.OldValue = OldValue;
      OldValue__is_set = true;
    }

    protected void setOldValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OldValue", "urn:sobject.enterprise.soap.sforce.com","OldValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true))) {
        setOldValue((java.lang.Object)__typeMapper.readObject(__in, _lookupTypeInfo("OldValue", "urn:sobject.enterprise.soap.sforce.com","OldValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true), java.lang.Object.class));
      }
    }

    private void writeFieldOldValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OldValue", "urn:sobject.enterprise.soap.sforce.com","OldValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true), OldValue, OldValue__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentDocumentHistory");
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
      sb.append("[ContentDocumentHistory ");
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
      writeFieldContentDocument(__out, __typeMapper);
      writeFieldContentDocumentId(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldField(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldNewValue(__out, __typeMapper);
      writeFieldOldValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setContentDocument(__in, __typeMapper);
      setContentDocumentId(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setField(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setNewValue(__in, __typeMapper);
      setOldValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ContentDocument", ContentDocument);
      toStringHelper(sb, "ContentDocumentId", ContentDocumentId);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "Field", Field);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "NewValue", NewValue);
      toStringHelper(sb, "OldValue", OldValue);
    }


}
