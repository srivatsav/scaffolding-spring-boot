package com.project.name.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DumbController {

    @GetMapping
    private String sendDumbMessage(@RequestParam String name) {
        return "Hello " + name +"!";
    }
}
