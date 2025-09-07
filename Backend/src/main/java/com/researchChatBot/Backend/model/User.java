package com.researchChatBot.Backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;


import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;


    @Column(unique = true, nullable = false)
    private String email;


    @Column(nullable = false)
    private String passwordHash; // store a hash (later when auth is added)


    @Builder.Default
    private Instant createdAt = Instant.now();
}
