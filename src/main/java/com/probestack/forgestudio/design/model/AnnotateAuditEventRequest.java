package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnnotateAuditEventRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:30:43.073650521Z[GMT]")public class AnnotateAuditEventRequest {

  private String annotation;

  public AnnotateAuditEventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnnotateAuditEventRequest(String annotation) {
    this.annotation = annotation;
  }

  public AnnotateAuditEventRequest annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * Get annotation
   * @return annotation
  */
  @NotNull @Size(max = 1000)   @Schema(name = "annotation", example = "Reviewed during Q3 audit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateAuditEventRequest annotateAuditEventRequest = (AnnotateAuditEventRequest) o;
    return Objects.equals(this.annotation, annotateAuditEventRequest.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateAuditEventRequest {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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

