package com.example.maakaswaad.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.R;
import com.example.maakaswaad.model.AllRecipeCategory;
import com.example.maakaswaad.model.RecipeItem;

import java.util.List;

public class MainRecipeRecyclerAdapter extends RecyclerView.Adapter<MainRecipeRecyclerAdapter.MainRecipeViewHolder> {

    private Context context;
    private List<AllRecipeCategory> allRecipeCategoryList;

    public MainRecipeRecyclerAdapter(Context context, List<AllRecipeCategory> allRecipeCotegoryList){
        this.context = context;
        this.allRecipeCategoryList = allRecipeCotegoryList;
    }

    @NonNull
    @Override
    public  MainRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new MainRecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.recipe_main_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecipeViewHolder holder, int position){
        holder.recipeTitle.setText(allRecipeCategoryList.get(position).getRecipeTitle());
        setRecItemRecycler(holder.itemRecycler, allRecipeCategoryList.get(position).getRecipeItemList());
    }

    @Override
    public int getItemCount(){
        return allRecipeCategoryList.size();
    }

    public static final class MainRecipeViewHolder extends RecyclerView.ViewHolder{
        TextView recipeTitle;
        RecyclerView itemRecycler;

        public  MainRecipeViewHolder(@NonNull View itemView){
            super(itemView);

            recipeTitle = itemView.findViewById(R.id.cat_title_rec);
            itemRecycler = itemView.findViewById(R.id.item_recycler_rec);
        }
    }

    private void setRecItemRecycler(RecyclerView recyclerView, List<RecipeItem> recipeItemList){
        RecipeItemRecyclerAdapter recipeItemRecyclerAdapter = new RecipeItemRecyclerAdapter(context, recipeItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(recipeItemRecyclerAdapter);
    }
}
