package com.researchChatBot.Backend.controller;

import com.researchchatbot.model.Document;
import com.researchchatbot.service.DocumentIngestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.Map;


@RestController
@RequestMapping("/api/upload")
@RequiredArgsConstructor
public class UploadController {


    private final DocumentIngestService ingestService;


    @PostMapping
    public ResponseEntity<Map<String, Object>> upload(@RequestParam("file") MultipartFile file,
                                                      @RequestParam(value = "userId", required = false) String userId) throws Exception {
        Document doc = ingestService.ingest(file, userId);
        return ResponseEntity.ok(Map.of(
                "documentId", doc.getId(),
                "title", doc.getTitle(),
                "message", "File uploaded and ingested successfully"
        ));
    }
}
