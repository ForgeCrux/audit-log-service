package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.AnnotateAuditEventRequestDomainRepository;
import com.probestack.forgestudio.design.model.AnnotateAuditEventRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.AnnotateAuditEventRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.AnnotateAuditEventRequestMongoRepository;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AnnotateAuditEventRequestMongoPersistenceAdapter implements AnnotateAuditEventRequestDomainRepository {
    private final AnnotateAuditEventRequestMongoRepository repository;

    public AnnotateAuditEventRequestMongoPersistenceAdapter(
            AnnotateAuditEventRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnnotateAuditEventRequest save(AnnotateAuditEventRequest annotateAuditEventRequest) {
        AnnotateAuditEventRequestDocument document = toDocument(annotateAuditEventRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<AnnotateAuditEventRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<AnnotateAuditEventRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private AnnotateAuditEventRequestDocument toDocument(
            AnnotateAuditEventRequest annotateAuditEventRequest) {
        AnnotateAuditEventRequestDocument document = new AnnotateAuditEventRequestDocument();
        BeanUtils.copyProperties(annotateAuditEventRequest, document);
        return document;
    }

    private AnnotateAuditEventRequest toDomain(AnnotateAuditEventRequestDocument document) {
        AnnotateAuditEventRequest domain = new AnnotateAuditEventRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
