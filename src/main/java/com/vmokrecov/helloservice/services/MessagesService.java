package com.vmokrecov.helloservice.services;

import com.vmokrecov.helloservice.dto.MessagesDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessagesService {

    Mono<MessagesDTO> getMessage(Long id);
    Flux<MessagesDTO> getAllMessages();
}
