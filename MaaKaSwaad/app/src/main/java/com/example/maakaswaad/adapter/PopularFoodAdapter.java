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

import com.example.maakaswaad.DetailsActivity;
import com.example.maakaswaad.R;
import com.example.maakaswaad.model.PopularFood;

import java.util.List;

public class PopularFoodAdapter extends RecyclerView.Adapter<PopularFoodAdapter.PopularFoodViewHolder> {

    Context context;
    List<PopularFood> popularFoodlist;

    public PopularFoodAdapter(Context context, List<PopularFood> popularFoodlist) {
        this.context = context;
        this.popularFoodlist = popularFoodlist;
    }

    @NonNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_food_row, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodAdapter.PopularFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(popularFoodlist.get(position).getImageUrl());
        holder.name.setText(popularFoodlist.get(position).getName());
        holder.price.setText(popularFoodlist.get(position).getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer url;
                Intent i = new Intent(context, DetailsActivity.class);
                url = popularFoodlist.get(position).getImageUrl();
                i.putExtra("name", popularFoodlist.get(position).getName());
                i.putExtra("price", popularFoodlist.get(position).getPrice());
                i.putExtra("image", url);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return popularFoodlist.size();
    }

    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;
        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image_rec);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name_rec);
        }
    }
}
