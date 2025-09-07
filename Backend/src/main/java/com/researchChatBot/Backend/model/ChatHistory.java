package com.researchChatBot.Backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;


import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name = "chat_history")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ChatHistory {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    @ManyToOne(fetch = FetchType.LAZY)
    private Document document; // nullable


    @Column(columnDefinition = "TEXT")
    private String query;


    @Column(columnDefinition = "TEXT")
    private String response;


    @Builder.Default
    private Instant createdAt = Instant.now();
}