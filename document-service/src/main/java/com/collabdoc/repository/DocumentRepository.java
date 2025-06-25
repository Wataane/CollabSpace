package com.collabdoc.repository;

import com.collabdoc.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByOwnerEmail(String ownerEmail);
}
