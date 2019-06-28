package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class AuraDefinitionBundleInfo extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public AuraDefinitionBundleInfo() {}

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
     * element : ApiVersion of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ApiVersion__is_set = false;

    private java.lang.Double ApiVersion;

    public java.lang.Double getApiVersion() {
      return ApiVersion;
    }

    public void setApiVersion(java.lang.Double ApiVersion) {
      this.ApiVersion = ApiVersion;
      ApiVersion__is_set = true;
    }

    protected void setApiVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApiVersion", "urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setApiVersion((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ApiVersion", "urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldApiVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApiVersion", "urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), ApiVersion, ApiVersion__is_set);
    }

    /**
     * element : AuraDefinitionBundleId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AuraDefinitionBundleId__is_set = false;

    private java.lang.String AuraDefinitionBundleId;

    public java.lang.String getAuraDefinitionBundleId() {
      return AuraDefinitionBundleId;
    }

    public void setAuraDefinitionBundleId(java.lang.String AuraDefinitionBundleId) {
      this.AuraDefinitionBundleId = AuraDefinitionBundleId;
      AuraDefinitionBundleId__is_set = true;
    }

    protected void setAuraDefinitionBundleId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AuraDefinitionBundleId", "urn:sobject.enterprise.soap.sforce.com","AuraDefinitionBundleId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAuraDefinitionBundleId(__typeMapper.readString(__in, _lookupTypeInfo("AuraDefinitionBundleId", "urn:sobject.enterprise.soap.sforce.com","AuraDefinitionBundleId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAuraDefinitionBundleId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AuraDefinitionBundleId", "urn:sobject.enterprise.soap.sforce.com","AuraDefinitionBundleId","http://www.w3.org/2001/XMLSchema","string",0,1,true), AuraDefinitionBundleId, AuraDefinitionBundleId__is_set);
    }

    /**
     * element : Bundle of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean Bundle__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Bundle;

    public com.sforce.soap.enterprise.QueryResult getBundle() {
      return Bundle;
    }

    public void setBundle(com.sforce.soap.enterprise.QueryResult Bundle) {
      this.Bundle = Bundle;
      Bundle__is_set = true;
    }

    protected void setBundle(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Bundle", "urn:sobject.enterprise.soap.sforce.com","Bundle","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setBundle((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("Bundle", "urn:sobject.enterprise.soap.sforce.com","Bundle","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldBundle(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Bundle", "urn:sobject.enterprise.soap.sforce.com","Bundle","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), Bundle, Bundle__is_set);
    }

    /**
     * element : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DeveloperName__is_set = false;

    private java.lang.String DeveloperName;

    public java.lang.String getDeveloperName() {
      return DeveloperName;
    }

    public void setDeveloperName(java.lang.String DeveloperName) {
      this.DeveloperName = DeveloperName;
      DeveloperName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDeveloperName(__typeMapper.readString(__in, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeveloperName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true), DeveloperName, DeveloperName__is_set);
    }

    /**
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean NamespacePrefix__is_set = false;

    private java.lang.String NamespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return NamespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String NamespacePrefix) {
      this.NamespacePrefix = NamespacePrefix;
      NamespacePrefix__is_set = true;
    }

    protected void setNamespacePrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setNamespacePrefix(__typeMapper.readString(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNamespacePrefix(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("NamespacePrefix", "urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), NamespacePrefix, NamespacePrefix__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AuraDefinitionBundleInfo");
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
      sb.append("[AuraDefinitionBundleInfo ");
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
      writeFieldApiVersion(__out, __typeMapper);
      writeFieldAuraDefinitionBundleId(__out, __typeMapper);
      writeFieldBundle(__out, __typeMapper);
      writeFieldDeveloperName(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldNamespacePrefix(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApiVersion(__in, __typeMapper);
      setAuraDefinitionBundleId(__in, __typeMapper);
      setBundle(__in, __typeMapper);
      setDeveloperName(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setNamespacePrefix(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ApiVersion", ApiVersion);
      toStringHelper(sb, "AuraDefinitionBundleId", AuraDefinitionBundleId);
      toStringHelper(sb, "Bundle", Bundle);
      toStringHelper(sb, "DeveloperName", DeveloperName);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "NamespacePrefix", NamespacePrefix);
    }


}
