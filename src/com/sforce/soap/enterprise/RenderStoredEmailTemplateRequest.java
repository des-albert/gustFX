package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class RenderStoredEmailTemplateRequest implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public RenderStoredEmailTemplateRequest() {}

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
     * element : attachmentRetrievalOption of type {urn:enterprise.soap.sforce.com}AttachmentRetrievalOption
     * java type: com.sforce.soap.enterprise.AttachmentRetrievalOption
     */
    private boolean attachmentRetrievalOption__is_set = false;

    private com.sforce.soap.enterprise.AttachmentRetrievalOption attachmentRetrievalOption;

    public com.sforce.soap.enterprise.AttachmentRetrievalOption getAttachmentRetrievalOption() {
      return attachmentRetrievalOption;
    }

    public void setAttachmentRetrievalOption(com.sforce.soap.enterprise.AttachmentRetrievalOption attachmentRetrievalOption) {
      this.attachmentRetrievalOption = attachmentRetrievalOption;
      attachmentRetrievalOption__is_set = true;
    }

    protected void setAttachmentRetrievalOption(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("attachmentRetrievalOption", "urn:enterprise.soap.sforce.com","attachmentRetrievalOption","urn:enterprise.soap.sforce.com","AttachmentRetrievalOption",1,1,true))) {
        setAttachmentRetrievalOption((com.sforce.soap.enterprise.AttachmentRetrievalOption)__typeMapper.readObject(__in, _lookupTypeInfo("attachmentRetrievalOption", "urn:enterprise.soap.sforce.com","attachmentRetrievalOption","urn:enterprise.soap.sforce.com","AttachmentRetrievalOption",1,1,true), com.sforce.soap.enterprise.AttachmentRetrievalOption.class));
      }
    }

    private void writeFieldAttachmentRetrievalOption(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("attachmentRetrievalOption", "urn:enterprise.soap.sforce.com","attachmentRetrievalOption","urn:enterprise.soap.sforce.com","AttachmentRetrievalOption",1,1,true), attachmentRetrievalOption, attachmentRetrievalOption__is_set);
    }

    /**
     * element : templateId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean templateId__is_set = false;

    private java.lang.String templateId;

    public java.lang.String getTemplateId() {
      return templateId;
    }

    public void setTemplateId(java.lang.String templateId) {
      this.templateId = templateId;
      templateId__is_set = true;
    }

    protected void setTemplateId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("templateId", "urn:enterprise.soap.sforce.com","templateId","urn:enterprise.soap.sforce.com","ID",1,1,true))) {
        setTemplateId(__typeMapper.readString(__in, _lookupTypeInfo("templateId", "urn:enterprise.soap.sforce.com","templateId","urn:enterprise.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTemplateId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("templateId", "urn:enterprise.soap.sforce.com","templateId","urn:enterprise.soap.sforce.com","ID",1,1,true), templateId, templateId__is_set);
    }

    /**
     * element : updateTemplateUsage of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean updateTemplateUsage__is_set = false;

    private boolean updateTemplateUsage;

    public boolean getUpdateTemplateUsage() {
      return updateTemplateUsage;
    }

    public boolean isUpdateTemplateUsage() {
      return updateTemplateUsage;
    }

    public void setUpdateTemplateUsage(boolean updateTemplateUsage) {
      this.updateTemplateUsage = updateTemplateUsage;
      updateTemplateUsage__is_set = true;
    }

    protected void setUpdateTemplateUsage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("updateTemplateUsage", "urn:enterprise.soap.sforce.com","updateTemplateUsage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setUpdateTemplateUsage(__typeMapper.readBoolean(__in, _lookupTypeInfo("updateTemplateUsage", "urn:enterprise.soap.sforce.com","updateTemplateUsage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldUpdateTemplateUsage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("updateTemplateUsage", "urn:enterprise.soap.sforce.com","updateTemplateUsage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), updateTemplateUsage, updateTemplateUsage__is_set);
    }

    /**
     * element : whatId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean whatId__is_set = false;

    private java.lang.String whatId;

    public java.lang.String getWhatId() {
      return whatId;
    }

    public void setWhatId(java.lang.String whatId) {
      this.whatId = whatId;
      whatId__is_set = true;
    }

    protected void setWhatId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("whatId", "urn:enterprise.soap.sforce.com","whatId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setWhatId(__typeMapper.readString(__in, _lookupTypeInfo("whatId", "urn:enterprise.soap.sforce.com","whatId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldWhatId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("whatId", "urn:enterprise.soap.sforce.com","whatId","urn:enterprise.soap.sforce.com","ID",0,1,true), whatId, whatId__is_set);
    }

    /**
     * element : whoId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean whoId__is_set = false;

    private java.lang.String whoId;

    public java.lang.String getWhoId() {
      return whoId;
    }

    public void setWhoId(java.lang.String whoId) {
      this.whoId = whoId;
      whoId__is_set = true;
    }

    protected void setWhoId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("whoId", "urn:enterprise.soap.sforce.com","whoId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setWhoId(__typeMapper.readString(__in, _lookupTypeInfo("whoId", "urn:enterprise.soap.sforce.com","whoId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldWhoId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("whoId", "urn:enterprise.soap.sforce.com","whoId","urn:enterprise.soap.sforce.com","ID",0,1,true), whoId, whoId__is_set);
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
      sb.append("[RenderStoredEmailTemplateRequest ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAttachmentRetrievalOption(__out, __typeMapper);
      writeFieldTemplateId(__out, __typeMapper);
      writeFieldUpdateTemplateUsage(__out, __typeMapper);
      writeFieldWhatId(__out, __typeMapper);
      writeFieldWhoId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAttachmentRetrievalOption(__in, __typeMapper);
      setTemplateId(__in, __typeMapper);
      setUpdateTemplateUsage(__in, __typeMapper);
      setWhatId(__in, __typeMapper);
      setWhoId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "attachmentRetrievalOption", attachmentRetrievalOption);
      toStringHelper(sb, "templateId", templateId);
      toStringHelper(sb, "updateTemplateUsage", updateTemplateUsage);
      toStringHelper(sb, "whatId", whatId);
      toStringHelper(sb, "whoId", whoId);
    }


}
