package com.eshop.springreactive.domain;

public class Item {

    private String category;
    private String description;
    private String name;
    private long cost;
    private String image;
    private int id;

    public Item() {
    }

    public Item(String category, String description, String name, long cost, String image, int id) {
        this.category = category;
        this.description = description;
        this.name = name;
        this.cost = cost;
        this.image = image;
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
