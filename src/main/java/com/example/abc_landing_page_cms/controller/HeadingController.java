package com.example.abc_landing_page_cms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.abc_landing_page_cms.service.HeadingService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HeadingController {
	@Autowired
    private HeadingService service;

    @GetMapping("/heading")
    public Map<String, String> getHeading() {
        return Map.of("heading", service.getLatestHeading());
    }

    @PostMapping("/heading")
    public ResponseEntity<?> saveHeading(@RequestBody Map<String, String> body) {
        service.saveHeading(body.get("heading"));
        return ResponseEntity.ok().build();
    }

}
