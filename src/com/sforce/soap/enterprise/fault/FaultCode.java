package com.sforce.soap.enterprise.fault;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FaultCode {


  
	/**
	 * Enumeration  : APEX_REST_SERVICES_DISABLED
	 */
	APEX_REST_SERVICES_DISABLED("fns:APEX_REST_SERVICES_DISABLED"),

  
	/**
	 * Enumeration  : APEX_TRIGGER_COUPLING_LIMIT
	 */
	APEX_TRIGGER_COUPLING_LIMIT("fns:APEX_TRIGGER_COUPLING_LIMIT"),

  
	/**
	 * Enumeration  : API_CURRENTLY_DISABLED
	 */
	API_CURRENTLY_DISABLED("fns:API_CURRENTLY_DISABLED"),

  
	/**
	 * Enumeration  : API_DISABLED_FOR_ORG
	 */
	API_DISABLED_FOR_ORG("fns:API_DISABLED_FOR_ORG"),

  
	/**
	 * Enumeration  : ARGUMENT_OBJECT_PARSE_ERROR
	 */
	ARGUMENT_OBJECT_PARSE_ERROR("fns:ARGUMENT_OBJECT_PARSE_ERROR"),

  
	/**
	 * Enumeration  : ASYNC_OPERATION_LOCATOR
	 */
	ASYNC_OPERATION_LOCATOR("fns:ASYNC_OPERATION_LOCATOR"),

  
	/**
	 * Enumeration  : ASYNC_QUERY_UNSUPPORTED_QUERY
	 */
	ASYNC_QUERY_UNSUPPORTED_QUERY("fns:ASYNC_QUERY_UNSUPPORTED_QUERY"),

  
	/**
	 * Enumeration  : BATCH_PROCESSING_HALTED
	 */
	BATCH_PROCESSING_HALTED("fns:BATCH_PROCESSING_HALTED"),

  
	/**
	 * Enumeration  : BIG_OBJECT_UNSUPPORTED_OPERATION
	 */
	BIG_OBJECT_UNSUPPORTED_OPERATION("fns:BIG_OBJECT_UNSUPPORTED_OPERATION"),

  
	/**
	 * Enumeration  : CANNOT_DELETE_ENTITY
	 */
	CANNOT_DELETE_ENTITY("fns:CANNOT_DELETE_ENTITY"),

  
	/**
	 * Enumeration  : CANNOT_DELETE_OWNER
	 */
	CANNOT_DELETE_OWNER("fns:CANNOT_DELETE_OWNER"),

  
	/**
	 * Enumeration  : CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY
	 */
	CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY("fns:CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY"),

  
	/**
	 * Enumeration  : CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY
	 */
	CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY("fns:CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY"),

  
	/**
	 * Enumeration  : CIRCULAR_OBJECT_GRAPH
	 */
	CIRCULAR_OBJECT_GRAPH("fns:CIRCULAR_OBJECT_GRAPH"),

  
	/**
	 * Enumeration  : CLIENT_NOT_ACCESSIBLE_FOR_USER
	 */
	CLIENT_NOT_ACCESSIBLE_FOR_USER("fns:CLIENT_NOT_ACCESSIBLE_FOR_USER"),

  
	/**
	 * Enumeration  : CLIENT_REQUIRE_UPDATE_FOR_USER
	 */
	CLIENT_REQUIRE_UPDATE_FOR_USER("fns:CLIENT_REQUIRE_UPDATE_FOR_USER"),

  
	/**
	 * Enumeration  : CONTENT_CUSTOM_DOWNLOAD_EXCEPTION
	 */
	CONTENT_CUSTOM_DOWNLOAD_EXCEPTION("fns:CONTENT_CUSTOM_DOWNLOAD_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_AUTHENTICATION_EXCEPTION
	 */
	CONTENT_HUB_AUTHENTICATION_EXCEPTION("fns:CONTENT_HUB_AUTHENTICATION_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION
	 */
	CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION("fns:CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_FILE_HAS_NO_URL_EXCEPTION
	 */
	CONTENT_HUB_FILE_HAS_NO_URL_EXCEPTION("fns:CONTENT_HUB_FILE_HAS_NO_URL_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION
	 */
	CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION("fns:CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION
	 */
	CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION("fns:CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION
	 */
	CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION("fns:CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_INVALID_PAYLOAD
	 */
	CONTENT_HUB_INVALID_PAYLOAD("fns:CONTENT_HUB_INVALID_PAYLOAD"),

  
	/**
	 * Enumeration  : CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION
	 */
	CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION("fns:CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION
	 */
	CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION("fns:CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION
	 */
	CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION("fns:CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION
	 */
	CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION("fns:CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_SECURITY_EXCEPTION
	 */
	CONTENT_HUB_SECURITY_EXCEPTION("fns:CONTENT_HUB_SECURITY_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_TIMEOUT_EXCEPTION
	 */
	CONTENT_HUB_TIMEOUT_EXCEPTION("fns:CONTENT_HUB_TIMEOUT_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_HUB_UNEXPECTED_EXCEPTION
	 */
	CONTENT_HUB_UNEXPECTED_EXCEPTION("fns:CONTENT_HUB_UNEXPECTED_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_IMAGE_SCALING_INVALID_ARGUMENTS_EXCEPTION
	 */
	CONTENT_IMAGE_SCALING_INVALID_ARGUMENTS_EXCEPTION("fns:CONTENT_IMAGE_SCALING_INVALID_ARGUMENTS_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_IMAGE_SCALING_INVALID_IMAGE_EXCEPTION
	 */
	CONTENT_IMAGE_SCALING_INVALID_IMAGE_EXCEPTION("fns:CONTENT_IMAGE_SCALING_INVALID_IMAGE_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_IMAGE_SCALING_MAX_RENDITIONS_EXCEPTION
	 */
	CONTENT_IMAGE_SCALING_MAX_RENDITIONS_EXCEPTION("fns:CONTENT_IMAGE_SCALING_MAX_RENDITIONS_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_IMAGE_SCALING_TIMEOUT_EXCEPTION
	 */
	CONTENT_IMAGE_SCALING_TIMEOUT_EXCEPTION("fns:CONTENT_IMAGE_SCALING_TIMEOUT_EXCEPTION"),

  
	/**
	 * Enumeration  : CONTENT_IMAGE_SCALING_UNKNOWN_EXCEPTION
	 */
	CONTENT_IMAGE_SCALING_UNKNOWN_EXCEPTION("fns:CONTENT_IMAGE_SCALING_UNKNOWN_EXCEPTION"),

  
	/**
	 * Enumeration  : CUSTOM_METADATA_LIMIT_EXCEEDED
	 */
	CUSTOM_METADATA_LIMIT_EXCEEDED("fns:CUSTOM_METADATA_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : CUSTOM_SETTINGS_LIMIT_EXCEEDED
	 */
	CUSTOM_SETTINGS_LIMIT_EXCEEDED("fns:CUSTOM_SETTINGS_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : DATACLOUD_API_CLIENT_EXCEPTION
	 */
	DATACLOUD_API_CLIENT_EXCEPTION("fns:DATACLOUD_API_CLIENT_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_DISABLED_EXCEPTION
	 */
	DATACLOUD_API_DISABLED_EXCEPTION("fns:DATACLOUD_API_DISABLED_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_INVALID_QUERY_EXCEPTION
	 */
	DATACLOUD_API_INVALID_QUERY_EXCEPTION("fns:DATACLOUD_API_INVALID_QUERY_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_SERVER_BUSY_EXCEPTION
	 */
	DATACLOUD_API_SERVER_BUSY_EXCEPTION("fns:DATACLOUD_API_SERVER_BUSY_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_SERVER_EXCEPTION
	 */
	DATACLOUD_API_SERVER_EXCEPTION("fns:DATACLOUD_API_SERVER_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_TIMEOUT_EXCEPTION
	 */
	DATACLOUD_API_TIMEOUT_EXCEPTION("fns:DATACLOUD_API_TIMEOUT_EXCEPTION"),

  
	/**
	 * Enumeration  : DATACLOUD_API_UNAVAILABLE
	 */
	DATACLOUD_API_UNAVAILABLE("fns:DATACLOUD_API_UNAVAILABLE"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_INPUT_ERROR
	 */
	DATA_INTEGRATION_INPUT_ERROR("fns:DATA_INTEGRATION_INPUT_ERROR"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_NOT_FOUND
	 */
	DATA_INTEGRATION_NOT_FOUND("fns:DATA_INTEGRATION_NOT_FOUND"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_NO_ACCESS
	 */
	DATA_INTEGRATION_NO_ACCESS("fns:DATA_INTEGRATION_NO_ACCESS"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_PACKAGE_ERROR
	 */
	DATA_INTEGRATION_PACKAGE_ERROR("fns:DATA_INTEGRATION_PACKAGE_ERROR"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_SERVER_ERROR
	 */
	DATA_INTEGRATION_SERVER_ERROR("fns:DATA_INTEGRATION_SERVER_ERROR"),

  
	/**
	 * Enumeration  : DATA_INTEGRATION_VENDOR_SETUP_ERROR
	 */
	DATA_INTEGRATION_VENDOR_SETUP_ERROR("fns:DATA_INTEGRATION_VENDOR_SETUP_ERROR"),

  
	/**
	 * Enumeration  : DUPLICATE_ARGUMENT_VALUE
	 */
	DUPLICATE_ARGUMENT_VALUE("fns:DUPLICATE_ARGUMENT_VALUE"),

  
	/**
	 * Enumeration  : DUPLICATE_VALUE
	 */
	DUPLICATE_VALUE("fns:DUPLICATE_VALUE"),

  
	/**
	 * Enumeration  : EMAIL_BATCH_SIZE_LIMIT_EXCEEDED
	 */
	EMAIL_BATCH_SIZE_LIMIT_EXCEEDED("fns:EMAIL_BATCH_SIZE_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : EMAIL_TO_CASE_INVALID_ROUTING
	 */
	EMAIL_TO_CASE_INVALID_ROUTING("fns:EMAIL_TO_CASE_INVALID_ROUTING"),

  
	/**
	 * Enumeration  : EMAIL_TO_CASE_LIMIT_EXCEEDED
	 */
	EMAIL_TO_CASE_LIMIT_EXCEEDED("fns:EMAIL_TO_CASE_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : EMAIL_TO_CASE_NOT_ENABLED
	 */
	EMAIL_TO_CASE_NOT_ENABLED("fns:EMAIL_TO_CASE_NOT_ENABLED"),

  
	/**
	 * Enumeration  : ENTITY_NOT_QUERYABLE
	 */
	ENTITY_NOT_QUERYABLE("fns:ENTITY_NOT_QUERYABLE"),

  
	/**
	 * Enumeration  : ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT
	 */
	ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT("fns:ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"),

  
	/**
	 * Enumeration  : EXCEEDED_ID_LIMIT
	 */
	EXCEEDED_ID_LIMIT("fns:EXCEEDED_ID_LIMIT"),

  
	/**
	 * Enumeration  : EXCEEDED_LEAD_CONVERT_LIMIT
	 */
	EXCEEDED_LEAD_CONVERT_LIMIT("fns:EXCEEDED_LEAD_CONVERT_LIMIT"),

  
	/**
	 * Enumeration  : EXCEEDED_MAX_SIZE_REQUEST
	 */
	EXCEEDED_MAX_SIZE_REQUEST("fns:EXCEEDED_MAX_SIZE_REQUEST"),

  
	/**
	 * Enumeration  : EXCEEDED_MAX_SOBJECTS
	 */
	EXCEEDED_MAX_SOBJECTS("fns:EXCEEDED_MAX_SOBJECTS"),

  
	/**
	 * Enumeration  : EXCEEDED_MAX_TYPES_LIMIT
	 */
	EXCEEDED_MAX_TYPES_LIMIT("fns:EXCEEDED_MAX_TYPES_LIMIT"),

  
	/**
	 * Enumeration  : EXCEEDED_QUOTA
	 */
	EXCEEDED_QUOTA("fns:EXCEEDED_QUOTA"),

  
	/**
	 * Enumeration  : EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION
	 */
	EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION("fns:EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION"),

  
	/**
	 * Enumeration  : EXTERNAL_OBJECT_CONNECTION_EXCEPTION
	 */
	EXTERNAL_OBJECT_CONNECTION_EXCEPTION("fns:EXTERNAL_OBJECT_CONNECTION_EXCEPTION"),

  
	/**
	 * Enumeration  : EXTERNAL_OBJECT_EXCEPTION
	 */
	EXTERNAL_OBJECT_EXCEPTION("fns:EXTERNAL_OBJECT_EXCEPTION"),

  
	/**
	 * Enumeration  : EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION
	 */
	EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION("fns:EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION"),

  
	/**
	 * Enumeration  : FEDERATED_SEARCH_ERROR
	 */
	FEDERATED_SEARCH_ERROR("fns:FEDERATED_SEARCH_ERROR"),

  
	/**
	 * Enumeration  : FEED_NOT_ENABLED_FOR_OBJECT
	 */
	FEED_NOT_ENABLED_FOR_OBJECT("fns:FEED_NOT_ENABLED_FOR_OBJECT"),

  
	/**
	 * Enumeration  : FUNCTIONALITY_NOT_ENABLED
	 */
	FUNCTIONALITY_NOT_ENABLED("fns:FUNCTIONALITY_NOT_ENABLED"),

  
	/**
	 * Enumeration  : FUNCTIONALITY_TEMPORARILY_UNAVAILABLE
	 */
	FUNCTIONALITY_TEMPORARILY_UNAVAILABLE("fns:FUNCTIONALITY_TEMPORARILY_UNAVAILABLE"),

  
	/**
	 * Enumeration  : ILLEGAL_QUERY_PARAMETER_VALUE
	 */
	ILLEGAL_QUERY_PARAMETER_VALUE("fns:ILLEGAL_QUERY_PARAMETER_VALUE"),

  
	/**
	 * Enumeration  : INACTIVE_OWNER_OR_USER
	 */
	INACTIVE_OWNER_OR_USER("fns:INACTIVE_OWNER_OR_USER"),

  
	/**
	 * Enumeration  : INACTIVE_PORTAL
	 */
	INACTIVE_PORTAL("fns:INACTIVE_PORTAL"),

  
	/**
	 * Enumeration  : INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE
	 */
	INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE("fns:INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE"),

  
	/**
	 * Enumeration  : INSUFFICIENT_ACCESS
	 */
	INSUFFICIENT_ACCESS("fns:INSUFFICIENT_ACCESS"),

  
	/**
	 * Enumeration  : INSUFFICIENT_ACCESS_APEX_METADATA_DEPLOY
	 */
	INSUFFICIENT_ACCESS_APEX_METADATA_DEPLOY("fns:INSUFFICIENT_ACCESS_APEX_METADATA_DEPLOY"),

  
	/**
	 * Enumeration  : INTERNAL_CANVAS_ERROR
	 */
	INTERNAL_CANVAS_ERROR("fns:INTERNAL_CANVAS_ERROR"),

  
	/**
	 * Enumeration  : INVALID_ASSIGNMENT_RULE
	 */
	INVALID_ASSIGNMENT_RULE("fns:INVALID_ASSIGNMENT_RULE"),

  
	/**
	 * Enumeration  : INVALID_BATCH_REQUEST
	 */
	INVALID_BATCH_REQUEST("fns:INVALID_BATCH_REQUEST"),

  
	/**
	 * Enumeration  : INVALID_BATCH_SIZE
	 */
	INVALID_BATCH_SIZE("fns:INVALID_BATCH_SIZE"),

  
	/**
	 * Enumeration  : INVALID_CLIENT
	 */
	INVALID_CLIENT("fns:INVALID_CLIENT"),

  
	/**
	 * Enumeration  : INVALID_CROSS_REFERENCE_KEY
	 */
	INVALID_CROSS_REFERENCE_KEY("fns:INVALID_CROSS_REFERENCE_KEY"),

  
	/**
	 * Enumeration  : INVALID_DATE_FORMAT
	 */
	INVALID_DATE_FORMAT("fns:INVALID_DATE_FORMAT"),

  
	/**
	 * Enumeration  : INVALID_FIELD
	 */
	INVALID_FIELD("fns:INVALID_FIELD"),

  
	/**
	 * Enumeration  : INVALID_FILTER_LANGUAGE
	 */
	INVALID_FILTER_LANGUAGE("fns:INVALID_FILTER_LANGUAGE"),

  
	/**
	 * Enumeration  : INVALID_FILTER_VALUE
	 */
	INVALID_FILTER_VALUE("fns:INVALID_FILTER_VALUE"),

  
	/**
	 * Enumeration  : INVALID_ID_FIELD
	 */
	INVALID_ID_FIELD("fns:INVALID_ID_FIELD"),

  
	/**
	 * Enumeration  : INVALID_INPUT_COMBINATION
	 */
	INVALID_INPUT_COMBINATION("fns:INVALID_INPUT_COMBINATION"),

  
	/**
	 * Enumeration  : INVALID_LOCALE_LANGUAGE
	 */
	INVALID_LOCALE_LANGUAGE("fns:INVALID_LOCALE_LANGUAGE"),

  
	/**
	 * Enumeration  : INVALID_LOCATOR
	 */
	INVALID_LOCATOR("fns:INVALID_LOCATOR"),

  
	/**
	 * Enumeration  : INVALID_LOGIN
	 */
	INVALID_LOGIN("fns:INVALID_LOGIN"),

  
	/**
	 * Enumeration  : INVALID_MULTIPART_REQUEST
	 */
	INVALID_MULTIPART_REQUEST("fns:INVALID_MULTIPART_REQUEST"),

  
	/**
	 * Enumeration  : INVALID_NEW_PASSWORD
	 */
	INVALID_NEW_PASSWORD("fns:INVALID_NEW_PASSWORD"),

  
	/**
	 * Enumeration  : INVALID_OLD_PASSWORD
	 */
	INVALID_OLD_PASSWORD("fns:INVALID_OLD_PASSWORD"),

  
	/**
	 * Enumeration  : INVALID_OPERATION
	 */
	INVALID_OPERATION("fns:INVALID_OPERATION"),

  
	/**
	 * Enumeration  : INVALID_OPERATION_WITH_EXPIRED_PASSWORD
	 */
	INVALID_OPERATION_WITH_EXPIRED_PASSWORD("fns:INVALID_OPERATION_WITH_EXPIRED_PASSWORD"),

  
	/**
	 * Enumeration  : INVALID_PACKAGE_VERSION
	 */
	INVALID_PACKAGE_VERSION("fns:INVALID_PACKAGE_VERSION"),

  
	/**
	 * Enumeration  : INVALID_PAGING_OPTION
	 */
	INVALID_PAGING_OPTION("fns:INVALID_PAGING_OPTION"),

  
	/**
	 * Enumeration  : INVALID_QUERY_FILTER_OPERATOR
	 */
	INVALID_QUERY_FILTER_OPERATOR("fns:INVALID_QUERY_FILTER_OPERATOR"),

  
	/**
	 * Enumeration  : INVALID_QUERY_LOCATOR
	 */
	INVALID_QUERY_LOCATOR("fns:INVALID_QUERY_LOCATOR"),

  
	/**
	 * Enumeration  : INVALID_QUERY_SCOPE
	 */
	INVALID_QUERY_SCOPE("fns:INVALID_QUERY_SCOPE"),

  
	/**
	 * Enumeration  : INVALID_REPLICATION_DATE
	 */
	INVALID_REPLICATION_DATE("fns:INVALID_REPLICATION_DATE"),

  
	/**
	 * Enumeration  : INVALID_SEARCH
	 */
	INVALID_SEARCH("fns:INVALID_SEARCH"),

  
	/**
	 * Enumeration  : INVALID_SEARCH_SCOPE
	 */
	INVALID_SEARCH_SCOPE("fns:INVALID_SEARCH_SCOPE"),

  
	/**
	 * Enumeration  : INVALID_SESSION_ID
	 */
	INVALID_SESSION_ID("fns:INVALID_SESSION_ID"),

  
	/**
	 * Enumeration  : INVALID_SOAP_HEADER
	 */
	INVALID_SOAP_HEADER("fns:INVALID_SOAP_HEADER"),

  
	/**
	 * Enumeration  : INVALID_SORT_OPTION
	 */
	INVALID_SORT_OPTION("fns:INVALID_SORT_OPTION"),

  
	/**
	 * Enumeration  : INVALID_SSO_GATEWAY_URL
	 */
	INVALID_SSO_GATEWAY_URL("fns:INVALID_SSO_GATEWAY_URL"),

  
	/**
	 * Enumeration  : INVALID_TYPE
	 */
	INVALID_TYPE("fns:INVALID_TYPE"),

  
	/**
	 * Enumeration  : INVALID_TYPE_FOR_OPERATION
	 */
	INVALID_TYPE_FOR_OPERATION("fns:INVALID_TYPE_FOR_OPERATION"),

  
	/**
	 * Enumeration  : JIGSAW_ACTION_DISABLED
	 */
	JIGSAW_ACTION_DISABLED("fns:JIGSAW_ACTION_DISABLED"),

  
	/**
	 * Enumeration  : JIGSAW_IMPORT_LIMIT_EXCEEDED
	 */
	JIGSAW_IMPORT_LIMIT_EXCEEDED("fns:JIGSAW_IMPORT_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : JIGSAW_REQUEST_NOT_SUPPORTED
	 */
	JIGSAW_REQUEST_NOT_SUPPORTED("fns:JIGSAW_REQUEST_NOT_SUPPORTED"),

  
	/**
	 * Enumeration  : JSON_PARSER_ERROR
	 */
	JSON_PARSER_ERROR("fns:JSON_PARSER_ERROR"),

  
	/**
	 * Enumeration  : KEY_HAS_BEEN_DESTROYED
	 */
	KEY_HAS_BEEN_DESTROYED("fns:KEY_HAS_BEEN_DESTROYED"),

  
	/**
	 * Enumeration  : LICENSING_DATA_ERROR
	 */
	LICENSING_DATA_ERROR("fns:LICENSING_DATA_ERROR"),

  
	/**
	 * Enumeration  : LICENSING_UNKNOWN_ERROR
	 */
	LICENSING_UNKNOWN_ERROR("fns:LICENSING_UNKNOWN_ERROR"),

  
	/**
	 * Enumeration  : LIMIT_EXCEEDED
	 */
	LIMIT_EXCEEDED("fns:LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : LOGIN_CHALLENGE_ISSUED
	 */
	LOGIN_CHALLENGE_ISSUED("fns:LOGIN_CHALLENGE_ISSUED"),

  
	/**
	 * Enumeration  : LOGIN_CHALLENGE_PENDING
	 */
	LOGIN_CHALLENGE_PENDING("fns:LOGIN_CHALLENGE_PENDING"),

  
	/**
	 * Enumeration  : LOGIN_DURING_RESTRICTED_DOMAIN
	 */
	LOGIN_DURING_RESTRICTED_DOMAIN("fns:LOGIN_DURING_RESTRICTED_DOMAIN"),

  
	/**
	 * Enumeration  : LOGIN_DURING_RESTRICTED_TIME
	 */
	LOGIN_DURING_RESTRICTED_TIME("fns:LOGIN_DURING_RESTRICTED_TIME"),

  
	/**
	 * Enumeration  : LOGIN_MUST_USE_SECURITY_TOKEN
	 */
	LOGIN_MUST_USE_SECURITY_TOKEN("fns:LOGIN_MUST_USE_SECURITY_TOKEN"),

  
	/**
	 * Enumeration  : MALFORMED_ID
	 */
	MALFORMED_ID("fns:MALFORMED_ID"),

  
	/**
	 * Enumeration  : MALFORMED_QUERY
	 */
	MALFORMED_QUERY("fns:MALFORMED_QUERY"),

  
	/**
	 * Enumeration  : MALFORMED_SEARCH
	 */
	MALFORMED_SEARCH("fns:MALFORMED_SEARCH"),

  
	/**
	 * Enumeration  : MISSING_ARGUMENT
	 */
	MISSING_ARGUMENT("fns:MISSING_ARGUMENT"),

  
	/**
	 * Enumeration  : MISSING_RECORD
	 */
	MISSING_RECORD("fns:MISSING_RECORD"),

  
	/**
	 * Enumeration  : MODIFIED
	 */
	MODIFIED("fns:MODIFIED"),

  
	/**
	 * Enumeration  : MUTUAL_AUTHENTICATION_FAILED
	 */
	MUTUAL_AUTHENTICATION_FAILED("fns:MUTUAL_AUTHENTICATION_FAILED"),

  
	/**
	 * Enumeration  : NOT_ACCEPTABLE
	 */
	NOT_ACCEPTABLE("fns:NOT_ACCEPTABLE"),

  
	/**
	 * Enumeration  : NOT_MODIFIED
	 */
	NOT_MODIFIED("fns:NOT_MODIFIED"),

  
	/**
	 * Enumeration  : NO_ACTIVE_DUPLICATE_RULE
	 */
	NO_ACTIVE_DUPLICATE_RULE("fns:NO_ACTIVE_DUPLICATE_RULE"),

  
	/**
	 * Enumeration  : NO_RECIPIENTS
	 */
	NO_RECIPIENTS("fns:NO_RECIPIENTS"),

  
	/**
	 * Enumeration  : NO_SOFTPHONE_LAYOUT
	 */
	NO_SOFTPHONE_LAYOUT("fns:NO_SOFTPHONE_LAYOUT"),

  
	/**
	 * Enumeration  : NUMBER_OUTSIDE_VALID_RANGE
	 */
	NUMBER_OUTSIDE_VALID_RANGE("fns:NUMBER_OUTSIDE_VALID_RANGE"),

  
	/**
	 * Enumeration  : OPERATION_TOO_LARGE
	 */
	OPERATION_TOO_LARGE("fns:OPERATION_TOO_LARGE"),

  
	/**
	 * Enumeration  : ORG_IN_MAINTENANCE
	 */
	ORG_IN_MAINTENANCE("fns:ORG_IN_MAINTENANCE"),

  
	/**
	 * Enumeration  : ORG_IS_DOT_ORG
	 */
	ORG_IS_DOT_ORG("fns:ORG_IS_DOT_ORG"),

  
	/**
	 * Enumeration  : ORG_IS_SIGNING_UP
	 */
	ORG_IS_SIGNING_UP("fns:ORG_IS_SIGNING_UP"),

  
	/**
	 * Enumeration  : ORG_LOCKED
	 */
	ORG_LOCKED("fns:ORG_LOCKED"),

  
	/**
	 * Enumeration  : ORG_NOT_OWNED_BY_INSTANCE
	 */
	ORG_NOT_OWNED_BY_INSTANCE("fns:ORG_NOT_OWNED_BY_INSTANCE"),

  
	/**
	 * Enumeration  : PASSWORD_LOCKOUT
	 */
	PASSWORD_LOCKOUT("fns:PASSWORD_LOCKOUT"),

  
	/**
	 * Enumeration  : PORTAL_NO_ACCESS
	 */
	PORTAL_NO_ACCESS("fns:PORTAL_NO_ACCESS"),

  
	/**
	 * Enumeration  : POST_BODY_PARSE_ERROR
	 */
	POST_BODY_PARSE_ERROR("fns:POST_BODY_PARSE_ERROR"),

  
	/**
	 * Enumeration  : QAT_HETEROGENOUS_CONTEXT_IDS
	 */
	QAT_HETEROGENOUS_CONTEXT_IDS("fns:QAT_HETEROGENOUS_CONTEXT_IDS"),

  
	/**
	 * Enumeration  : QAT_INVALID_CONTEXT_ID
	 */
	QAT_INVALID_CONTEXT_ID("fns:QAT_INVALID_CONTEXT_ID"),

  
	/**
	 * Enumeration  : QAT_INVALID_QUICK_ACTION
	 */
	QAT_INVALID_QUICK_ACTION("fns:QAT_INVALID_QUICK_ACTION"),

  
	/**
	 * Enumeration  : QUERY_TIMEOUT
	 */
	QUERY_TIMEOUT("fns:QUERY_TIMEOUT"),

  
	/**
	 * Enumeration  : QUERY_TOO_COMPLICATED
	 */
	QUERY_TOO_COMPLICATED("fns:QUERY_TOO_COMPLICATED"),

  
	/**
	 * Enumeration  : REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT
	 */
	REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT("fns:REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT"),

  
	/**
	 * Enumeration  : REQUEST_LIMIT_EXCEEDED
	 */
	REQUEST_LIMIT_EXCEEDED("fns:REQUEST_LIMIT_EXCEEDED"),

  
	/**
	 * Enumeration  : REQUEST_RUNNING_TOO_LONG
	 */
	REQUEST_RUNNING_TOO_LONG("fns:REQUEST_RUNNING_TOO_LONG"),

  
	/**
	 * Enumeration  : SERVER_UNAVAILABLE
	 */
	SERVER_UNAVAILABLE("fns:SERVER_UNAVAILABLE"),

  
	/**
	 * Enumeration  : SERVICE_DESK_NOT_ENABLED
	 */
	SERVICE_DESK_NOT_ENABLED("fns:SERVICE_DESK_NOT_ENABLED"),

  
	/**
	 * Enumeration  : SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION
	 */
	SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION("fns:SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION"),

  
	/**
	 * Enumeration  : SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION
	 */
	SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION("fns:SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION"),

  
	/**
	 * Enumeration  : SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE
	 */
	SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE("fns:SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE"),

  
	/**
	 * Enumeration  : SSO_SERVICE_DOWN
	 */
	SSO_SERVICE_DOWN("fns:SSO_SERVICE_DOWN"),

  
	/**
	 * Enumeration  : SST_ADMIN_FILE_DOWNLOAD_EXCEPTION
	 */
	SST_ADMIN_FILE_DOWNLOAD_EXCEPTION("fns:SST_ADMIN_FILE_DOWNLOAD_EXCEPTION"),

  
	/**
	 * Enumeration  : TOO_MANY_APEX_REQUESTS
	 */
	TOO_MANY_APEX_REQUESTS("fns:TOO_MANY_APEX_REQUESTS"),

  
	/**
	 * Enumeration  : TOO_MANY_RECIPIENTS
	 */
	TOO_MANY_RECIPIENTS("fns:TOO_MANY_RECIPIENTS"),

  
	/**
	 * Enumeration  : TOO_MANY_RECORDS
	 */
	TOO_MANY_RECORDS("fns:TOO_MANY_RECORDS"),

  
	/**
	 * Enumeration  : TRIAL_EXPIRED
	 */
	TRIAL_EXPIRED("fns:TRIAL_EXPIRED"),

  
	/**
	 * Enumeration  : TXN_SECURITY_END_A_SESSION
	 */
	TXN_SECURITY_END_A_SESSION("fns:TXN_SECURITY_END_A_SESSION"),

  
	/**
	 * Enumeration  : TXN_SECURITY_NO_ACCESS
	 */
	TXN_SECURITY_NO_ACCESS("fns:TXN_SECURITY_NO_ACCESS"),

  
	/**
	 * Enumeration  : TXN_SECURITY_TWO_FA_REQUIRED
	 */
	TXN_SECURITY_TWO_FA_REQUIRED("fns:TXN_SECURITY_TWO_FA_REQUIRED"),

  
	/**
	 * Enumeration  : UNABLE_TO_LOCK_ROW
	 */
	UNABLE_TO_LOCK_ROW("fns:UNABLE_TO_LOCK_ROW"),

  
	/**
	 * Enumeration  : UNKNOWN_ATTACHMENT_EXCEPTION
	 */
	UNKNOWN_ATTACHMENT_EXCEPTION("fns:UNKNOWN_ATTACHMENT_EXCEPTION"),

  
	/**
	 * Enumeration  : UNKNOWN_EXCEPTION
	 */
	UNKNOWN_EXCEPTION("fns:UNKNOWN_EXCEPTION"),

  
	/**
	 * Enumeration  : UNKNOWN_ORG_SETTING
	 */
	UNKNOWN_ORG_SETTING("fns:UNKNOWN_ORG_SETTING"),

  
	/**
	 * Enumeration  : UNSUPPORTED_API_VERSION
	 */
	UNSUPPORTED_API_VERSION("fns:UNSUPPORTED_API_VERSION"),

  
	/**
	 * Enumeration  : UNSUPPORTED_ATTACHMENT_ENCODING
	 */
	UNSUPPORTED_ATTACHMENT_ENCODING("fns:UNSUPPORTED_ATTACHMENT_ENCODING"),

  
	/**
	 * Enumeration  : UNSUPPORTED_CLIENT
	 */
	UNSUPPORTED_CLIENT("fns:UNSUPPORTED_CLIENT"),

  
	/**
	 * Enumeration  : UNSUPPORTED_MEDIA_TYPE
	 */
	UNSUPPORTED_MEDIA_TYPE("fns:UNSUPPORTED_MEDIA_TYPE"),

  
	/**
	 * Enumeration  : XML_PARSER_ERROR
	 */
	XML_PARSER_ERROR("fns:XML_PARSER_ERROR"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FaultCode e : EnumSet.allOf(FaultCode.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FaultCode(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
