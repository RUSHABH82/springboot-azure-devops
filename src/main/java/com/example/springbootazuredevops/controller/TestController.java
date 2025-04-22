package com.example.springbootazuredevops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Properties;

@RestController
public class TestController {


    @GetMapping("ping")
    ResponseEntity<String> getPing() {
        return new ResponseEntity<>("Pong", HttpStatus.OK);
    }

    @GetMapping("info/env")
    ResponseEntity<Map<String, String>> getSystemInfo() {
        return new ResponseEntity<>(System.getenv(), HttpStatus.OK);
    }

    @GetMapping("info/property")
    ResponseEntity<Properties> getProperty() {
        return new ResponseEntity<>(System.getProperties(), HttpStatus.OK);
    }


}
