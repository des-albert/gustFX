package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class OpportunityHistory extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public OpportunityHistory() {}

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
     * element : Amount of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean Amount__is_set = false;

    private java.lang.Double Amount;

    public java.lang.Double getAmount() {
      return Amount;
    }

    public void setAmount(java.lang.Double Amount) {
      this.Amount = Amount;
      Amount__is_set = true;
    }

    protected void setAmount(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Amount", "urn:sobject.enterprise.soap.sforce.com","Amount","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setAmount((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("Amount", "urn:sobject.enterprise.soap.sforce.com","Amount","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldAmount(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Amount", "urn:sobject.enterprise.soap.sforce.com","Amount","http://www.w3.org/2001/XMLSchema","double",0,1,true), Amount, Amount__is_set);
    }

    /**
     * element : CloseDate of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private boolean CloseDate__is_set = false;

    private java.util.Calendar CloseDate;

    public java.util.Calendar getCloseDate() {
      return CloseDate;
    }

    public void setCloseDate(java.util.Calendar CloseDate) {
      this.CloseDate = CloseDate;
      CloseDate__is_set = true;
    }

    protected void setCloseDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CloseDate", "urn:sobject.enterprise.soap.sforce.com","CloseDate","http://www.w3.org/2001/XMLSchema","date",0,1,true))) {
        setCloseDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CloseDate", "urn:sobject.enterprise.soap.sforce.com","CloseDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCloseDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CloseDate", "urn:sobject.enterprise.soap.sforce.com","CloseDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), CloseDate, CloseDate__is_set);
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
     * element : ExpectedRevenue of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ExpectedRevenue__is_set = false;

    private java.lang.Double ExpectedRevenue;

    public java.lang.Double getExpectedRevenue() {
      return ExpectedRevenue;
    }

    public void setExpectedRevenue(java.lang.Double ExpectedRevenue) {
      this.ExpectedRevenue = ExpectedRevenue;
      ExpectedRevenue__is_set = true;
    }

    protected void setExpectedRevenue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ExpectedRevenue", "urn:sobject.enterprise.soap.sforce.com","ExpectedRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setExpectedRevenue((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ExpectedRevenue", "urn:sobject.enterprise.soap.sforce.com","ExpectedRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldExpectedRevenue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ExpectedRevenue", "urn:sobject.enterprise.soap.sforce.com","ExpectedRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true), ExpectedRevenue, ExpectedRevenue__is_set);
    }

    /**
     * element : ForecastCategory of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ForecastCategory__is_set = false;

    private java.lang.String ForecastCategory;

    public java.lang.String getForecastCategory() {
      return ForecastCategory;
    }

    public void setForecastCategory(java.lang.String ForecastCategory) {
      this.ForecastCategory = ForecastCategory;
      ForecastCategory__is_set = true;
    }

    protected void setForecastCategory(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ForecastCategory", "urn:sobject.enterprise.soap.sforce.com","ForecastCategory","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setForecastCategory(__typeMapper.readString(__in, _lookupTypeInfo("ForecastCategory", "urn:sobject.enterprise.soap.sforce.com","ForecastCategory","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldForecastCategory(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ForecastCategory", "urn:sobject.enterprise.soap.sforce.com","ForecastCategory","http://www.w3.org/2001/XMLSchema","string",0,1,true), ForecastCategory, ForecastCategory__is_set);
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
     * element : Opportunity of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
     * java type: com.sforce.soap.enterprise.sobject.Opportunity
     */
    private boolean Opportunity__is_set = false;

    private com.sforce.soap.enterprise.sobject.Opportunity Opportunity;

    public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity() {
      return Opportunity;
    }

    public void setOpportunity(com.sforce.soap.enterprise.sobject.Opportunity Opportunity) {
      this.Opportunity = Opportunity;
      Opportunity__is_set = true;
    }

    protected void setOpportunity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Opportunity", "urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true))) {
        setOpportunity((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, _lookupTypeInfo("Opportunity", "urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true), com.sforce.soap.enterprise.sobject.Opportunity.class));
      }
    }

    private void writeFieldOpportunity(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Opportunity", "urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true), Opportunity, Opportunity__is_set);
    }

    /**
     * element : OpportunityId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean OpportunityId__is_set = false;

    private java.lang.String OpportunityId;

    public java.lang.String getOpportunityId() {
      return OpportunityId;
    }

    public void setOpportunityId(java.lang.String OpportunityId) {
      this.OpportunityId = OpportunityId;
      OpportunityId__is_set = true;
    }

    protected void setOpportunityId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OpportunityId", "urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setOpportunityId(__typeMapper.readString(__in, _lookupTypeInfo("OpportunityId", "urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OpportunityId", "urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true), OpportunityId, OpportunityId__is_set);
    }

    /**
     * element : Probability of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean Probability__is_set = false;

    private java.lang.Double Probability;

    public java.lang.Double getProbability() {
      return Probability;
    }

    public void setProbability(java.lang.Double Probability) {
      this.Probability = Probability;
      Probability__is_set = true;
    }

    protected void setProbability(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Probability", "urn:sobject.enterprise.soap.sforce.com","Probability","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setProbability((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("Probability", "urn:sobject.enterprise.soap.sforce.com","Probability","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldProbability(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Probability", "urn:sobject.enterprise.soap.sforce.com","Probability","http://www.w3.org/2001/XMLSchema","double",0,1,true), Probability, Probability__is_set);
    }

    /**
     * element : StageName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean StageName__is_set = false;

    private java.lang.String StageName;

    public java.lang.String getStageName() {
      return StageName;
    }

    public void setStageName(java.lang.String StageName) {
      this.StageName = StageName;
      StageName__is_set = true;
    }

    protected void setStageName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StageName", "urn:sobject.enterprise.soap.sforce.com","StageName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStageName(__typeMapper.readString(__in, _lookupTypeInfo("StageName", "urn:sobject.enterprise.soap.sforce.com","StageName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStageName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StageName", "urn:sobject.enterprise.soap.sforce.com","StageName","http://www.w3.org/2001/XMLSchema","string",0,1,true), StageName, StageName__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OpportunityHistory");
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
      sb.append("[OpportunityHistory ");
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
      writeFieldAmount(__out, __typeMapper);
      writeFieldCloseDate(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldExpectedRevenue(__out, __typeMapper);
      writeFieldForecastCategory(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldOpportunity(__out, __typeMapper);
      writeFieldOpportunityId(__out, __typeMapper);
      writeFieldProbability(__out, __typeMapper);
      writeFieldStageName(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAmount(__in, __typeMapper);
      setCloseDate(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setExpectedRevenue(__in, __typeMapper);
      setForecastCategory(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setOpportunity(__in, __typeMapper);
      setOpportunityId(__in, __typeMapper);
      setProbability(__in, __typeMapper);
      setStageName(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Amount", Amount);
      toStringHelper(sb, "CloseDate", CloseDate);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "ExpectedRevenue", ExpectedRevenue);
      toStringHelper(sb, "ForecastCategory", ForecastCategory);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "Opportunity", Opportunity);
      toStringHelper(sb, "OpportunityId", OpportunityId);
      toStringHelper(sb, "Probability", Probability);
      toStringHelper(sb, "StageName", StageName);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
