package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeSoftphoneLayoutSection implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeSoftphoneLayoutSection() {}

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
     * element : entityApiName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean entityApiName__is_set = false;

    private java.lang.String entityApiName;

    public java.lang.String getEntityApiName() {
      return entityApiName;
    }

    public void setEntityApiName(java.lang.String entityApiName) {
      this.entityApiName = entityApiName;
      entityApiName__is_set = true;
    }

    protected void setEntityApiName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("entityApiName", "urn:enterprise.soap.sforce.com","entityApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEntityApiName(__typeMapper.readString(__in, _lookupTypeInfo("entityApiName", "urn:enterprise.soap.sforce.com","entityApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEntityApiName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("entityApiName", "urn:enterprise.soap.sforce.com","entityApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), entityApiName, entityApiName__is_set);
    }

    /**
     * element : items of type {urn:enterprise.soap.sforce.com}DescribeSoftphoneLayoutItem
     * java type: com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[]
     */
    private boolean items__is_set = false;

    private com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[] items = new com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[0];

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[] getItems() {
      return items;
    }

    public void setItems(com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[] items) {
      this.items = items;
      items__is_set = true;
    }

    protected void setItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("items", "urn:enterprise.soap.sforce.com","items","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutItem",1,-1,true))) {
        setItems((com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[])__typeMapper.readObject(__in, _lookupTypeInfo("items", "urn:enterprise.soap.sforce.com","items","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutItem",1,-1,true), com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem[].class));
      }
    }

    private void writeFieldItems(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("items", "urn:enterprise.soap.sforce.com","items","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutItem",1,-1,true), items, items__is_set);
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
      sb.append("[DescribeSoftphoneLayoutSection ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEntityApiName(__out, __typeMapper);
      writeFieldItems(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEntityApiName(__in, __typeMapper);
      setItems(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "entityApiName", entityApiName);
      toStringHelper(sb, "items", items);
    }


}
