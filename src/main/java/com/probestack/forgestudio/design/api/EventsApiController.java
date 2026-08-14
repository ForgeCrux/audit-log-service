package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AnnotateAuditEventRequest;
import com.probestack.forgestudio.design.model.AuditEvent;
import com.probestack.forgestudio.design.model.AuditEventListResponse;
import com.probestack.forgestudio.design.model.CreateAuditEventRequest;
import java.time.OffsetDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.EventsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:29:28.385377570Z[GMT]")
@Controller
@RequestMapping("${openapi.auditLogService.base-path:/v1}")
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final EventsService eventsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public EventsApiController(EventsService eventsService, GeneratedRequestValidator generatedRequestValidator) {
        this.eventsService = eventsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<AuditEvent> annotateAuditEvent(@PathVariable() String eventId, @RequestBody() AnnotateAuditEventRequest annotateAuditEventRequest) {
        log.info("Processing annotateAuditEvent request");
        try {
            generatedRequestValidator.validate("annotateAuditEvent", annotateAuditEventRequest);
            var response = eventsService.annotateAuditEvent(eventId, annotateAuditEventRequest);
            log.info("annotateAuditEvent completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process annotateAuditEvent: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AuditEvent> createAuditEvent(@RequestBody() CreateAuditEventRequest createAuditEventRequest) {
        log.info("Processing createAuditEvent request");
        try {
            generatedRequestValidator.validate("createAuditEvent", createAuditEventRequest);
            var response = eventsService.createAuditEvent(createAuditEventRequest);
            log.info("createAuditEvent completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createAuditEvent: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AuditEvent> getAuditEventById(@PathVariable() String eventId) {
        log.info("Processing getAuditEventById request");
        try {
            var response = eventsService.getAuditEventById(eventId);
            log.info("getAuditEventById completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getAuditEventById: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AuditEventListResponse> listAuditEvents(@RequestParam() String actorEmail, @RequestParam() String action, @RequestParam() String resourceType, @RequestParam() OffsetDateTime fromDate, @RequestParam() OffsetDateTime toDate, @RequestParam() Integer page, @RequestParam() Integer size) {
        log.info("Processing listAuditEvents request");
        try {
            var response = eventsService.listAuditEvents(actorEmail, action, resourceType, fromDate, toDate, page, size);
            log.info("listAuditEvents completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listAuditEvents: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> purgeAuditEvent(@PathVariable() String eventId) {
        log.info("Processing purgeAuditEvent request");
        try {
            var response = eventsService.purgeAuditEvent(eventId);
            log.info("purgeAuditEvent completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process purgeAuditEvent: {}", e.getMessage(), e);
            throw e;
        }
    }
}
