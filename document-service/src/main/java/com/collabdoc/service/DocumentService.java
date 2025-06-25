package com.collabdoc.service;

import com.collabdoc.model.Document;
import java.util.List;

public interface DocumentService {
    Document create(Document document);
    Document update(Long id, Document document);
    void delete(Long id);
    Document get(Long id);
    List<Document> getByOwner(String ownerEmail);
}
