package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class RelatedContent implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public RelatedContent() {}

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
     * element : relatedContentItems of type {urn:enterprise.soap.sforce.com}DescribeRelatedContentItem
     * java type: com.sforce.soap.enterprise.DescribeRelatedContentItem[]
     */
    private boolean relatedContentItems__is_set = false;

    private com.sforce.soap.enterprise.DescribeRelatedContentItem[] relatedContentItems = new com.sforce.soap.enterprise.DescribeRelatedContentItem[0];

    public com.sforce.soap.enterprise.DescribeRelatedContentItem[] getRelatedContentItems() {
      return relatedContentItems;
    }

    public void setRelatedContentItems(com.sforce.soap.enterprise.DescribeRelatedContentItem[] relatedContentItems) {
      this.relatedContentItems = relatedContentItems;
      relatedContentItems__is_set = true;
    }

    protected void setRelatedContentItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("relatedContentItems", "urn:enterprise.soap.sforce.com","relatedContentItems","urn:enterprise.soap.sforce.com","DescribeRelatedContentItem",1,-1,true))) {
        setRelatedContentItems((com.sforce.soap.enterprise.DescribeRelatedContentItem[])__typeMapper.readObject(__in, _lookupTypeInfo("relatedContentItems", "urn:enterprise.soap.sforce.com","relatedContentItems","urn:enterprise.soap.sforce.com","DescribeRelatedContentItem",1,-1,true), com.sforce.soap.enterprise.DescribeRelatedContentItem[].class));
      }
    }

    private void writeFieldRelatedContentItems(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("relatedContentItems", "urn:enterprise.soap.sforce.com","relatedContentItems","urn:enterprise.soap.sforce.com","DescribeRelatedContentItem",1,-1,true), relatedContentItems, relatedContentItems__is_set);
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
      sb.append("[RelatedContent ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldRelatedContentItems(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setRelatedContentItems(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "relatedContentItems", relatedContentItems);
    }


}