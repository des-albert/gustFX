package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FeedComment extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FeedComment() {}

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
     * element : CommentBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CommentBody__is_set = false;

    private java.lang.String CommentBody;

    public java.lang.String getCommentBody() {
      return CommentBody;
    }

    public void setCommentBody(java.lang.String CommentBody) {
      this.CommentBody = CommentBody;
      CommentBody__is_set = true;
    }

    protected void setCommentBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CommentBody", "urn:sobject.enterprise.soap.sforce.com","CommentBody","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCommentBody(__typeMapper.readString(__in, _lookupTypeInfo("CommentBody", "urn:sobject.enterprise.soap.sforce.com","CommentBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCommentBody(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CommentBody", "urn:sobject.enterprise.soap.sforce.com","CommentBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), CommentBody, CommentBody__is_set);
    }

    /**
     * element : CommentType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CommentType__is_set = false;

    private java.lang.String CommentType;

    public java.lang.String getCommentType() {
      return CommentType;
    }

    public void setCommentType(java.lang.String CommentType) {
      this.CommentType = CommentType;
      CommentType__is_set = true;
    }

    protected void setCommentType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CommentType", "urn:sobject.enterprise.soap.sforce.com","CommentType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCommentType(__typeMapper.readString(__in, _lookupTypeInfo("CommentType", "urn:sobject.enterprise.soap.sforce.com","CommentType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCommentType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CommentType", "urn:sobject.enterprise.soap.sforce.com","CommentType","http://www.w3.org/2001/XMLSchema","string",0,1,true), CommentType, CommentType__is_set);
    }

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject CreatedBy;

    public com.sforce.soap.enterprise.sobject.SObject getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.SObject CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setCreatedBy((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), CreatedBy, CreatedBy__is_set);
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
     * element : FeedAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean FeedAttachments__is_set = false;

    private com.sforce.soap.enterprise.QueryResult FeedAttachments;

    public com.sforce.soap.enterprise.QueryResult getFeedAttachments() {
      return FeedAttachments;
    }

    public void setFeedAttachments(com.sforce.soap.enterprise.QueryResult FeedAttachments) {
      this.FeedAttachments = FeedAttachments;
      FeedAttachments__is_set = true;
    }

    protected void setFeedAttachments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FeedAttachments", "urn:sobject.enterprise.soap.sforce.com","FeedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setFeedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("FeedAttachments", "urn:sobject.enterprise.soap.sforce.com","FeedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldFeedAttachments(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FeedAttachments", "urn:sobject.enterprise.soap.sforce.com","FeedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), FeedAttachments, FeedAttachments__is_set);
    }

    /**
     * element : FeedItemId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean FeedItemId__is_set = false;

    private java.lang.String FeedItemId;

    public java.lang.String getFeedItemId() {
      return FeedItemId;
    }

    public void setFeedItemId(java.lang.String FeedItemId) {
      this.FeedItemId = FeedItemId;
      FeedItemId__is_set = true;
    }

    protected void setFeedItemId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FeedItemId", "urn:sobject.enterprise.soap.sforce.com","FeedItemId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setFeedItemId(__typeMapper.readString(__in, _lookupTypeInfo("FeedItemId", "urn:sobject.enterprise.soap.sforce.com","FeedItemId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFeedItemId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FeedItemId", "urn:sobject.enterprise.soap.sforce.com","FeedItemId","urn:enterprise.soap.sforce.com","ID",0,1,true), FeedItemId, FeedItemId__is_set);
    }

    /**
     * element : FeedRevisions of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean FeedRevisions__is_set = false;

    private com.sforce.soap.enterprise.QueryResult FeedRevisions;

    public com.sforce.soap.enterprise.QueryResult getFeedRevisions() {
      return FeedRevisions;
    }

    public void setFeedRevisions(com.sforce.soap.enterprise.QueryResult FeedRevisions) {
      this.FeedRevisions = FeedRevisions;
      FeedRevisions__is_set = true;
    }

    protected void setFeedRevisions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FeedRevisions", "urn:sobject.enterprise.soap.sforce.com","FeedRevisions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setFeedRevisions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("FeedRevisions", "urn:sobject.enterprise.soap.sforce.com","FeedRevisions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldFeedRevisions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FeedRevisions", "urn:sobject.enterprise.soap.sforce.com","FeedRevisions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), FeedRevisions, FeedRevisions__is_set);
    }

    /**
     * element : InsertedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean InsertedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User InsertedBy;

    public com.sforce.soap.enterprise.sobject.User getInsertedBy() {
      return InsertedBy;
    }

    public void setInsertedBy(com.sforce.soap.enterprise.sobject.User InsertedBy) {
      this.InsertedBy = InsertedBy;
      InsertedBy__is_set = true;
    }

    protected void setInsertedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("InsertedBy", "urn:sobject.enterprise.soap.sforce.com","InsertedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setInsertedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("InsertedBy", "urn:sobject.enterprise.soap.sforce.com","InsertedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldInsertedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("InsertedBy", "urn:sobject.enterprise.soap.sforce.com","InsertedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), InsertedBy, InsertedBy__is_set);
    }

    /**
     * element : InsertedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean InsertedById__is_set = false;

    private java.lang.String InsertedById;

    public java.lang.String getInsertedById() {
      return InsertedById;
    }

    public void setInsertedById(java.lang.String InsertedById) {
      this.InsertedById = InsertedById;
      InsertedById__is_set = true;
    }

    protected void setInsertedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("InsertedById", "urn:sobject.enterprise.soap.sforce.com","InsertedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setInsertedById(__typeMapper.readString(__in, _lookupTypeInfo("InsertedById", "urn:sobject.enterprise.soap.sforce.com","InsertedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldInsertedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("InsertedById", "urn:sobject.enterprise.soap.sforce.com","InsertedById","urn:enterprise.soap.sforce.com","ID",0,1,true), InsertedById, InsertedById__is_set);
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
     * element : IsRichText of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsRichText__is_set = false;

    private java.lang.Boolean IsRichText;

    public java.lang.Boolean getIsRichText() {
      return IsRichText;
    }

    public void setIsRichText(java.lang.Boolean IsRichText) {
      this.IsRichText = IsRichText;
      IsRichText__is_set = true;
    }

    protected void setIsRichText(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsRichText", "urn:sobject.enterprise.soap.sforce.com","IsRichText","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsRichText((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsRichText", "urn:sobject.enterprise.soap.sforce.com","IsRichText","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsRichText(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsRichText", "urn:sobject.enterprise.soap.sforce.com","IsRichText","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsRichText, IsRichText__is_set);
    }

    /**
     * element : IsVerified of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsVerified__is_set = false;

    private java.lang.Boolean IsVerified;

    public java.lang.Boolean getIsVerified() {
      return IsVerified;
    }

    public void setIsVerified(java.lang.Boolean IsVerified) {
      this.IsVerified = IsVerified;
      IsVerified__is_set = true;
    }

    protected void setIsVerified(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsVerified", "urn:sobject.enterprise.soap.sforce.com","IsVerified","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsVerified((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsVerified", "urn:sobject.enterprise.soap.sforce.com","IsVerified","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsVerified(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsVerified", "urn:sobject.enterprise.soap.sforce.com","IsVerified","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsVerified, IsVerified__is_set);
    }

    /**
     * element : LastEditById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastEditById__is_set = false;

    private java.lang.String LastEditById;

    public java.lang.String getLastEditById() {
      return LastEditById;
    }

    public void setLastEditById(java.lang.String LastEditById) {
      this.LastEditById = LastEditById;
      LastEditById__is_set = true;
    }

    protected void setLastEditById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastEditById", "urn:sobject.enterprise.soap.sforce.com","LastEditById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setLastEditById(__typeMapper.readString(__in, _lookupTypeInfo("LastEditById", "urn:sobject.enterprise.soap.sforce.com","LastEditById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastEditById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastEditById", "urn:sobject.enterprise.soap.sforce.com","LastEditById","urn:enterprise.soap.sforce.com","ID",0,1,true), LastEditById, LastEditById__is_set);
    }

    /**
     * element : LastEditDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastEditDate__is_set = false;

    private java.util.Calendar LastEditDate;

    public java.util.Calendar getLastEditDate() {
      return LastEditDate;
    }

    public void setLastEditDate(java.util.Calendar LastEditDate) {
      this.LastEditDate = LastEditDate;
      LastEditDate__is_set = true;
    }

    protected void setLastEditDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastEditDate", "urn:sobject.enterprise.soap.sforce.com","LastEditDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastEditDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastEditDate", "urn:sobject.enterprise.soap.sforce.com","LastEditDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastEditDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastEditDate", "urn:sobject.enterprise.soap.sforce.com","LastEditDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastEditDate, LastEditDate__is_set);
    }

    /**
     * element : ParentId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ParentId__is_set = false;

    private java.lang.String ParentId;

    public java.lang.String getParentId() {
      return ParentId;
    }

    public void setParentId(java.lang.String ParentId) {
      this.ParentId = ParentId;
      ParentId__is_set = true;
    }

    protected void setParentId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setParentId(__typeMapper.readString(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), ParentId, ParentId__is_set);
    }

    /**
     * element : RelatedRecordId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean RelatedRecordId__is_set = false;

    private java.lang.String RelatedRecordId;

    public java.lang.String getRelatedRecordId() {
      return RelatedRecordId;
    }

    public void setRelatedRecordId(java.lang.String RelatedRecordId) {
      this.RelatedRecordId = RelatedRecordId;
      RelatedRecordId__is_set = true;
    }

    protected void setRelatedRecordId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RelatedRecordId", "urn:sobject.enterprise.soap.sforce.com","RelatedRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setRelatedRecordId(__typeMapper.readString(__in, _lookupTypeInfo("RelatedRecordId", "urn:sobject.enterprise.soap.sforce.com","RelatedRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRelatedRecordId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RelatedRecordId", "urn:sobject.enterprise.soap.sforce.com","RelatedRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true), RelatedRecordId, RelatedRecordId__is_set);
    }

    /**
     * element : Revision of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Revision__is_set = false;

    private java.lang.Integer Revision;

    public java.lang.Integer getRevision() {
      return Revision;
    }

    public void setRevision(java.lang.Integer Revision) {
      this.Revision = Revision;
      Revision__is_set = true;
    }

    protected void setRevision(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Revision", "urn:sobject.enterprise.soap.sforce.com","Revision","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setRevision((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Revision", "urn:sobject.enterprise.soap.sforce.com","Revision","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldRevision(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Revision", "urn:sobject.enterprise.soap.sforce.com","Revision","http://www.w3.org/2001/XMLSchema","int",0,1,true), Revision, Revision__is_set);
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedComment");
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
      sb.append("[FeedComment ");
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
      writeFieldCommentBody(__out, __typeMapper);
      writeFieldCommentType(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldFeedAttachments(__out, __typeMapper);
      writeFieldFeedItemId(__out, __typeMapper);
      writeFieldFeedRevisions(__out, __typeMapper);
      writeFieldInsertedBy(__out, __typeMapper);
      writeFieldInsertedById(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldIsRichText(__out, __typeMapper);
      writeFieldIsVerified(__out, __typeMapper);
      writeFieldLastEditById(__out, __typeMapper);
      writeFieldLastEditDate(__out, __typeMapper);
      writeFieldParentId(__out, __typeMapper);
      writeFieldRelatedRecordId(__out, __typeMapper);
      writeFieldRevision(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCommentBody(__in, __typeMapper);
      setCommentType(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setFeedAttachments(__in, __typeMapper);
      setFeedItemId(__in, __typeMapper);
      setFeedRevisions(__in, __typeMapper);
      setInsertedBy(__in, __typeMapper);
      setInsertedById(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setIsRichText(__in, __typeMapper);
      setIsVerified(__in, __typeMapper);
      setLastEditById(__in, __typeMapper);
      setLastEditDate(__in, __typeMapper);
      setParentId(__in, __typeMapper);
      setRelatedRecordId(__in, __typeMapper);
      setRevision(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CommentBody", CommentBody);
      toStringHelper(sb, "CommentType", CommentType);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "FeedAttachments", FeedAttachments);
      toStringHelper(sb, "FeedItemId", FeedItemId);
      toStringHelper(sb, "FeedRevisions", FeedRevisions);
      toStringHelper(sb, "InsertedBy", InsertedBy);
      toStringHelper(sb, "InsertedById", InsertedById);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "IsRichText", IsRichText);
      toStringHelper(sb, "IsVerified", IsVerified);
      toStringHelper(sb, "LastEditById", LastEditById);
      toStringHelper(sb, "LastEditDate", LastEditDate);
      toStringHelper(sb, "ParentId", ParentId);
      toStringHelper(sb, "RelatedRecordId", RelatedRecordId);
      toStringHelper(sb, "Revision", Revision);
      toStringHelper(sb, "Status", Status);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}