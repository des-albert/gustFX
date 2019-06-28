package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class PackageLicense extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public PackageLicense() {}

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
     * element : AllowedLicenses of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean AllowedLicenses__is_set = false;

    private java.lang.Integer AllowedLicenses;

    public java.lang.Integer getAllowedLicenses() {
      return AllowedLicenses;
    }

    public void setAllowedLicenses(java.lang.Integer AllowedLicenses) {
      this.AllowedLicenses = AllowedLicenses;
      AllowedLicenses__is_set = true;
    }

    protected void setAllowedLicenses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AllowedLicenses", "urn:sobject.enterprise.soap.sforce.com","AllowedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setAllowedLicenses((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("AllowedLicenses", "urn:sobject.enterprise.soap.sforce.com","AllowedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldAllowedLicenses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AllowedLicenses", "urn:sobject.enterprise.soap.sforce.com","AllowedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true), AllowedLicenses, AllowedLicenses__is_set);
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
     * element : ExpirationDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean ExpirationDate__is_set = false;

    private java.util.Calendar ExpirationDate;

    public java.util.Calendar getExpirationDate() {
      return ExpirationDate;
    }

    public void setExpirationDate(java.util.Calendar ExpirationDate) {
      this.ExpirationDate = ExpirationDate;
      ExpirationDate__is_set = true;
    }

    protected void setExpirationDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ExpirationDate", "urn:sobject.enterprise.soap.sforce.com","ExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("ExpirationDate", "urn:sobject.enterprise.soap.sforce.com","ExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldExpirationDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ExpirationDate", "urn:sobject.enterprise.soap.sforce.com","ExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), ExpirationDate, ExpirationDate__is_set);
    }

    /**
     * element : IsProvisioned of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsProvisioned__is_set = false;

    private java.lang.Boolean IsProvisioned;

    public java.lang.Boolean getIsProvisioned() {
      return IsProvisioned;
    }

    public void setIsProvisioned(java.lang.Boolean IsProvisioned) {
      this.IsProvisioned = IsProvisioned;
      IsProvisioned__is_set = true;
    }

    protected void setIsProvisioned(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsProvisioned", "urn:sobject.enterprise.soap.sforce.com","IsProvisioned","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsProvisioned((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsProvisioned", "urn:sobject.enterprise.soap.sforce.com","IsProvisioned","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsProvisioned(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsProvisioned", "urn:sobject.enterprise.soap.sforce.com","IsProvisioned","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsProvisioned, IsProvisioned__is_set);
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    protected void setLastModifiedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastModifiedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastModifiedDate, LastModifiedDate__is_set);
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
     * element : Status of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Status__is_set = false;

    private java.lang.String Status;

    public java.lang.String getStatus() {
      return Status;
    }

    public void setStatus(java.lang.String Status) {
      this.Status = Status;
      Status__is_set = true;
    }

    protected void setStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStatus(__typeMapper.readString(__in, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), Status, Status__is_set);
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
     * element : UsedLicenses of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean UsedLicenses__is_set = false;

    private java.lang.Integer UsedLicenses;

    public java.lang.Integer getUsedLicenses() {
      return UsedLicenses;
    }

    public void setUsedLicenses(java.lang.Integer UsedLicenses) {
      this.UsedLicenses = UsedLicenses;
      UsedLicenses__is_set = true;
    }

    protected void setUsedLicenses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UsedLicenses", "urn:sobject.enterprise.soap.sforce.com","UsedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setUsedLicenses((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("UsedLicenses", "urn:sobject.enterprise.soap.sforce.com","UsedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldUsedLicenses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UsedLicenses", "urn:sobject.enterprise.soap.sforce.com","UsedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true), UsedLicenses, UsedLicenses__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PackageLicense");
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
      sb.append("[PackageLicense ");
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
      writeFieldAllowedLicenses(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldExpirationDate(__out, __typeMapper);
      writeFieldIsProvisioned(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldNamespacePrefix(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldUsedLicenses(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAllowedLicenses(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setExpirationDate(__in, __typeMapper);
      setIsProvisioned(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setNamespacePrefix(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setUsedLicenses(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AllowedLicenses", AllowedLicenses);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "ExpirationDate", ExpirationDate);
      toStringHelper(sb, "IsProvisioned", IsProvisioned);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "NamespacePrefix", NamespacePrefix);
      toStringHelper(sb, "Status", Status);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "UsedLicenses", UsedLicenses);
    }


}
