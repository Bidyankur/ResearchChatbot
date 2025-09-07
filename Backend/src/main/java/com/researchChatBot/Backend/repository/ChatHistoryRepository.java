package com.researchChatBot.Backend.repository;

import com.chatbot.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatHistoryRepository extends JpaRepository<ChatMessage, Long> {
}