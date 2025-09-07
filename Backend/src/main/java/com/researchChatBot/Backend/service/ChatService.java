package com.researchChatBot.Backend.service;

import com.chatbot.model.ChatMessage;
import com.chatbot.model.User;
import com.chatbot.repository.ChatMessageRepository;
import org.springframework.stereotype.Service;


@Service
public class ChatService {


    private final ChatMessageRepository chatRepo;


    public ChatService(ChatMessageRepository chatRepo) {
        this.chatRepo = chatRepo;
    }


    public ChatMessage askQuestion(String question, User user) {
// TODO: Integrate AI later. For now, return mock answer.
        String mockAnswer = "This is a placeholder answer for: " + question;


        ChatMessage chat = new ChatMessage(question, mockAnswer, user);
        return chatRepo.save(chat);
    }
}
