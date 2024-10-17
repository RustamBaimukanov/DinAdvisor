package com.dinadvisor.demoservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<?> getDemoEndpoint(){
        return ResponseEntity.ok("Hello from Demo service");
    }
}
