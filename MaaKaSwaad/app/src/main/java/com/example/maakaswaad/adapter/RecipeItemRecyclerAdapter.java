package com.example.maakaswaad.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.R;
import com.example.maakaswaad.RecipeDetails;
import com.example.maakaswaad.model.RecipeItem;

import java.util.List;

public class RecipeItemRecyclerAdapter extends RecyclerView.Adapter<RecipeItemRecyclerAdapter.RecipeItemViewHolder> {

    private Context context;
    private List<RecipeItem> recipeItemList;

    public RecipeItemRecyclerAdapter(Context context, List<RecipeItem> recipeItemList){
        this.context = context;
        this.recipeItemList = recipeItemList;
    }

    @NonNull
    @Override
    public RecipeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new RecipeItemViewHolder(LayoutInflater.from(context).inflate(R.layout.recipe_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeItemViewHolder holder, int position){
        holder.itemImage.setImageResource(recipeItemList.get(position).getImageUrl());
        holder.name.setText(recipeItemList.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, RecipeDetails.class);
                i.putExtra("name", recipeItemList.get(position).getName());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return recipeItemList.size();
    }

    public static final class RecipeItemViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView name;

        public RecipeItemViewHolder(@NonNull View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.name_rec);
            itemImage = itemView.findViewById(R.id.item_image_rec);
        }
    }
}
