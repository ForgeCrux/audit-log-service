package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.AnnotateAuditEventRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for AnnotateAuditEventRequest domain operations.
 */
public interface AnnotateAuditEventRequestDomainRepository {
    AnnotateAuditEventRequest save(AnnotateAuditEventRequest annotateAuditEventRequest);

    Optional<AnnotateAuditEventRequest> findById(String id);

    List<AnnotateAuditEventRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
