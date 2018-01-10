package com.eshop.springreactive.service;

import com.eshop.springreactive.domain.Item;
import com.eshop.springreactive.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Mono<Item> getItemById(String id) {
        return itemRepository.findById(id);
    }

    @Override
    public Mono<Item> getItemByName(String name) {
        return itemRepository.findByName(name);
    }


    @Override
    public Flux<Item> getItemsByCategory(String category) {
        return itemRepository.findAllByCategory(category);
    }


    @Override
    public Flux<Item> getItems() {
        return itemRepository.findAll();
    }

}
