package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexTestResultLimits extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ApexTestResultLimits() {}

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
     * element : ApexTestResult of type {urn:sobject.enterprise.soap.sforce.com}ApexTestResult
     * java type: com.sforce.soap.enterprise.sobject.ApexTestResult
     */
    private boolean ApexTestResult__is_set = false;

    private com.sforce.soap.enterprise.sobject.ApexTestResult ApexTestResult;

    public com.sforce.soap.enterprise.sobject.ApexTestResult getApexTestResult() {
      return ApexTestResult;
    }

    public void setApexTestResult(com.sforce.soap.enterprise.sobject.ApexTestResult ApexTestResult) {
      this.ApexTestResult = ApexTestResult;
      ApexTestResult__is_set = true;
    }

    protected void setApexTestResult(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexTestResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestResult","urn:sobject.enterprise.soap.sforce.com","ApexTestResult",0,1,true))) {
        setApexTestResult((com.sforce.soap.enterprise.sobject.ApexTestResult)__typeMapper.readObject(__in, _lookupTypeInfo("ApexTestResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestResult","urn:sobject.enterprise.soap.sforce.com","ApexTestResult",0,1,true), com.sforce.soap.enterprise.sobject.ApexTestResult.class));
      }
    }

    private void writeFieldApexTestResult(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexTestResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestResult","urn:sobject.enterprise.soap.sforce.com","ApexTestResult",0,1,true), ApexTestResult, ApexTestResult__is_set);
    }

    /**
     * element : ApexTestResultId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ApexTestResultId__is_set = false;

    private java.lang.String ApexTestResultId;

    public java.lang.String getApexTestResultId() {
      return ApexTestResultId;
    }

    public void setApexTestResultId(java.lang.String ApexTestResultId) {
      this.ApexTestResultId = ApexTestResultId;
      ApexTestResultId__is_set = true;
    }

    protected void setApexTestResultId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexTestResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestResultId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setApexTestResultId(__typeMapper.readString(__in, _lookupTypeInfo("ApexTestResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestResultId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexTestResultId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexTestResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestResultId","urn:enterprise.soap.sforce.com","ID",0,1,true), ApexTestResultId, ApexTestResultId__is_set);
    }

    /**
     * element : AsyncCalls of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean AsyncCalls__is_set = false;

    private java.lang.Integer AsyncCalls;

    public java.lang.Integer getAsyncCalls() {
      return AsyncCalls;
    }

    public void setAsyncCalls(java.lang.Integer AsyncCalls) {
      this.AsyncCalls = AsyncCalls;
      AsyncCalls__is_set = true;
    }

    protected void setAsyncCalls(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AsyncCalls", "urn:sobject.enterprise.soap.sforce.com","AsyncCalls","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setAsyncCalls((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("AsyncCalls", "urn:sobject.enterprise.soap.sforce.com","AsyncCalls","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldAsyncCalls(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AsyncCalls", "urn:sobject.enterprise.soap.sforce.com","AsyncCalls","http://www.w3.org/2001/XMLSchema","int",0,1,true), AsyncCalls, AsyncCalls__is_set);
    }

    /**
     * element : Callouts of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Callouts__is_set = false;

    private java.lang.Integer Callouts;

    public java.lang.Integer getCallouts() {
      return Callouts;
    }

    public void setCallouts(java.lang.Integer Callouts) {
      this.Callouts = Callouts;
      Callouts__is_set = true;
    }

    protected void setCallouts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Callouts", "urn:sobject.enterprise.soap.sforce.com","Callouts","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setCallouts((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Callouts", "urn:sobject.enterprise.soap.sforce.com","Callouts","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldCallouts(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Callouts", "urn:sobject.enterprise.soap.sforce.com","Callouts","http://www.w3.org/2001/XMLSchema","int",0,1,true), Callouts, Callouts__is_set);
    }

    /**
     * element : Cpu of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Cpu__is_set = false;

    private java.lang.Integer Cpu;

    public java.lang.Integer getCpu() {
      return Cpu;
    }

    public void setCpu(java.lang.Integer Cpu) {
      this.Cpu = Cpu;
      Cpu__is_set = true;
    }

    protected void setCpu(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Cpu", "urn:sobject.enterprise.soap.sforce.com","Cpu","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setCpu((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Cpu", "urn:sobject.enterprise.soap.sforce.com","Cpu","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldCpu(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Cpu", "urn:sobject.enterprise.soap.sforce.com","Cpu","http://www.w3.org/2001/XMLSchema","int",0,1,true), Cpu, Cpu__is_set);
    }

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User CreatedBy;

    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), CreatedBy, CreatedBy__is_set);
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
     * element : Dml of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Dml__is_set = false;

    private java.lang.Integer Dml;

    public java.lang.Integer getDml() {
      return Dml;
    }

    public void setDml(java.lang.Integer Dml) {
      this.Dml = Dml;
      Dml__is_set = true;
    }

    protected void setDml(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Dml", "urn:sobject.enterprise.soap.sforce.com","Dml","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setDml((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Dml", "urn:sobject.enterprise.soap.sforce.com","Dml","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldDml(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Dml", "urn:sobject.enterprise.soap.sforce.com","Dml","http://www.w3.org/2001/XMLSchema","int",0,1,true), Dml, Dml__is_set);
    }

    /**
     * element : DmlRows of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean DmlRows__is_set = false;

    private java.lang.Integer DmlRows;

    public java.lang.Integer getDmlRows() {
      return DmlRows;
    }

    public void setDmlRows(java.lang.Integer DmlRows) {
      this.DmlRows = DmlRows;
      DmlRows__is_set = true;
    }

    protected void setDmlRows(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DmlRows", "urn:sobject.enterprise.soap.sforce.com","DmlRows","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setDmlRows((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("DmlRows", "urn:sobject.enterprise.soap.sforce.com","DmlRows","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldDmlRows(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DmlRows", "urn:sobject.enterprise.soap.sforce.com","DmlRows","http://www.w3.org/2001/XMLSchema","int",0,1,true), DmlRows, DmlRows__is_set);
    }

    /**
     * element : Email of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Email__is_set = false;

    private java.lang.Integer Email;

    public java.lang.Integer getEmail() {
      return Email;
    }

    public void setEmail(java.lang.Integer Email) {
      this.Email = Email;
      Email__is_set = true;
    }

    protected void setEmail(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Email", "urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setEmail((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Email", "urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldEmail(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Email", "urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","int",0,1,true), Email, Email__is_set);
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
     * element : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    protected void setLastModifiedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldLastModifiedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), LastModifiedBy, LastModifiedBy__is_set);
    }

    /**
     * element : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    protected void setLastModifiedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setLastModifiedById(__typeMapper.readString(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastModifiedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), LastModifiedById, LastModifiedById__is_set);
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
     * element : LimitContext of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean LimitContext__is_set = false;

    private java.lang.String LimitContext;

    public java.lang.String getLimitContext() {
      return LimitContext;
    }

    public void setLimitContext(java.lang.String LimitContext) {
      this.LimitContext = LimitContext;
      LimitContext__is_set = true;
    }

    protected void setLimitContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LimitContext", "urn:sobject.enterprise.soap.sforce.com","LimitContext","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLimitContext(__typeMapper.readString(__in, _lookupTypeInfo("LimitContext", "urn:sobject.enterprise.soap.sforce.com","LimitContext","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLimitContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LimitContext", "urn:sobject.enterprise.soap.sforce.com","LimitContext","http://www.w3.org/2001/XMLSchema","string",0,1,true), LimitContext, LimitContext__is_set);
    }

    /**
     * element : LimitExceptions of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean LimitExceptions__is_set = false;

    private java.lang.String LimitExceptions;

    public java.lang.String getLimitExceptions() {
      return LimitExceptions;
    }

    public void setLimitExceptions(java.lang.String LimitExceptions) {
      this.LimitExceptions = LimitExceptions;
      LimitExceptions__is_set = true;
    }

    protected void setLimitExceptions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LimitExceptions", "urn:sobject.enterprise.soap.sforce.com","LimitExceptions","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLimitExceptions(__typeMapper.readString(__in, _lookupTypeInfo("LimitExceptions", "urn:sobject.enterprise.soap.sforce.com","LimitExceptions","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLimitExceptions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LimitExceptions", "urn:sobject.enterprise.soap.sforce.com","LimitExceptions","http://www.w3.org/2001/XMLSchema","string",0,1,true), LimitExceptions, LimitExceptions__is_set);
    }

    /**
     * element : MobilePush of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean MobilePush__is_set = false;

    private java.lang.Integer MobilePush;

    public java.lang.Integer getMobilePush() {
      return MobilePush;
    }

    public void setMobilePush(java.lang.Integer MobilePush) {
      this.MobilePush = MobilePush;
      MobilePush__is_set = true;
    }

    protected void setMobilePush(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MobilePush", "urn:sobject.enterprise.soap.sforce.com","MobilePush","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setMobilePush((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("MobilePush", "urn:sobject.enterprise.soap.sforce.com","MobilePush","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldMobilePush(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MobilePush", "urn:sobject.enterprise.soap.sforce.com","MobilePush","http://www.w3.org/2001/XMLSchema","int",0,1,true), MobilePush, MobilePush__is_set);
    }

    /**
     * element : QueryRows of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean QueryRows__is_set = false;

    private java.lang.Integer QueryRows;

    public java.lang.Integer getQueryRows() {
      return QueryRows;
    }

    public void setQueryRows(java.lang.Integer QueryRows) {
      this.QueryRows = QueryRows;
      QueryRows__is_set = true;
    }

    protected void setQueryRows(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("QueryRows", "urn:sobject.enterprise.soap.sforce.com","QueryRows","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setQueryRows((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("QueryRows", "urn:sobject.enterprise.soap.sforce.com","QueryRows","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldQueryRows(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("QueryRows", "urn:sobject.enterprise.soap.sforce.com","QueryRows","http://www.w3.org/2001/XMLSchema","int",0,1,true), QueryRows, QueryRows__is_set);
    }

    /**
     * element : Soql of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Soql__is_set = false;

    private java.lang.Integer Soql;

    public java.lang.Integer getSoql() {
      return Soql;
    }

    public void setSoql(java.lang.Integer Soql) {
      this.Soql = Soql;
      Soql__is_set = true;
    }

    protected void setSoql(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Soql", "urn:sobject.enterprise.soap.sforce.com","Soql","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setSoql((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Soql", "urn:sobject.enterprise.soap.sforce.com","Soql","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldSoql(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Soql", "urn:sobject.enterprise.soap.sforce.com","Soql","http://www.w3.org/2001/XMLSchema","int",0,1,true), Soql, Soql__is_set);
    }

    /**
     * element : Sosl of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Sosl__is_set = false;

    private java.lang.Integer Sosl;

    public java.lang.Integer getSosl() {
      return Sosl;
    }

    public void setSosl(java.lang.Integer Sosl) {
      this.Sosl = Sosl;
      Sosl__is_set = true;
    }

    protected void setSosl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Sosl", "urn:sobject.enterprise.soap.sforce.com","Sosl","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setSosl((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Sosl", "urn:sobject.enterprise.soap.sforce.com","Sosl","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldSosl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Sosl", "urn:sobject.enterprise.soap.sforce.com","Sosl","http://www.w3.org/2001/XMLSchema","int",0,1,true), Sosl, Sosl__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTestResultLimits");
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
      sb.append("[ApexTestResultLimits ");
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
      writeFieldApexTestResult(__out, __typeMapper);
      writeFieldApexTestResultId(__out, __typeMapper);
      writeFieldAsyncCalls(__out, __typeMapper);
      writeFieldCallouts(__out, __typeMapper);
      writeFieldCpu(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldDml(__out, __typeMapper);
      writeFieldDmlRows(__out, __typeMapper);
      writeFieldEmail(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldLimitContext(__out, __typeMapper);
      writeFieldLimitExceptions(__out, __typeMapper);
      writeFieldMobilePush(__out, __typeMapper);
      writeFieldQueryRows(__out, __typeMapper);
      writeFieldSoql(__out, __typeMapper);
      writeFieldSosl(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApexTestResult(__in, __typeMapper);
      setApexTestResultId(__in, __typeMapper);
      setAsyncCalls(__in, __typeMapper);
      setCallouts(__in, __typeMapper);
      setCpu(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setDml(__in, __typeMapper);
      setDmlRows(__in, __typeMapper);
      setEmail(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setLimitContext(__in, __typeMapper);
      setLimitExceptions(__in, __typeMapper);
      setMobilePush(__in, __typeMapper);
      setQueryRows(__in, __typeMapper);
      setSoql(__in, __typeMapper);
      setSosl(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ApexTestResult", ApexTestResult);
      toStringHelper(sb, "ApexTestResultId", ApexTestResultId);
      toStringHelper(sb, "AsyncCalls", AsyncCalls);
      toStringHelper(sb, "Callouts", Callouts);
      toStringHelper(sb, "Cpu", Cpu);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "Dml", Dml);
      toStringHelper(sb, "DmlRows", DmlRows);
      toStringHelper(sb, "Email", Email);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "LimitContext", LimitContext);
      toStringHelper(sb, "LimitExceptions", LimitExceptions);
      toStringHelper(sb, "MobilePush", MobilePush);
      toStringHelper(sb, "QueryRows", QueryRows);
      toStringHelper(sb, "Soql", Soql);
      toStringHelper(sb, "Sosl", Sosl);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
