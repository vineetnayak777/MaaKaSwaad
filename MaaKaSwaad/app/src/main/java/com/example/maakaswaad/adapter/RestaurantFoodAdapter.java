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
import com.example.maakaswaad.model.RestaurantFood;

import java.util.List;

public class RestaurantFoodAdapter extends RecyclerView.Adapter<RestaurantFoodAdapter.RestaurantFoodViewHolder> {

    Context context;
    List<RestaurantFood> restaurantFoodList;

    public RestaurantFoodAdapter(Context context, List<RestaurantFood> restaurantFoodList) {
        this.context = context;
        this.restaurantFoodList = restaurantFoodList;
    }

    @NonNull
    @Override
    public RestaurantFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_food_row, parent, false);
        return new RestaurantFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RestaurantFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(restaurantFoodList.get(position).getImageUrl());
        holder.name.setText(restaurantFoodList.get(position).getName());
        holder.price.setText(restaurantFoodList.get(position).getPrice());
        holder.rating.setText(restaurantFoodList.get(position).getRating());
        holder.restaurantName.setText(restaurantFoodList.get(position).getRestaurantname());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer url;
                Intent i = new Intent(context, DetailsActivity.class);
                url = restaurantFoodList.get(position).getImageUrl();
                i.putExtra("name", restaurantFoodList.get(position).getName());
                i.putExtra("price", restaurantFoodList.get(position).getPrice());
                i.putExtra("image", url);
                i.putExtra("rating",restaurantFoodList.get(position).getRating());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurantFoodList.size();
    }


    public static final class RestaurantFoodViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage;
        TextView price, name, rating, restaurantName;

        public RestaurantFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image_rec);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name_rec);
            rating = itemView.findViewById(R.id.rating);
            restaurantName = itemView.findViewById(R.id.restaurant_name);



        }
    }

}
