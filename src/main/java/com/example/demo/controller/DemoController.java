package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {

    @GetMapping("/")
    Flux<String> getDemo() {
        return Flux.just("demo");
    }

    @PostMapping("/")
    Mono<String> postDemo(@RequestBody Mono<String> body) {
        return body;
    }
}
