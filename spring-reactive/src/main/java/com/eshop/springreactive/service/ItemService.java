package com.eshop.springreactive.service;

import com.eshop.springreactive.domain.Item;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemService {
    Mono<Item> getItemById(String id);

    Mono<Item> getItemByName(String name);

    Flux<Item> getItemsByCategory(String category);

    Flux<Item> getItems();
}
