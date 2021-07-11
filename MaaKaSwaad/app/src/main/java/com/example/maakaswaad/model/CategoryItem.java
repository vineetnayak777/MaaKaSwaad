package com.example.maakaswaad.model;

public class CategoryItem {

// here i am taking only image url. and this is as integer because i am using it from drawable file.

    Integer itemId;
    Integer imageUrl;
    String name, price;

    public CategoryItem(Integer itemId,String name, String price, Integer imageUrl) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
    }
    public CategoryItem(Integer itemId,String name, Integer imageUrl) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
