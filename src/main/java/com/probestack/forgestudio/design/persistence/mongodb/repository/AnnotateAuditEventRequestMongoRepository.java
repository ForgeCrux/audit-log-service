package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.AnnotateAuditEventRequestDocument;
import java.lang.String;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for AnnotateAuditEventRequest documents.
 */
public interface AnnotateAuditEventRequestMongoRepository extends MongoRepository<AnnotateAuditEventRequestDocument, String> {
}
