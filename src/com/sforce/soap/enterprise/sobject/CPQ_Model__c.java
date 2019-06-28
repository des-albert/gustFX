package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CPQ_Model__c extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public CPQ_Model__c() {}

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
     * element : Doc_Config_Details__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Doc_Config_Details__c__is_set = false;

    private java.lang.String Doc_Config_Details__c;

    public java.lang.String getDoc_Config_Details__c() {
      return Doc_Config_Details__c;
    }

    public void setDoc_Config_Details__c(java.lang.String Doc_Config_Details__c) {
      this.Doc_Config_Details__c = Doc_Config_Details__c;
      Doc_Config_Details__c__is_set = true;
    }

    protected void setDoc_Config_Details__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Config_Details__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Details__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDoc_Config_Details__c(__typeMapper.readString(__in, _lookupTypeInfo("Doc_Config_Details__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Details__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDoc_Config_Details__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Config_Details__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Details__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Doc_Config_Details__c, Doc_Config_Details__c__is_set);
    }

    /**
     * element : Doc_Config_Name__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Doc_Config_Name__c__is_set = false;

    private java.lang.String Doc_Config_Name__c;

    public java.lang.String getDoc_Config_Name__c() {
      return Doc_Config_Name__c;
    }

    public void setDoc_Config_Name__c(java.lang.String Doc_Config_Name__c) {
      this.Doc_Config_Name__c = Doc_Config_Name__c;
      Doc_Config_Name__c__is_set = true;
    }

    protected void setDoc_Config_Name__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Config_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDoc_Config_Name__c(__typeMapper.readString(__in, _lookupTypeInfo("Doc_Config_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDoc_Config_Name__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Config_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Config_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Doc_Config_Name__c, Doc_Config_Name__c__is_set);
    }

    /**
     * element : Doc_Description__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Doc_Description__c__is_set = false;

    private java.lang.String Doc_Description__c;

    public java.lang.String getDoc_Description__c() {
      return Doc_Description__c;
    }

    public void setDoc_Description__c(java.lang.String Doc_Description__c) {
      this.Doc_Description__c = Doc_Description__c;
      Doc_Description__c__is_set = true;
    }

    protected void setDoc_Description__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Description__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDoc_Description__c(__typeMapper.readString(__in, _lookupTypeInfo("Doc_Description__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDoc_Description__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Description__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Doc_Description__c, Doc_Description__c__is_set);
    }

    /**
     * element : Doc_Item_Count__c of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean Doc_Item_Count__c__is_set = false;

    private java.lang.Double Doc_Item_Count__c;

    public java.lang.Double getDoc_Item_Count__c() {
      return Doc_Item_Count__c;
    }

    public void setDoc_Item_Count__c(java.lang.Double Doc_Item_Count__c) {
      this.Doc_Item_Count__c = Doc_Item_Count__c;
      Doc_Item_Count__c__is_set = true;
    }

    protected void setDoc_Item_Count__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Item_Count__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Item_Count__c","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setDoc_Item_Count__c((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("Doc_Item_Count__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Item_Count__c","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldDoc_Item_Count__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Item_Count__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Item_Count__c","http://www.w3.org/2001/XMLSchema","double",0,1,true), Doc_Item_Count__c, Doc_Item_Count__c__is_set);
    }

    /**
     * element : Doc_Name__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Doc_Name__c__is_set = false;

    private java.lang.String Doc_Name__c;

    public java.lang.String getDoc_Name__c() {
      return Doc_Name__c;
    }

    public void setDoc_Name__c(java.lang.String Doc_Name__c) {
      this.Doc_Name__c = Doc_Name__c;
      Doc_Name__c__is_set = true;
    }

    protected void setDoc_Name__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDoc_Name__c(__typeMapper.readString(__in, _lookupTypeInfo("Doc_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDoc_Name__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Name__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Doc_Name__c, Doc_Name__c__is_set);
    }

    /**
     * element : Doc_Number__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Doc_Number__c__is_set = false;

    private java.lang.String Doc_Number__c;

    public java.lang.String getDoc_Number__c() {
      return Doc_Number__c;
    }

    public void setDoc_Number__c(java.lang.String Doc_Number__c) {
      this.Doc_Number__c = Doc_Number__c;
      Doc_Number__c__is_set = true;
    }

    protected void setDoc_Number__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Doc_Number__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDoc_Number__c(__typeMapper.readString(__in, _lookupTypeInfo("Doc_Number__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDoc_Number__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Doc_Number__c", "urn:sobject.enterprise.soap.sforce.com","Doc_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Doc_Number__c, Doc_Number__c__is_set);
    }

    /**
     * element : Id of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Id__is_set = false;

    private java.lang.String Id;

    public java.lang.String getId() {
      return Id;
    }

    public void setId(java.lang.String Id) {
      this.Id = Id;
      Id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setId(__typeMapper.readString(__in, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true), Id, Id__is_set);
    }

    /**
     * element : Model_Name__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Model_Name__c__is_set = false;

    private java.lang.String Model_Name__c;

    public java.lang.String getModel_Name__c() {
      return Model_Name__c;
    }

    public void setModel_Name__c(java.lang.String Model_Name__c) {
      this.Model_Name__c = Model_Name__c;
      Model_Name__c__is_set = true;
    }

    protected void setModel_Name__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Model_Name__c", "urn:sobject.enterprise.soap.sforce.com","Model_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setModel_Name__c(__typeMapper.readString(__in, _lookupTypeInfo("Model_Name__c", "urn:sobject.enterprise.soap.sforce.com","Model_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldModel_Name__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Model_Name__c", "urn:sobject.enterprise.soap.sforce.com","Model_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Model_Name__c, Model_Name__c__is_set);
    }

    /**
     * element : Parent_Quote_Model__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Parent_Quote_Model__c__is_set = false;

    private java.lang.String Parent_Quote_Model__c;

    public java.lang.String getParent_Quote_Model__c() {
      return Parent_Quote_Model__c;
    }

    public void setParent_Quote_Model__c(java.lang.String Parent_Quote_Model__c) {
      this.Parent_Quote_Model__c = Parent_Quote_Model__c;
      Parent_Quote_Model__c__is_set = true;
    }

    protected void setParent_Quote_Model__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Parent_Quote_Model__c", "urn:sobject.enterprise.soap.sforce.com","Parent_Quote_Model__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setParent_Quote_Model__c(__typeMapper.readString(__in, _lookupTypeInfo("Parent_Quote_Model__c", "urn:sobject.enterprise.soap.sforce.com","Parent_Quote_Model__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParent_Quote_Model__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Parent_Quote_Model__c", "urn:sobject.enterprise.soap.sforce.com","Parent_Quote_Model__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Parent_Quote_Model__c, Parent_Quote_Model__c__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CPQ_Model__c");
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
      sb.append("[CPQ_Model__c ");
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
      writeFieldDoc_Config_Details__c(__out, __typeMapper);
      writeFieldDoc_Config_Name__c(__out, __typeMapper);
      writeFieldDoc_Description__c(__out, __typeMapper);
      writeFieldDoc_Item_Count__c(__out, __typeMapper);
      writeFieldDoc_Name__c(__out, __typeMapper);
      writeFieldDoc_Number__c(__out, __typeMapper);
      writeFieldId(__out, __typeMapper);
      writeFieldModel_Name__c(__out, __typeMapper);
      writeFieldParent_Quote_Model__c(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDoc_Config_Details__c(__in, __typeMapper);
      setDoc_Config_Name__c(__in, __typeMapper);
      setDoc_Description__c(__in, __typeMapper);
      setDoc_Item_Count__c(__in, __typeMapper);
      setDoc_Name__c(__in, __typeMapper);
      setDoc_Number__c(__in, __typeMapper);
      setId(__in, __typeMapper);
      setModel_Name__c(__in, __typeMapper);
      setParent_Quote_Model__c(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Doc_Config_Details__c", Doc_Config_Details__c);
      toStringHelper(sb, "Doc_Config_Name__c", Doc_Config_Name__c);
      toStringHelper(sb, "Doc_Description__c", Doc_Description__c);
      toStringHelper(sb, "Doc_Item_Count__c", Doc_Item_Count__c);
      toStringHelper(sb, "Doc_Name__c", Doc_Name__c);
      toStringHelper(sb, "Doc_Number__c", Doc_Number__c);
      toStringHelper(sb, "Id", Id);
      toStringHelper(sb, "Model_Name__c", Model_Name__c);
      toStringHelper(sb, "Parent_Quote_Model__c", Parent_Quote_Model__c);
    }


}