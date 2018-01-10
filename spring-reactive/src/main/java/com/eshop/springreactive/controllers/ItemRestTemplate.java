package com.eshop.springreactive.controllers;

import com.eshop.springreactive.domain.Item;
import com.eshop.springreactive.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ItemRestTemplate {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items/{id}")
    Mono<Item> getItemById(@PathVariable(name = "id") String id) {
        return itemService.getItemById(id);
    }

    @GetMapping("/items/name/{name}")
    Mono<Item> getItemByName(@PathVariable(name = "name") String name) {
        return itemService.getItemByName(name);
    }

    @GetMapping("/items/category/{category}")
    Flux<Item> getItemsByCategory(String category) {
        return itemService.getItemsByCategory(category);
    }

    @GetMapping("/items")
    Flux<Item> getItems() {
        return itemService.getItems();
    }

}
