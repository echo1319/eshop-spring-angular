package com.eshop.springreactive.repositories;

import com.eshop.springreactive.domain.Item;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ItemRepository extends ReactiveMongoRepository<Item, String> {

    Mono<Item> findByName(String name);

    Flux<Item> findAllByCategory(String category);
}
