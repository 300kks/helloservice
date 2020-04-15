package com.vmokrecov.helloservice.controllers;

import com.vmokrecov.helloservice.services.MessagesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
class HelloControllerTest {

    @MockBean
    private MessagesService service;

    @Autowired
    private WebTestClient client;

    @Test
    @WithMockUser(roles = "USER")
    void home() {
        this.client
                .get()
                .uri("/")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody()
                .jsonPath("$.message").isEqualTo("Home");
    }

    @Test
    @WithMockUser(roles = "USER")
    void hello() {
        this.client
                .get()
                .uri("/hello")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody()
                .jsonPath("$.message").isEqualTo("Hello");
    }
}