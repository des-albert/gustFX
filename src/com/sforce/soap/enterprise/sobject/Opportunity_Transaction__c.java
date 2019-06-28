package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Opportunity_Transaction__c extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public Opportunity_Transaction__c() {}

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
     * element : Account_Abbr_Name_Opportunity__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Account_Abbr_Name_Opportunity__c__is_set = false;

    private java.lang.String Account_Abbr_Name_Opportunity__c;

    public java.lang.String getAccount_Abbr_Name_Opportunity__c() {
      return Account_Abbr_Name_Opportunity__c;
    }

    public void setAccount_Abbr_Name_Opportunity__c(java.lang.String Account_Abbr_Name_Opportunity__c) {
      this.Account_Abbr_Name_Opportunity__c = Account_Abbr_Name_Opportunity__c;
      Account_Abbr_Name_Opportunity__c__is_set = true;
    }

    protected void setAccount_Abbr_Name_Opportunity__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Account_Abbr_Name_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Account_Abbr_Name_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAccount_Abbr_Name_Opportunity__c(__typeMapper.readString(__in, _lookupTypeInfo("Account_Abbr_Name_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Account_Abbr_Name_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAccount_Abbr_Name_Opportunity__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Account_Abbr_Name_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Account_Abbr_Name_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Account_Abbr_Name_Opportunity__c, Account_Abbr_Name_Opportunity__c__is_set);
    }

    /**
     * element : Agile_Opportunity_ID_Opportunity__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Agile_Opportunity_ID_Opportunity__c__is_set = false;

    private java.lang.String Agile_Opportunity_ID_Opportunity__c;

    public java.lang.String getAgile_Opportunity_ID_Opportunity__c() {
      return Agile_Opportunity_ID_Opportunity__c;
    }

    public void setAgile_Opportunity_ID_Opportunity__c(java.lang.String Agile_Opportunity_ID_Opportunity__c) {
      this.Agile_Opportunity_ID_Opportunity__c = Agile_Opportunity_ID_Opportunity__c;
      Agile_Opportunity_ID_Opportunity__c__is_set = true;
    }

    protected void setAgile_Opportunity_ID_Opportunity__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Agile_Opportunity_ID_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAgile_Opportunity_ID_Opportunity__c(__typeMapper.readString(__in, _lookupTypeInfo("Agile_Opportunity_ID_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAgile_Opportunity_ID_Opportunity__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Agile_Opportunity_ID_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID_Opportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Agile_Opportunity_ID_Opportunity__c, Agile_Opportunity_ID_Opportunity__c__is_set);
    }

    /**
     * element : Asset_Transaction__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Asset_Transaction__c__is_set = false;

    private java.lang.String Asset_Transaction__c;

    public java.lang.String getAsset_Transaction__c() {
      return Asset_Transaction__c;
    }

    public void setAsset_Transaction__c(java.lang.String Asset_Transaction__c) {
      this.Asset_Transaction__c = Asset_Transaction__c;
      Asset_Transaction__c__is_set = true;
    }

    protected void setAsset_Transaction__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Asset_Transaction__c", "urn:sobject.enterprise.soap.sforce.com","Asset_Transaction__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAsset_Transaction__c(__typeMapper.readString(__in, _lookupTypeInfo("Asset_Transaction__c", "urn:sobject.enterprise.soap.sforce.com","Asset_Transaction__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAsset_Transaction__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Asset_Transaction__c", "urn:sobject.enterprise.soap.sforce.com","Asset_Transaction__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Asset_Transaction__c, Asset_Transaction__c__is_set);
    }

    /**
     * element : Opportunity_Name_Quote__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Opportunity_Name_Quote__c__is_set = false;

    private java.lang.String Opportunity_Name_Quote__c;

    public java.lang.String getOpportunity_Name_Quote__c() {
      return Opportunity_Name_Quote__c;
    }

    public void setOpportunity_Name_Quote__c(java.lang.String Opportunity_Name_Quote__c) {
      this.Opportunity_Name_Quote__c = Opportunity_Name_Quote__c;
      Opportunity_Name_Quote__c__is_set = true;
    }

    protected void setOpportunity_Name_Quote__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Opportunity_Name_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOpportunity_Name_Quote__c(__typeMapper.readString(__in, _lookupTypeInfo("Opportunity_Name_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunity_Name_Quote__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Opportunity_Name_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Opportunity_Name_Quote__c, Opportunity_Name_Quote__c__is_set);
    }

    /**
     * element : Quote_Number_Quote__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Quote_Number_Quote__c__is_set = false;

    private java.lang.String Quote_Number_Quote__c;

    public java.lang.String getQuote_Number_Quote__c() {
      return Quote_Number_Quote__c;
    }

    public void setQuote_Number_Quote__c(java.lang.String Quote_Number_Quote__c) {
      this.Quote_Number_Quote__c = Quote_Number_Quote__c;
      Quote_Number_Quote__c__is_set = true;
    }

    protected void setQuote_Number_Quote__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Quote_Number_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Number_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setQuote_Number_Quote__c(__typeMapper.readString(__in, _lookupTypeInfo("Quote_Number_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Number_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQuote_Number_Quote__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Quote_Number_Quote__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Number_Quote__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Quote_Number_Quote__c, Quote_Number_Quote__c__is_set);
    }

    /**
     * element : Quote_Model_Information__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Quote_Model_Information__c__is_set = false;

    private java.lang.String Quote_Model_Information__c;

    public java.lang.String getQuote_Model_Information__c() {
      return Quote_Model_Information__c;
    }

    public void setQuote_Model_Information__c(java.lang.String Quote_Model_Information__c) {
      this.Quote_Model_Information__c = Quote_Model_Information__c;
      Quote_Model_Information__c__is_set = true;
    }

    protected void setQuote_Model_Information__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Quote_Model_Information__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Model_Information__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setQuote_Model_Information__c(__typeMapper.readString(__in, _lookupTypeInfo("Quote_Model_Information__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Model_Information__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQuote_Model_Information__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Quote_Model_Information__c", "urn:sobject.enterprise.soap.sforce.com","Quote_Model_Information__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Quote_Model_Information__c, Quote_Model_Information__c__is_set);
    }

    /**
     * element : Transaction_Product__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Transaction_Product__c__is_set = false;

    private java.lang.String Transaction_Product__c;

    public java.lang.String getTransaction_Product__c() {
      return Transaction_Product__c;
    }

    public void setTransaction_Product__c(java.lang.String Transaction_Product__c) {
      this.Transaction_Product__c = Transaction_Product__c;
      Transaction_Product__c__is_set = true;
    }

    protected void setTransaction_Product__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Transaction_Product__c", "urn:sobject.enterprise.soap.sforce.com","Transaction_Product__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTransaction_Product__c(__typeMapper.readString(__in, _lookupTypeInfo("Transaction_Product__c", "urn:sobject.enterprise.soap.sforce.com","Transaction_Product__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTransaction_Product__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Transaction_Product__c", "urn:sobject.enterprise.soap.sforce.com","Transaction_Product__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Transaction_Product__c, Transaction_Product__c__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Opportunity_Transaction__c");
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
      sb.append("[Opportunity_Transaction__c ");
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
      writeFieldAccount_Abbr_Name_Opportunity__c(__out, __typeMapper);
      writeFieldAgile_Opportunity_ID_Opportunity__c(__out, __typeMapper);
      writeFieldAsset_Transaction__c(__out, __typeMapper);
      writeFieldOpportunity_Name_Quote__c(__out, __typeMapper);
      writeFieldQuote_Number_Quote__c(__out, __typeMapper);
      writeFieldQuote_Model_Information__c(__out, __typeMapper);
      writeFieldTransaction_Product__c(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAccount_Abbr_Name_Opportunity__c(__in, __typeMapper);
      setAgile_Opportunity_ID_Opportunity__c(__in, __typeMapper);
      setAsset_Transaction__c(__in, __typeMapper);
      setOpportunity_Name_Quote__c(__in, __typeMapper);
      setQuote_Number_Quote__c(__in, __typeMapper);
      setQuote_Model_Information__c(__in, __typeMapper);
      setTransaction_Product__c(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Account_Abbr_Name_Opportunity__c", Account_Abbr_Name_Opportunity__c);
      toStringHelper(sb, "Agile_Opportunity_ID_Opportunity__c", Agile_Opportunity_ID_Opportunity__c);
      toStringHelper(sb, "Asset_Transaction__c", Asset_Transaction__c);
      toStringHelper(sb, "Opportunity_Name_Quote__c", Opportunity_Name_Quote__c);
      toStringHelper(sb, "Quote_Number_Quote__c", Quote_Number_Quote__c);
      toStringHelper(sb, "Quote_Model_Information__c", Quote_Model_Information__c);
      toStringHelper(sb, "Transaction_Product__c", Transaction_Product__c);
    }


}