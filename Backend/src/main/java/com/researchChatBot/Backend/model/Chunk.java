package com.researchChatBot.Backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;


import java.util.UUID;


@Entity
@Table(name = "chunks")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Chunk {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;


    @ManyToOne(fetch = FetchType.LAZY)
    private Document document;


    @Column(columnDefinition = "TEXT", nullable = false)
    private String chunkText;


    private Integer orderIndex;
}