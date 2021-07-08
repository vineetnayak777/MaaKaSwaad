package com.example.maakaswaad.model;

public class MothersFood {
    String name,price;
    Integer imageUrl, foodbypicUrl;
    String rating;
    String foodby;

    public MothersFood(String name, String price, Integer imageUrl, String rating, String foodby, int foodbypicUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.foodby = foodby;
        this.foodbypicUrl = foodbypicUrl;

    }
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFood_by() {
        return foodby;
    }

    public void setFoodby(String foodby) {
        this.foodby = foodby;
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

    public Integer getFoodbypicUrl() {
        return foodbypicUrl;
    }

    public void setFoodbypicUrl(Integer foodbypicUrl) {
        this.foodbypicUrl = foodbypicUrl;
    }
}
