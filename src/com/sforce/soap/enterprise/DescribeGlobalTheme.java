package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeGlobalTheme implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeGlobalTheme() {}

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
     * element : global of type {urn:enterprise.soap.sforce.com}DescribeGlobalResult
     * java type: com.sforce.soap.enterprise.DescribeGlobalResult
     */
    private boolean global__is_set = false;

    private com.sforce.soap.enterprise.DescribeGlobalResult global;

    public com.sforce.soap.enterprise.DescribeGlobalResult getGlobal() {
      return global;
    }

    public void setGlobal(com.sforce.soap.enterprise.DescribeGlobalResult global) {
      this.global = global;
      global__is_set = true;
    }

    protected void setGlobal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("global", "urn:enterprise.soap.sforce.com","global","urn:enterprise.soap.sforce.com","DescribeGlobalResult",1,1,true))) {
        setGlobal((com.sforce.soap.enterprise.DescribeGlobalResult)__typeMapper.readObject(__in, _lookupTypeInfo("global", "urn:enterprise.soap.sforce.com","global","urn:enterprise.soap.sforce.com","DescribeGlobalResult",1,1,true), com.sforce.soap.enterprise.DescribeGlobalResult.class));
      }
    }

    private void writeFieldGlobal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("global", "urn:enterprise.soap.sforce.com","global","urn:enterprise.soap.sforce.com","DescribeGlobalResult",1,1,true), global, global__is_set);
    }

    /**
     * element : theme of type {urn:enterprise.soap.sforce.com}DescribeThemeResult
     * java type: com.sforce.soap.enterprise.DescribeThemeResult
     */
    private boolean theme__is_set = false;

    private com.sforce.soap.enterprise.DescribeThemeResult theme;

    public com.sforce.soap.enterprise.DescribeThemeResult getTheme() {
      return theme;
    }

    public void setTheme(com.sforce.soap.enterprise.DescribeThemeResult theme) {
      this.theme = theme;
      theme__is_set = true;
    }

    protected void setTheme(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("theme", "urn:enterprise.soap.sforce.com","theme","urn:enterprise.soap.sforce.com","DescribeThemeResult",1,1,true))) {
        setTheme((com.sforce.soap.enterprise.DescribeThemeResult)__typeMapper.readObject(__in, _lookupTypeInfo("theme", "urn:enterprise.soap.sforce.com","theme","urn:enterprise.soap.sforce.com","DescribeThemeResult",1,1,true), com.sforce.soap.enterprise.DescribeThemeResult.class));
      }
    }

    private void writeFieldTheme(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("theme", "urn:enterprise.soap.sforce.com","theme","urn:enterprise.soap.sforce.com","DescribeThemeResult",1,1,true), theme, theme__is_set);
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
      sb.append("[DescribeGlobalTheme ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldGlobal(__out, __typeMapper);
      writeFieldTheme(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setGlobal(__in, __typeMapper);
      setTheme(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "global", global);
      toStringHelper(sb, "theme", theme);
    }


}