package com.homs.demo.model;

public class inventory {
    private String name;
    private String description;
    private String price;
    private String picture;
    private String type;
    
    public inventory(String name, String description, String price, String picture, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.picture = picture;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getPrice() {
        return price;
    }
    public String getPicture() {
        return picture;
    }
    public String getType() {
        return type;
    }
}
