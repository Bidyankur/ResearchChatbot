package com.researchChatBot.Backend.controller;

import com.researchchatbot.model.Document;
import com.researchchatbot.model.ChatHistory;
import com.researchchatbot.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {


    private final ChatService chatService;


    @PostMapping
    public ResponseEntity<Map<String, Object>> ask(@RequestParam String query,
                                                   @RequestParam(required = false) String documentId,
                                                   @RequestParam(required = false) String userId) {
        ChatService.Answer answer = chatService.answer(query, documentId, userId);
        return ResponseEntity.ok(Map.of(
                "answer", answer.text(),
                "sources", answer.sources(),
                "chunks", answer.chunks()
        ));
    }


    @GetMapping("/history")
    public ResponseEntity<List<ChatHistory>> history(@RequestParam String userId) {
        return ResponseEntity.ok(chatService.history(userId));
    }
}
