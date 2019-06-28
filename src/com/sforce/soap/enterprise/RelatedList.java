package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class RelatedList implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public RelatedList() {}

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
     * element : accessLevelRequiredForCreate of type {urn:enterprise.soap.sforce.com}ShareAccessLevel
     * java type: com.sforce.soap.enterprise.ShareAccessLevel
     */
    private boolean accessLevelRequiredForCreate__is_set = false;

    private com.sforce.soap.enterprise.ShareAccessLevel accessLevelRequiredForCreate;

    public com.sforce.soap.enterprise.ShareAccessLevel getAccessLevelRequiredForCreate() {
      return accessLevelRequiredForCreate;
    }

    public void setAccessLevelRequiredForCreate(com.sforce.soap.enterprise.ShareAccessLevel accessLevelRequiredForCreate) {
      this.accessLevelRequiredForCreate = accessLevelRequiredForCreate;
      accessLevelRequiredForCreate__is_set = true;
    }

    protected void setAccessLevelRequiredForCreate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("accessLevelRequiredForCreate", "urn:enterprise.soap.sforce.com","accessLevelRequiredForCreate","urn:enterprise.soap.sforce.com","ShareAccessLevel",1,1,true))) {
        setAccessLevelRequiredForCreate((com.sforce.soap.enterprise.ShareAccessLevel)__typeMapper.readObject(__in, _lookupTypeInfo("accessLevelRequiredForCreate", "urn:enterprise.soap.sforce.com","accessLevelRequiredForCreate","urn:enterprise.soap.sforce.com","ShareAccessLevel",1,1,true), com.sforce.soap.enterprise.ShareAccessLevel.class));
      }
    }

    private void writeFieldAccessLevelRequiredForCreate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("accessLevelRequiredForCreate", "urn:enterprise.soap.sforce.com","accessLevelRequiredForCreate","urn:enterprise.soap.sforce.com","ShareAccessLevel",1,1,true), accessLevelRequiredForCreate, accessLevelRequiredForCreate__is_set);
    }

    /**
     * element : buttons of type {urn:enterprise.soap.sforce.com}DescribeLayoutButton
     * java type: com.sforce.soap.enterprise.DescribeLayoutButton[]
     */
    private boolean buttons__is_set = false;

    private com.sforce.soap.enterprise.DescribeLayoutButton[] buttons = new com.sforce.soap.enterprise.DescribeLayoutButton[0];

    public com.sforce.soap.enterprise.DescribeLayoutButton[] getButtons() {
      return buttons;
    }

    public void setButtons(com.sforce.soap.enterprise.DescribeLayoutButton[] buttons) {
      this.buttons = buttons;
      buttons__is_set = true;
    }

    protected void setButtons(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("buttons", "urn:enterprise.soap.sforce.com","buttons","urn:enterprise.soap.sforce.com","DescribeLayoutButton",0,-1,true))) {
        setButtons((com.sforce.soap.enterprise.DescribeLayoutButton[])__typeMapper.readObject(__in, _lookupTypeInfo("buttons", "urn:enterprise.soap.sforce.com","buttons","urn:enterprise.soap.sforce.com","DescribeLayoutButton",0,-1,true), com.sforce.soap.enterprise.DescribeLayoutButton[].class));
      }
    }

    private void writeFieldButtons(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("buttons", "urn:enterprise.soap.sforce.com","buttons","urn:enterprise.soap.sforce.com","DescribeLayoutButton",0,-1,true), buttons, buttons__is_set);
    }

    /**
     * element : columns of type {urn:enterprise.soap.sforce.com}RelatedListColumn
     * java type: com.sforce.soap.enterprise.RelatedListColumn[]
     */
    private boolean columns__is_set = false;

    private com.sforce.soap.enterprise.RelatedListColumn[] columns = new com.sforce.soap.enterprise.RelatedListColumn[0];

    public com.sforce.soap.enterprise.RelatedListColumn[] getColumns() {
      return columns;
    }

    public void setColumns(com.sforce.soap.enterprise.RelatedListColumn[] columns) {
      this.columns = columns;
      columns__is_set = true;
    }

    protected void setColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("columns", "urn:enterprise.soap.sforce.com","columns","urn:enterprise.soap.sforce.com","RelatedListColumn",1,-1,true))) {
        setColumns((com.sforce.soap.enterprise.RelatedListColumn[])__typeMapper.readObject(__in, _lookupTypeInfo("columns", "urn:enterprise.soap.sforce.com","columns","urn:enterprise.soap.sforce.com","RelatedListColumn",1,-1,true), com.sforce.soap.enterprise.RelatedListColumn[].class));
      }
    }

    private void writeFieldColumns(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("columns", "urn:enterprise.soap.sforce.com","columns","urn:enterprise.soap.sforce.com","RelatedListColumn",1,-1,true), columns, columns__is_set);
    }

    /**
     * element : custom of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean custom__is_set = false;

    private boolean custom;

    public boolean getCustom() {
      return custom;
    }

    public boolean isCustom() {
      return custom;
    }

    public void setCustom(boolean custom) {
      this.custom = custom;
      custom__is_set = true;
    }

    protected void setCustom(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("custom", "urn:enterprise.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setCustom(__typeMapper.readBoolean(__in, _lookupTypeInfo("custom", "urn:enterprise.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldCustom(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("custom", "urn:enterprise.soap.sforce.com","custom","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), custom, custom__is_set);
    }

    /**
     * element : field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean field__is_set = false;

    private java.lang.String field;

    public java.lang.String getField() {
      return field;
    }

    public void setField(java.lang.String field) {
      this.field = field;
      field__is_set = true;
    }

    protected void setField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("field", "urn:enterprise.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setField(__typeMapper.readString(__in, _lookupTypeInfo("field", "urn:enterprise.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("field", "urn:enterprise.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), field, field__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : limitRows of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean limitRows__is_set = false;

    private int limitRows;

    public int getLimitRows() {
      return limitRows;
    }

    public void setLimitRows(int limitRows) {
      this.limitRows = limitRows;
      limitRows__is_set = true;
    }

    protected void setLimitRows(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("limitRows", "urn:enterprise.soap.sforce.com","limitRows","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setLimitRows((int)__typeMapper.readInt(__in, _lookupTypeInfo("limitRows", "urn:enterprise.soap.sforce.com","limitRows","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldLimitRows(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("limitRows", "urn:enterprise.soap.sforce.com","limitRows","http://www.w3.org/2001/XMLSchema","int",1,1,true), limitRows, limitRows__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
    }

    /**
     * element : sobject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean sobject__is_set = false;

    private java.lang.String sobject;

    public java.lang.String getSobject() {
      return sobject;
    }

    public void setSobject(java.lang.String sobject) {
      this.sobject = sobject;
      sobject__is_set = true;
    }

    protected void setSobject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sobject", "urn:enterprise.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setSobject(__typeMapper.readString(__in, _lookupTypeInfo("sobject", "urn:enterprise.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSobject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sobject", "urn:enterprise.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true), sobject, sobject__is_set);
    }

    /**
     * element : sort of type {urn:enterprise.soap.sforce.com}RelatedListSort
     * java type: com.sforce.soap.enterprise.RelatedListSort[]
     */
    private boolean sort__is_set = false;

    private com.sforce.soap.enterprise.RelatedListSort[] sort = new com.sforce.soap.enterprise.RelatedListSort[0];

    public com.sforce.soap.enterprise.RelatedListSort[] getSort() {
      return sort;
    }

    public void setSort(com.sforce.soap.enterprise.RelatedListSort[] sort) {
      this.sort = sort;
      sort__is_set = true;
    }

    protected void setSort(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("sort", "urn:enterprise.soap.sforce.com","sort","urn:enterprise.soap.sforce.com","RelatedListSort",0,-1,true))) {
        setSort((com.sforce.soap.enterprise.RelatedListSort[])__typeMapper.readObject(__in, _lookupTypeInfo("sort", "urn:enterprise.soap.sforce.com","sort","urn:enterprise.soap.sforce.com","RelatedListSort",0,-1,true), com.sforce.soap.enterprise.RelatedListSort[].class));
      }
    }

    private void writeFieldSort(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sort", "urn:enterprise.soap.sforce.com","sort","urn:enterprise.soap.sforce.com","RelatedListSort",0,-1,true), sort, sort__is_set);
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
      sb.append("[RelatedList ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAccessLevelRequiredForCreate(__out, __typeMapper);
      writeFieldButtons(__out, __typeMapper);
      writeFieldColumns(__out, __typeMapper);
      writeFieldCustom(__out, __typeMapper);
      writeFieldField(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLimitRows(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldSobject(__out, __typeMapper);
      writeFieldSort(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAccessLevelRequiredForCreate(__in, __typeMapper);
      setButtons(__in, __typeMapper);
      setColumns(__in, __typeMapper);
      setCustom(__in, __typeMapper);
      setField(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLimitRows(__in, __typeMapper);
      setName(__in, __typeMapper);
      setSobject(__in, __typeMapper);
      setSort(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "accessLevelRequiredForCreate", accessLevelRequiredForCreate);
      toStringHelper(sb, "buttons", buttons);
      toStringHelper(sb, "columns", columns);
      toStringHelper(sb, "custom", custom);
      toStringHelper(sb, "field", field);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "limitRows", limitRows);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "sobject", sobject);
      toStringHelper(sb, "sort", sort);
    }


}
