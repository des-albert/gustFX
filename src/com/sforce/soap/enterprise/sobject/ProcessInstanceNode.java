package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ProcessInstanceNode extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ProcessInstanceNode() {}

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
     * element : CompletedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CompletedDate__is_set = false;

    private java.util.Calendar CompletedDate;

    public java.util.Calendar getCompletedDate() {
      return CompletedDate;
    }

    public void setCompletedDate(java.util.Calendar CompletedDate) {
      this.CompletedDate = CompletedDate;
      CompletedDate__is_set = true;
    }

    protected void setCompletedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CompletedDate", "urn:sobject.enterprise.soap.sforce.com","CompletedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCompletedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CompletedDate", "urn:sobject.enterprise.soap.sforce.com","CompletedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCompletedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CompletedDate", "urn:sobject.enterprise.soap.sforce.com","CompletedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CompletedDate, CompletedDate__is_set);
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
     * element : ElapsedTimeInDays of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInDays__is_set = false;

    private java.lang.Double ElapsedTimeInDays;

    public java.lang.Double getElapsedTimeInDays() {
      return ElapsedTimeInDays;
    }

    public void setElapsedTimeInDays(java.lang.Double ElapsedTimeInDays) {
      this.ElapsedTimeInDays = ElapsedTimeInDays;
      ElapsedTimeInDays__is_set = true;
    }

    protected void setElapsedTimeInDays(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInDays((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInDays(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInDays, ElapsedTimeInDays__is_set);
    }

    /**
     * element : ElapsedTimeInHours of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInHours__is_set = false;

    private java.lang.Double ElapsedTimeInHours;

    public java.lang.Double getElapsedTimeInHours() {
      return ElapsedTimeInHours;
    }

    public void setElapsedTimeInHours(java.lang.Double ElapsedTimeInHours) {
      this.ElapsedTimeInHours = ElapsedTimeInHours;
      ElapsedTimeInHours__is_set = true;
    }

    protected void setElapsedTimeInHours(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInHours((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInHours(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInHours, ElapsedTimeInHours__is_set);
    }

    /**
     * element : ElapsedTimeInMinutes of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInMinutes__is_set = false;

    private java.lang.Double ElapsedTimeInMinutes;

    public java.lang.Double getElapsedTimeInMinutes() {
      return ElapsedTimeInMinutes;
    }

    public void setElapsedTimeInMinutes(java.lang.Double ElapsedTimeInMinutes) {
      this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
      ElapsedTimeInMinutes__is_set = true;
    }

    protected void setElapsedTimeInMinutes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInMinutes((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInMinutes(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInMinutes, ElapsedTimeInMinutes__is_set);
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
     * element : LastActor of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean LastActor__is_set = false;

    private com.sforce.soap.enterprise.sobject.User LastActor;

    public com.sforce.soap.enterprise.sobject.User getLastActor() {
      return LastActor;
    }

    public void setLastActor(com.sforce.soap.enterprise.sobject.User LastActor) {
      this.LastActor = LastActor;
      LastActor__is_set = true;
    }

    protected void setLastActor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastActor", "urn:sobject.enterprise.soap.sforce.com","LastActor","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setLastActor((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastActor", "urn:sobject.enterprise.soap.sforce.com","LastActor","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldLastActor(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastActor", "urn:sobject.enterprise.soap.sforce.com","LastActor","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), LastActor, LastActor__is_set);
    }

    /**
     * element : LastActorId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastActorId__is_set = false;

    private java.lang.String LastActorId;

    public java.lang.String getLastActorId() {
      return LastActorId;
    }

    public void setLastActorId(java.lang.String LastActorId) {
      this.LastActorId = LastActorId;
      LastActorId__is_set = true;
    }

    protected void setLastActorId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastActorId", "urn:sobject.enterprise.soap.sforce.com","LastActorId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setLastActorId(__typeMapper.readString(__in, _lookupTypeInfo("LastActorId", "urn:sobject.enterprise.soap.sforce.com","LastActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastActorId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastActorId", "urn:sobject.enterprise.soap.sforce.com","LastActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), LastActorId, LastActorId__is_set);
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
     * element : NodeStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean NodeStatus__is_set = false;

    private java.lang.String NodeStatus;

    public java.lang.String getNodeStatus() {
      return NodeStatus;
    }

    public void setNodeStatus(java.lang.String NodeStatus) {
      this.NodeStatus = NodeStatus;
      NodeStatus__is_set = true;
    }

    protected void setNodeStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("NodeStatus", "urn:sobject.enterprise.soap.sforce.com","NodeStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setNodeStatus(__typeMapper.readString(__in, _lookupTypeInfo("NodeStatus", "urn:sobject.enterprise.soap.sforce.com","NodeStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNodeStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("NodeStatus", "urn:sobject.enterprise.soap.sforce.com","NodeStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), NodeStatus, NodeStatus__is_set);
    }

    /**
     * element : ProcessInstance of type {urn:sobject.enterprise.soap.sforce.com}ProcessInstance
     * java type: com.sforce.soap.enterprise.sobject.ProcessInstance
     */
    private boolean ProcessInstance__is_set = false;

    private com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance;

    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
      return ProcessInstance;
    }

    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance) {
      this.ProcessInstance = ProcessInstance;
      ProcessInstance__is_set = true;
    }

    protected void setProcessInstance(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true))) {
        setProcessInstance((com.sforce.soap.enterprise.sobject.ProcessInstance)__typeMapper.readObject(__in, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true), com.sforce.soap.enterprise.sobject.ProcessInstance.class));
      }
    }

    private void writeFieldProcessInstance(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true), ProcessInstance, ProcessInstance__is_set);
    }

    /**
     * element : ProcessInstanceId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ProcessInstanceId__is_set = false;

    private java.lang.String ProcessInstanceId;

    public java.lang.String getProcessInstanceId() {
      return ProcessInstanceId;
    }

    public void setProcessInstanceId(java.lang.String ProcessInstanceId) {
      this.ProcessInstanceId = ProcessInstanceId;
      ProcessInstanceId__is_set = true;
    }

    protected void setProcessInstanceId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setProcessInstanceId(__typeMapper.readString(__in, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProcessInstanceId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true), ProcessInstanceId, ProcessInstanceId__is_set);
    }

    /**
     * element : ProcessNode of type {urn:sobject.enterprise.soap.sforce.com}ProcessNode
     * java type: com.sforce.soap.enterprise.sobject.ProcessNode
     */
    private boolean ProcessNode__is_set = false;

    private com.sforce.soap.enterprise.sobject.ProcessNode ProcessNode;

    public com.sforce.soap.enterprise.sobject.ProcessNode getProcessNode() {
      return ProcessNode;
    }

    public void setProcessNode(com.sforce.soap.enterprise.sobject.ProcessNode ProcessNode) {
      this.ProcessNode = ProcessNode;
      ProcessNode__is_set = true;
    }

    protected void setProcessNode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessNode", "urn:sobject.enterprise.soap.sforce.com","ProcessNode","urn:sobject.enterprise.soap.sforce.com","ProcessNode",0,1,true))) {
        setProcessNode((com.sforce.soap.enterprise.sobject.ProcessNode)__typeMapper.readObject(__in, _lookupTypeInfo("ProcessNode", "urn:sobject.enterprise.soap.sforce.com","ProcessNode","urn:sobject.enterprise.soap.sforce.com","ProcessNode",0,1,true), com.sforce.soap.enterprise.sobject.ProcessNode.class));
      }
    }

    private void writeFieldProcessNode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessNode", "urn:sobject.enterprise.soap.sforce.com","ProcessNode","urn:sobject.enterprise.soap.sforce.com","ProcessNode",0,1,true), ProcessNode, ProcessNode__is_set);
    }

    /**
     * element : ProcessNodeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ProcessNodeId__is_set = false;

    private java.lang.String ProcessNodeId;

    public java.lang.String getProcessNodeId() {
      return ProcessNodeId;
    }

    public void setProcessNodeId(java.lang.String ProcessNodeId) {
      this.ProcessNodeId = ProcessNodeId;
      ProcessNodeId__is_set = true;
    }

    protected void setProcessNodeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessNodeId", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setProcessNodeId(__typeMapper.readString(__in, _lookupTypeInfo("ProcessNodeId", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProcessNodeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessNodeId", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true), ProcessNodeId, ProcessNodeId__is_set);
    }

    /**
     * element : ProcessNodeName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ProcessNodeName__is_set = false;

    private java.lang.String ProcessNodeName;

    public java.lang.String getProcessNodeName() {
      return ProcessNodeName;
    }

    public void setProcessNodeName(java.lang.String ProcessNodeName) {
      this.ProcessNodeName = ProcessNodeName;
      ProcessNodeName__is_set = true;
    }

    protected void setProcessNodeName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessNodeName", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setProcessNodeName(__typeMapper.readString(__in, _lookupTypeInfo("ProcessNodeName", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProcessNodeName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessNodeName", "urn:sobject.enterprise.soap.sforce.com","ProcessNodeName","http://www.w3.org/2001/XMLSchema","string",0,1,true), ProcessNodeName, ProcessNodeName__is_set);
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
     * element : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
     * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
     */
    private boolean UserRecordAccess__is_set = false;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
      return UserRecordAccess;
    }

    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
      this.UserRecordAccess = UserRecordAccess;
      UserRecordAccess__is_set = true;
    }

    protected void setUserRecordAccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true))) {
        setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true), com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
      }
    }

    private void writeFieldUserRecordAccess(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true), UserRecordAccess, UserRecordAccess__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceNode");
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
      sb.append("[ProcessInstanceNode ");
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
      writeFieldCompletedDate(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldElapsedTimeInDays(__out, __typeMapper);
      writeFieldElapsedTimeInHours(__out, __typeMapper);
      writeFieldElapsedTimeInMinutes(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastActor(__out, __typeMapper);
      writeFieldLastActorId(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldNodeStatus(__out, __typeMapper);
      writeFieldProcessInstance(__out, __typeMapper);
      writeFieldProcessInstanceId(__out, __typeMapper);
      writeFieldProcessNode(__out, __typeMapper);
      writeFieldProcessNodeId(__out, __typeMapper);
      writeFieldProcessNodeName(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldUserRecordAccess(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCompletedDate(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setElapsedTimeInDays(__in, __typeMapper);
      setElapsedTimeInHours(__in, __typeMapper);
      setElapsedTimeInMinutes(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastActor(__in, __typeMapper);
      setLastActorId(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setNodeStatus(__in, __typeMapper);
      setProcessInstance(__in, __typeMapper);
      setProcessInstanceId(__in, __typeMapper);
      setProcessNode(__in, __typeMapper);
      setProcessNodeId(__in, __typeMapper);
      setProcessNodeName(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setUserRecordAccess(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CompletedDate", CompletedDate);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "ElapsedTimeInDays", ElapsedTimeInDays);
      toStringHelper(sb, "ElapsedTimeInHours", ElapsedTimeInHours);
      toStringHelper(sb, "ElapsedTimeInMinutes", ElapsedTimeInMinutes);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastActor", LastActor);
      toStringHelper(sb, "LastActorId", LastActorId);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "NodeStatus", NodeStatus);
      toStringHelper(sb, "ProcessInstance", ProcessInstance);
      toStringHelper(sb, "ProcessInstanceId", ProcessInstanceId);
      toStringHelper(sb, "ProcessNode", ProcessNode);
      toStringHelper(sb, "ProcessNodeId", ProcessNodeId);
      toStringHelper(sb, "ProcessNodeName", ProcessNodeName);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "UserRecordAccess", UserRecordAccess);
    }


}