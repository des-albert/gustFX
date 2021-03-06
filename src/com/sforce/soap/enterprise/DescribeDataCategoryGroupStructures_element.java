package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeDataCategoryGroupStructures_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeDataCategoryGroupStructures_element() {}

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
     * element : pairs of type {urn:enterprise.soap.sforce.com}DataCategoryGroupSobjectTypePair
     * java type: com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[]
     */
    private boolean pairs__is_set = false;

    private com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs = new com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[0];

    public com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] getPairs() {
      return pairs;
    }

    public void setPairs(com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs) {
      this.pairs = pairs;
      pairs__is_set = true;
    }

    protected void setPairs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("pairs", "urn:enterprise.soap.sforce.com","pairs","urn:enterprise.soap.sforce.com","DataCategoryGroupSobjectTypePair",0,100,true))) {
        setPairs((com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[])__typeMapper.readObject(__in, _lookupTypeInfo("pairs", "urn:enterprise.soap.sforce.com","pairs","urn:enterprise.soap.sforce.com","DataCategoryGroupSobjectTypePair",0,100,true), com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[].class));
      }
    }

    private void writeFieldPairs(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("pairs", "urn:enterprise.soap.sforce.com","pairs","urn:enterprise.soap.sforce.com","DataCategoryGroupSobjectTypePair",0,100,true), pairs, pairs__is_set);
    }

    /**
     * element : topCategoriesOnly of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean topCategoriesOnly__is_set = false;

    private boolean topCategoriesOnly;

    public boolean getTopCategoriesOnly() {
      return topCategoriesOnly;
    }

    public boolean isTopCategoriesOnly() {
      return topCategoriesOnly;
    }

    public void setTopCategoriesOnly(boolean topCategoriesOnly) {
      this.topCategoriesOnly = topCategoriesOnly;
      topCategoriesOnly__is_set = true;
    }

    protected void setTopCategoriesOnly(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("topCategoriesOnly", "urn:enterprise.soap.sforce.com","topCategoriesOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setTopCategoriesOnly(__typeMapper.readBoolean(__in, _lookupTypeInfo("topCategoriesOnly", "urn:enterprise.soap.sforce.com","topCategoriesOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldTopCategoriesOnly(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("topCategoriesOnly", "urn:enterprise.soap.sforce.com","topCategoriesOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), topCategoriesOnly, topCategoriesOnly__is_set);
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
      sb.append("[DescribeDataCategoryGroupStructures_element ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldPairs(__out, __typeMapper);
      writeFieldTopCategoriesOnly(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setPairs(__in, __typeMapper);
      setTopCategoriesOnly(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "pairs", pairs);
      toStringHelper(sb, "topCategoriesOnly", topCategoriesOnly);
    }


}
