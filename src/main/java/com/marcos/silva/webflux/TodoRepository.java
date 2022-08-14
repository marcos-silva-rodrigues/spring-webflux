package com.marcos.silva.webflux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends ReactiveCrudRepository<Todo, Long> {
}
