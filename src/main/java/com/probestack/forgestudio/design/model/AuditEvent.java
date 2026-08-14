package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuditEvent
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:29:28.385377570Z[GMT]")public class AuditEvent {

  private String eventId;

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

  private String annotation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredAt;

  public AuditEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuditEvent(String eventId, ActionEnum action, String resourceType, OffsetDateTime occurredAt) {
    this.eventId = eventId;
    this.action = action;
    this.resourceType = resourceType;
    this.occurredAt = occurredAt;
  }

  public AuditEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Unique audit event ID (UUID)
   * @return eventId
  */
  @NotNull   @Schema(name = "eventId", example = "a1u2d3t4", description = "Unique audit event ID (UUID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public AuditEvent action(ActionEnum action) {
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

  public AuditEvent resourceType(String resourceType) {
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

  public AuditEvent resourceId(String resourceId) {
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

  public AuditEvent actorEmail(String actorEmail) {
    this.actorEmail = actorEmail;
    return this;
  }

  /**
   * Get actorEmail
   * @return actorEmail
  */
  @jakarta.validation.constraints.Email   @Schema(name = "actorEmail", example = "finance.admin@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actorEmail")
  public String getActorEmail() {
    return actorEmail;
  }

  public void setActorEmail(String actorEmail) {
    this.actorEmail = actorEmail;
  }

  public AuditEvent actorRole(String actorRole) {
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

  public AuditEvent ipAddress(String ipAddress) {
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

  public AuditEvent beforeValue(Map<String, Object> beforeValue) {
    this.beforeValue = beforeValue;
    return this;
  }

  public AuditEvent putBeforeValueItem(String key, Object beforeValueItem) {
    if (this.beforeValue == null) {
      this.beforeValue = new HashMap<>();
    }
    this.beforeValue.put(key, beforeValueItem);
    return this;
  }

  /**
   * Snapshot of the resource before the change
   * @return beforeValue
  */
    @Schema(name = "beforeValue", description = "Snapshot of the resource before the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beforeValue")
  public Map<String, Object> getBeforeValue() {
    return beforeValue;
  }

  public void setBeforeValue(Map<String, Object> beforeValue) {
    this.beforeValue = beforeValue;
  }

  public AuditEvent afterValue(Map<String, Object> afterValue) {
    this.afterValue = afterValue;
    return this;
  }

  public AuditEvent putAfterValueItem(String key, Object afterValueItem) {
    if (this.afterValue == null) {
      this.afterValue = new HashMap<>();
    }
    this.afterValue.put(key, afterValueItem);
    return this;
  }

  /**
   * Snapshot of the resource after the change
   * @return afterValue
  */
    @Schema(name = "afterValue", description = "Snapshot of the resource after the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("afterValue")
  public Map<String, Object> getAfterValue() {
    return afterValue;
  }

  public void setAfterValue(Map<String, Object> afterValue) {
    this.afterValue = afterValue;
  }

  public AuditEvent annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * Get annotation
   * @return annotation
  */
    @Schema(name = "annotation", example = "Reviewed during Q3 audit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  public AuditEvent occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
  */
  @NotNull @Valid   @Schema(name = "occurredAt", example = "2026-08-12T10:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("occurredAt")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEvent auditEvent = (AuditEvent) o;
    return Objects.equals(this.eventId, auditEvent.eventId) &&
        Objects.equals(this.action, auditEvent.action) &&
        Objects.equals(this.resourceType, auditEvent.resourceType) &&
        Objects.equals(this.resourceId, auditEvent.resourceId) &&
        Objects.equals(this.actorEmail, auditEvent.actorEmail) &&
        Objects.equals(this.actorRole, auditEvent.actorRole) &&
        Objects.equals(this.ipAddress, auditEvent.ipAddress) &&
        Objects.equals(this.beforeValue, auditEvent.beforeValue) &&
        Objects.equals(this.afterValue, auditEvent.afterValue) &&
        Objects.equals(this.annotation, auditEvent.annotation) &&
        Objects.equals(this.occurredAt, auditEvent.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, action, resourceType, resourceId, actorEmail, actorRole, ipAddress, beforeValue, afterValue, annotation, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEvent {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    actorEmail: ").append(toIndentedString(actorEmail)).append("\n");
    sb.append("    actorRole: ").append(toIndentedString(actorRole)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    beforeValue: ").append(toIndentedString(beforeValue)).append("\n");
    sb.append("    afterValue: ").append(toIndentedString(afterValue)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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

