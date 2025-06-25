package com.collabdoc.service.impl;

import com.collabdoc.model.Document;
import com.collabdoc.repository.DocumentRepository;
import com.collabdoc.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository repo;

    public Document create(Document document) {
        document.setCreatedAt(LocalDateTime.now());
        document.setUpdatedAt(LocalDateTime.now());
        return repo.save(document);
    }

    public Document update(Long id, Document doc) {
        Document existing = repo.findById(id).orElseThrow();
        existing.setTitle(doc.getTitle());
        existing.setContent(doc.getContent());
        existing.setUpdatedAt(LocalDateTime.now());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Document get(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<Document> getByOwner(String ownerEmail) {
        return repo.findByOwnerEmail(ownerEmail);
    }
}
// This code implements the DocumentService interface, providing methods to create, update, delete, and retrieve documents.
// It uses the DocumentRepository to interact with the database and manages document timestamps for creation and updates