package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateAuditEventRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:30:43.073650521Z[GMT]")public class CreateAuditEventRequest {

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    CREATE("CREATE"),
    
    READ("READ"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE"),
    
    LOGIN("LOGIN"),
    
    LOGOUT("LOGOUT"),
    
    EXPORT("EXPORT");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActionEnum action;

  private String resourceType;

  private String resourceId;

  private String actorEmail;

  private String actorRole;

  private String ipAddress;

  @Valid
  private Map<String, Object> beforeValue = new HashMap<>();

  @Valid
  private Map<String, Object> afterValue = new HashMap<>();

  public CreateAuditEventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAuditEventRequest(ActionEnum action, String resourceType, String actorEmail) {
    this.action = action;
    this.resourceType = resourceType;
    this.actorEmail = actorEmail;
  }

  public CreateAuditEventRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @NotNull   @Schema(name = "action", example = "UPDATE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public CreateAuditEventRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @NotNull   @Schema(name = "resourceType", example = "Invoice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public CreateAuditEventRequest resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
    @Schema(name = "resourceId", example = "INV-2026-00317", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public CreateAuditEventRequest actorEmail(String actorEmail) {
    this.actorEmail = actorEmail;
    return this;
  }

  /**
   * Get actorEmail
   * @return actorEmail
  */
  @NotNull @jakarta.validation.constraints.Email   @Schema(name = "actorEmail", example = "finance.admin@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actorEmail")
  public String getActorEmail() {
    return actorEmail;
  }

  public void setActorEmail(String actorEmail) {
    this.actorEmail = actorEmail;
  }

  public CreateAuditEventRequest actorRole(String actorRole) {
    this.actorRole = actorRole;
    return this;
  }

  /**
   * Get actorRole
   * @return actorRole
  */
    @Schema(name = "actorRole", example = "ORG_ADMIN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actorRole")
  public String getActorRole() {
    return actorRole;
  }

  public void setActorRole(String actorRole) {
    this.actorRole = actorRole;
  }

  public CreateAuditEventRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
  */
    @Schema(name = "ipAddress", example = "203.0.113.42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CreateAuditEventRequest beforeValue(Map<String, Object> beforeValue) {
    this.beforeValue = beforeValue;
    return this;
  }

  public CreateAuditEventRequest putBeforeValueItem(String key, Object beforeValueItem) {
    if (this.beforeValue == null) {
      this.beforeValue = new HashMap<>();
    }
    this.beforeValue.put(key, beforeValueItem);
    return this;
  }

  /**
   * Get beforeValue
   * @return beforeValue
  */
    @Schema(name = "beforeValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beforeValue")
  public Map<String, Object> getBeforeValue() {
    return beforeValue;
  }

  public void setBeforeValue(Map<String, Object> beforeValue) {
    this.beforeValue = beforeValue;
  }

  public CreateAuditEventRequest afterValue(Map<String, Object> afterValue) {
    this.afterValue = afterValue;
    return this;
  }

  public CreateAuditEventRequest putAfterValueItem(String key, Object afterValueItem) {
    if (this.afterValue == null) {
      this.afterValue = new HashMap<>();
    }
    this.afterValue.put(key, afterValueItem);
    return this;
  }

  /**
   * Get afterValue
   * @return afterValue
  */
    @Schema(name = "afterValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("afterValue")
  public Map<String, Object> getAfterValue() {
    return afterValue;
  }

  public void setAfterValue(Map<String, Object> afterValue) {
    this.afterValue = afterValue;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuditEventRequest createAuditEventRequest = (CreateAuditEventRequest) o;
    return Objects.equals(this.action, createAuditEventRequest.action) &&
        Objects.equals(this.resourceType, createAuditEventRequest.resourceType) &&
        Objects.equals(this.resourceId, createAuditEventRequest.resourceId) &&
        Objects.equals(this.actorEmail, createAuditEventRequest.actorEmail) &&
        Objects.equals(this.actorRole, createAuditEventRequest.actorRole) &&
        Objects.equals(this.ipAddress, createAuditEventRequest.ipAddress) &&
        Objects.equals(this.beforeValue, createAuditEventRequest.beforeValue) &&
        Objects.equals(this.afterValue, createAuditEventRequest.afterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, resourceType, resourceId, actorEmail, actorRole, ipAddress, beforeValue, afterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuditEventRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    actorEmail: ").append(toIndentedString(actorEmail)).append("\n");
    sb.append("    actorRole: ").append(toIndentedString(actorRole)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    beforeValue: ").append(toIndentedString(beforeValue)).append("\n");
    sb.append("    afterValue: ").append(toIndentedString(afterValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

