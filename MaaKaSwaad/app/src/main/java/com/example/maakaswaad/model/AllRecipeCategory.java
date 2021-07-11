package com.example.maakaswaad.model;

import java.util.List;

public class AllRecipeCategory {

    String recipeTitle;
    List<RecipeItem> recipeItemList;

    public AllRecipeCategory(String recipeTitle, List<RecipeItem> recipeItemList) {
        this.recipeTitle = recipeTitle;
        this.recipeItemList = recipeItemList;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public List<RecipeItem> getRecipeItemList() {
        return recipeItemList;
    }

    public void setRecipeItemList(List<RecipeItem> recipeItemList) {
        this.recipeItemList = recipeItemList;
    }
}
