package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Period extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public Period() {}

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
     * element : EndDate of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private boolean EndDate__is_set = false;

    private java.util.Calendar EndDate;

    public java.util.Calendar getEndDate() {
      return EndDate;
    }

    public void setEndDate(java.util.Calendar EndDate) {
      this.EndDate = EndDate;
      EndDate__is_set = true;
    }

    protected void setEndDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EndDate", "urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true))) {
        setEndDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("EndDate", "urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldEndDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EndDate", "urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), EndDate, EndDate__is_set);
    }

    /**
     * element : FiscalYearSettings of type {urn:sobject.enterprise.soap.sforce.com}FiscalYearSettings
     * java type: com.sforce.soap.enterprise.sobject.FiscalYearSettings
     */
    private boolean FiscalYearSettings__is_set = false;

    private com.sforce.soap.enterprise.sobject.FiscalYearSettings FiscalYearSettings;

    public com.sforce.soap.enterprise.sobject.FiscalYearSettings getFiscalYearSettings() {
      return FiscalYearSettings;
    }

    public void setFiscalYearSettings(com.sforce.soap.enterprise.sobject.FiscalYearSettings FiscalYearSettings) {
      this.FiscalYearSettings = FiscalYearSettings;
      FiscalYearSettings__is_set = true;
    }

    protected void setFiscalYearSettings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FiscalYearSettings", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings","urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings",0,1,true))) {
        setFiscalYearSettings((com.sforce.soap.enterprise.sobject.FiscalYearSettings)__typeMapper.readObject(__in, _lookupTypeInfo("FiscalYearSettings", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings","urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings",0,1,true), com.sforce.soap.enterprise.sobject.FiscalYearSettings.class));
      }
    }

    private void writeFieldFiscalYearSettings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FiscalYearSettings", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings","urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings",0,1,true), FiscalYearSettings, FiscalYearSettings__is_set);
    }

    /**
     * element : FiscalYearSettingsId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean FiscalYearSettingsId__is_set = false;

    private java.lang.String FiscalYearSettingsId;

    public java.lang.String getFiscalYearSettingsId() {
      return FiscalYearSettingsId;
    }

    public void setFiscalYearSettingsId(java.lang.String FiscalYearSettingsId) {
      this.FiscalYearSettingsId = FiscalYearSettingsId;
      FiscalYearSettingsId__is_set = true;
    }

    protected void setFiscalYearSettingsId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FiscalYearSettingsId", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettingsId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setFiscalYearSettingsId(__typeMapper.readString(__in, _lookupTypeInfo("FiscalYearSettingsId", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettingsId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFiscalYearSettingsId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FiscalYearSettingsId", "urn:sobject.enterprise.soap.sforce.com","FiscalYearSettingsId","urn:enterprise.soap.sforce.com","ID",0,1,true), FiscalYearSettingsId, FiscalYearSettingsId__is_set);
    }

    /**
     * element : FullyQualifiedLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FullyQualifiedLabel__is_set = false;

    private java.lang.String FullyQualifiedLabel;

    public java.lang.String getFullyQualifiedLabel() {
      return FullyQualifiedLabel;
    }

    public void setFullyQualifiedLabel(java.lang.String FullyQualifiedLabel) {
      this.FullyQualifiedLabel = FullyQualifiedLabel;
      FullyQualifiedLabel__is_set = true;
    }

    protected void setFullyQualifiedLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FullyQualifiedLabel", "urn:sobject.enterprise.soap.sforce.com","FullyQualifiedLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFullyQualifiedLabel(__typeMapper.readString(__in, _lookupTypeInfo("FullyQualifiedLabel", "urn:sobject.enterprise.soap.sforce.com","FullyQualifiedLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFullyQualifiedLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FullyQualifiedLabel", "urn:sobject.enterprise.soap.sforce.com","FullyQualifiedLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), FullyQualifiedLabel, FullyQualifiedLabel__is_set);
    }

    /**
     * element : IsForecastPeriod of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsForecastPeriod__is_set = false;

    private java.lang.Boolean IsForecastPeriod;

    public java.lang.Boolean getIsForecastPeriod() {
      return IsForecastPeriod;
    }

    public void setIsForecastPeriod(java.lang.Boolean IsForecastPeriod) {
      this.IsForecastPeriod = IsForecastPeriod;
      IsForecastPeriod__is_set = true;
    }

    protected void setIsForecastPeriod(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsForecastPeriod", "urn:sobject.enterprise.soap.sforce.com","IsForecastPeriod","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsForecastPeriod((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsForecastPeriod", "urn:sobject.enterprise.soap.sforce.com","IsForecastPeriod","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsForecastPeriod(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsForecastPeriod", "urn:sobject.enterprise.soap.sforce.com","IsForecastPeriod","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsForecastPeriod, IsForecastPeriod__is_set);
    }

    /**
     * element : Number of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Number__is_set = false;

    private java.lang.Integer Number;

    public java.lang.Integer getNumber() {
      return Number;
    }

    public void setNumber(java.lang.Integer Number) {
      this.Number = Number;
      Number__is_set = true;
    }

    protected void setNumber(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Number", "urn:sobject.enterprise.soap.sforce.com","Number","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setNumber((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Number", "urn:sobject.enterprise.soap.sforce.com","Number","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldNumber(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Number", "urn:sobject.enterprise.soap.sforce.com","Number","http://www.w3.org/2001/XMLSchema","int",0,1,true), Number, Number__is_set);
    }

    /**
     * element : PeriodLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean PeriodLabel__is_set = false;

    private java.lang.String PeriodLabel;

    public java.lang.String getPeriodLabel() {
      return PeriodLabel;
    }

    public void setPeriodLabel(java.lang.String PeriodLabel) {
      this.PeriodLabel = PeriodLabel;
      PeriodLabel__is_set = true;
    }

    protected void setPeriodLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PeriodLabel", "urn:sobject.enterprise.soap.sforce.com","PeriodLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPeriodLabel(__typeMapper.readString(__in, _lookupTypeInfo("PeriodLabel", "urn:sobject.enterprise.soap.sforce.com","PeriodLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPeriodLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PeriodLabel", "urn:sobject.enterprise.soap.sforce.com","PeriodLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), PeriodLabel, PeriodLabel__is_set);
    }

    /**
     * element : QuarterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean QuarterLabel__is_set = false;

    private java.lang.String QuarterLabel;

    public java.lang.String getQuarterLabel() {
      return QuarterLabel;
    }

    public void setQuarterLabel(java.lang.String QuarterLabel) {
      this.QuarterLabel = QuarterLabel;
      QuarterLabel__is_set = true;
    }

    protected void setQuarterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("QuarterLabel", "urn:sobject.enterprise.soap.sforce.com","QuarterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setQuarterLabel(__typeMapper.readString(__in, _lookupTypeInfo("QuarterLabel", "urn:sobject.enterprise.soap.sforce.com","QuarterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQuarterLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("QuarterLabel", "urn:sobject.enterprise.soap.sforce.com","QuarterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), QuarterLabel, QuarterLabel__is_set);
    }

    /**
     * element : StartDate of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private boolean StartDate__is_set = false;

    private java.util.Calendar StartDate;

    public java.util.Calendar getStartDate() {
      return StartDate;
    }

    public void setStartDate(java.util.Calendar StartDate) {
      this.StartDate = StartDate;
      StartDate__is_set = true;
    }

    protected void setStartDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StartDate", "urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true))) {
        setStartDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("StartDate", "urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldStartDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StartDate", "urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true), StartDate, StartDate__is_set);
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
     * element : Type of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Type__is_set = false;

    private java.lang.String Type;

    public java.lang.String getType() {
      return Type;
    }

    public void setType(java.lang.String Type) {
      this.Type = Type;
      Type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setType(__typeMapper.readString(__in, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true), Type, Type__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Period");
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
      sb.append("[Period ");
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
      writeFieldEndDate(__out, __typeMapper);
      writeFieldFiscalYearSettings(__out, __typeMapper);
      writeFieldFiscalYearSettingsId(__out, __typeMapper);
      writeFieldFullyQualifiedLabel(__out, __typeMapper);
      writeFieldIsForecastPeriod(__out, __typeMapper);
      writeFieldNumber(__out, __typeMapper);
      writeFieldPeriodLabel(__out, __typeMapper);
      writeFieldQuarterLabel(__out, __typeMapper);
      writeFieldStartDate(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEndDate(__in, __typeMapper);
      setFiscalYearSettings(__in, __typeMapper);
      setFiscalYearSettingsId(__in, __typeMapper);
      setFullyQualifiedLabel(__in, __typeMapper);
      setIsForecastPeriod(__in, __typeMapper);
      setNumber(__in, __typeMapper);
      setPeriodLabel(__in, __typeMapper);
      setQuarterLabel(__in, __typeMapper);
      setStartDate(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "EndDate", EndDate);
      toStringHelper(sb, "FiscalYearSettings", FiscalYearSettings);
      toStringHelper(sb, "FiscalYearSettingsId", FiscalYearSettingsId);
      toStringHelper(sb, "FullyQualifiedLabel", FullyQualifiedLabel);
      toStringHelper(sb, "IsForecastPeriod", IsForecastPeriod);
      toStringHelper(sb, "Number", Number);
      toStringHelper(sb, "PeriodLabel", PeriodLabel);
      toStringHelper(sb, "QuarterLabel", QuarterLabel);
      toStringHelper(sb, "StartDate", StartDate);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "Type", Type);
    }


}
