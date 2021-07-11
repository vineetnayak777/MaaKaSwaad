package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.adapter.MainRecipeRecyclerAdapter;
import com.example.maakaswaad.model.AllRecipeCategory;
import com.example.maakaswaad.model.RecipeItem;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends BaseActivity{
    RecyclerView mainRecipeRecycler;
    MainRecipeRecyclerAdapter mainRecipeRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_recipe_nested, null, false);
        drawerLayout.addView(view, 0);
        List<RecipeItem> recipeItemList = new ArrayList<>();
        recipeItemList.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));

        List<RecipeItem> recipeItemList1 = new ArrayList<>();
        recipeItemList1.add(new RecipeItem(1, R.drawable.popularfood1, "Paneer Lolipop"));
        recipeItemList1.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList1.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList1.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));
        recipeItemList1.add(new RecipeItem(1, R.drawable.maakakhana1, "Paneer Tikka"));

        List<AllRecipeCategory> allRecipeCategoryList = new ArrayList<>();
        allRecipeCategoryList.add(new AllRecipeCategory("South Indian Dishes Recipes", recipeItemList));
        allRecipeCategoryList.add(new AllRecipeCategory("North Indian Dishes Recipes", recipeItemList1));

        setMainRecipeCategoryRecycler(allRecipeCategoryList);
    }

        private void setMainRecipeCategoryRecycler(List<AllRecipeCategory> allRecipeCategoryList){

            mainRecipeRecycler = findViewById(R.id.main_recycler1);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            mainRecipeRecycler.setLayoutManager(layoutManager);
            mainRecipeRecyclerAdapter = new MainRecipeRecyclerAdapter(this, allRecipeCategoryList);
            mainRecipeRecycler.setAdapter(mainRecipeRecyclerAdapter);

        }

}
