package com.eshop.springreactive.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class Item {

    private String category;
    private String description;
    @NonNull
    private String name;
    private long cost;
    private String image;
    private int id;

}
