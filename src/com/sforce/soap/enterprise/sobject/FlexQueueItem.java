package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlexQueueItem extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FlexQueueItem() {}

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
     * element : AsyncApexJob of type {urn:sobject.enterprise.soap.sforce.com}AsyncApexJob
     * java type: com.sforce.soap.enterprise.sobject.AsyncApexJob
     */
    private boolean AsyncApexJob__is_set = false;

    private com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob;

    public com.sforce.soap.enterprise.sobject.AsyncApexJob getAsyncApexJob() {
      return AsyncApexJob;
    }

    public void setAsyncApexJob(com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob) {
      this.AsyncApexJob = AsyncApexJob;
      AsyncApexJob__is_set = true;
    }

    protected void setAsyncApexJob(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true))) {
        setAsyncApexJob((com.sforce.soap.enterprise.sobject.AsyncApexJob)__typeMapper.readObject(__in, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true), com.sforce.soap.enterprise.sobject.AsyncApexJob.class));
      }
    }

    private void writeFieldAsyncApexJob(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true), AsyncApexJob, AsyncApexJob__is_set);
    }

    /**
     * element : AsyncApexJobId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean AsyncApexJobId__is_set = false;

    private java.lang.String AsyncApexJobId;

    public java.lang.String getAsyncApexJobId() {
      return AsyncApexJobId;
    }

    public void setAsyncApexJobId(java.lang.String AsyncApexJobId) {
      this.AsyncApexJobId = AsyncApexJobId;
      AsyncApexJobId__is_set = true;
    }

    protected void setAsyncApexJobId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAsyncApexJobId(__typeMapper.readString(__in, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAsyncApexJobId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true), AsyncApexJobId, AsyncApexJobId__is_set);
    }

    /**
     * element : FlexQueueItemId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FlexQueueItemId__is_set = false;

    private java.lang.String FlexQueueItemId;

    public java.lang.String getFlexQueueItemId() {
      return FlexQueueItemId;
    }

    public void setFlexQueueItemId(java.lang.String FlexQueueItemId) {
      this.FlexQueueItemId = FlexQueueItemId;
      FlexQueueItemId__is_set = true;
    }

    protected void setFlexQueueItemId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FlexQueueItemId", "urn:sobject.enterprise.soap.sforce.com","FlexQueueItemId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFlexQueueItemId(__typeMapper.readString(__in, _lookupTypeInfo("FlexQueueItemId", "urn:sobject.enterprise.soap.sforce.com","FlexQueueItemId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlexQueueItemId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FlexQueueItemId", "urn:sobject.enterprise.soap.sforce.com","FlexQueueItemId","http://www.w3.org/2001/XMLSchema","string",0,1,true), FlexQueueItemId, FlexQueueItemId__is_set);
    }

    /**
     * element : JobPosition of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean JobPosition__is_set = false;

    private java.lang.Integer JobPosition;

    public java.lang.Integer getJobPosition() {
      return JobPosition;
    }

    public void setJobPosition(java.lang.Integer JobPosition) {
      this.JobPosition = JobPosition;
      JobPosition__is_set = true;
    }

    protected void setJobPosition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("JobPosition", "urn:sobject.enterprise.soap.sforce.com","JobPosition","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setJobPosition((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("JobPosition", "urn:sobject.enterprise.soap.sforce.com","JobPosition","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldJobPosition(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("JobPosition", "urn:sobject.enterprise.soap.sforce.com","JobPosition","http://www.w3.org/2001/XMLSchema","int",0,1,true), JobPosition, JobPosition__is_set);
    }

    /**
     * element : JobType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean JobType__is_set = false;

    private java.lang.String JobType;

    public java.lang.String getJobType() {
      return JobType;
    }

    public void setJobType(java.lang.String JobType) {
      this.JobType = JobType;
      JobType__is_set = true;
    }

    protected void setJobType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("JobType", "urn:sobject.enterprise.soap.sforce.com","JobType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setJobType(__typeMapper.readString(__in, _lookupTypeInfo("JobType", "urn:sobject.enterprise.soap.sforce.com","JobType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldJobType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("JobType", "urn:sobject.enterprise.soap.sforce.com","JobType","http://www.w3.org/2001/XMLSchema","string",0,1,true), JobType, JobType__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FlexQueueItem");
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
      sb.append("[FlexQueueItem ");
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
      writeFieldAsyncApexJob(__out, __typeMapper);
      writeFieldAsyncApexJobId(__out, __typeMapper);
      writeFieldFlexQueueItemId(__out, __typeMapper);
      writeFieldJobPosition(__out, __typeMapper);
      writeFieldJobType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAsyncApexJob(__in, __typeMapper);
      setAsyncApexJobId(__in, __typeMapper);
      setFlexQueueItemId(__in, __typeMapper);
      setJobPosition(__in, __typeMapper);
      setJobType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AsyncApexJob", AsyncApexJob);
      toStringHelper(sb, "AsyncApexJobId", AsyncApexJobId);
      toStringHelper(sb, "FlexQueueItemId", FlexQueueItemId);
      toStringHelper(sb, "JobPosition", JobPosition);
      toStringHelper(sb, "JobType", JobType);
    }


}