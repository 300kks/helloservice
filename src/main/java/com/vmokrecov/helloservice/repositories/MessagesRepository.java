package com.vmokrecov.helloservice.repositories;

import com.vmokrecov.helloservice.domain.Messages;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends ReactiveCrudRepository<Messages, Long> {

}
