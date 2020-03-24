package com.vmokrecov.helloservice.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/")
    public Mono<String> home() {
        return Mono.just("{ \"message\": \"Home\" }");
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Mono<String> getHello() {
        return Mono.just("{ \"message\": \"Hello\" }");
    }

    @PostMapping("/hello")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Mono<String> postHello() {
        return Mono.just("{ \"message\": \"Hello Post\" }");
    }
}
