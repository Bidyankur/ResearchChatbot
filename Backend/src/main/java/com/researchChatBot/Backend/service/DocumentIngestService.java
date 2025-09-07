package com.researchChatBot.Backend.service;

import com.chatbot.model.Document;
import com.chatbot.repository.DocumentRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class DocumentIngestService {


    private final DocumentRepository docRepo;


    public DocumentService(DocumentRepository docRepo) {
        this.docRepo = docRepo;
    }


    public Document save(Document doc) {
        return docRepo.save(doc);
    }


    public List<Document> findAll() {
        return docRepo.findAll();
    }
}