package com.vmokrecov.helloservice.controllers;

import com.vmokrecov.helloservice.dto.MessagesDTO;
import com.vmokrecov.helloservice.services.MessagesService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class HelloController {

    private final MessagesService service;

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

    @GetMapping("/hello/message/{id}")
    public Mono<MessagesDTO> getMessageById(@PathVariable Long id) {
        return service.getMessage(id);
    }

    @GetMapping("/hello/messages")
    public Flux<MessagesDTO> getAllMessages() {
        return service.getAllMessages();
    }
}
