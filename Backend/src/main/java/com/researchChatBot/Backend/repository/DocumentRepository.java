package com.researchChatBot.Backend.repository;

import com.chatbot.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentRepository extends JpaRepository<Document, Long> {
}