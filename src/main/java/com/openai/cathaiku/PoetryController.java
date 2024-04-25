package com.openai.cathaiku;

import org.springframework.ai.client.AiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("ai")
public class PoetryController {

    private final AiClient aiClient;

    public PoetryController(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    @PostMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku(@RequestBody String prompt){
        return ResponseEntity.ok(aiClient.generate(prompt));
    }
}
