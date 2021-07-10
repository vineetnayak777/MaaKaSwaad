package com.example.maakaswaad;

public class FoodDetailJson {
    String food_name, ratings, price, food_type, content;

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Food{"+
                "food_name='"+ food_name + '\''+
                ", ratings='"+ ratings +
                ", price='"+ price +
                ", food_type'" + food_type +
                ", content'" + content +
                '}';
    }
}

