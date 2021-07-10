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
import com.example.maakaswaad.model.MothersFood;

import java.util.List;

public class MothersFoodAdapter extends RecyclerView.Adapter<MothersFoodAdapter.MothersFoodViewHolder> {

    Context context;
        List<MothersFood> MothersFoodList;

    public MothersFoodAdapter(Context context, List<MothersFood> MothersFoodList) {
        this.context = context;
        this.MothersFoodList = MothersFoodList;
    }

    @NonNull
    @Override
    public MothersFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.maa_ka_khana_row, parent, false);
        return new MothersFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MothersFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(MothersFoodList.get(position).getImageUrl());
        holder.name.setText(MothersFoodList.get(position).getName());
        holder.price.setText(MothersFoodList.get(position).getPrice());
        holder.rating.setText(MothersFoodList.get(position).getRating());
        holder.foodby.setText(MothersFoodList.get(position).getFood_by());
        holder.foodbyImage.setImageResource(MothersFoodList.get(position).getFoodbypicUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer url;
                Intent i = new Intent(context, DetailsActivity.class);
                url = MothersFoodList.get(position).getImageUrl();
                i.putExtra("name", MothersFoodList.get(position).getName());
                i.putExtra("price", MothersFoodList.get(position).getPrice());
                i.putExtra("image", url);
                i.putExtra("rating",MothersFoodList.get(position).getRating());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return MothersFoodList.size();
    }


    public static final class MothersFoodViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage, foodbyImage;
        TextView price, name, rating, foodby;

        public MothersFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image_rec);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name_rec);
            rating = itemView.findViewById(R.id.rating);
            foodby = itemView.findViewById(R.id.foodby);
            foodbyImage = itemView.findViewById(R.id.foodby_pic);



        }
    }

}
