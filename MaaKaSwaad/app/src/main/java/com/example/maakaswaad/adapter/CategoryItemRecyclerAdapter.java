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
import com.example.maakaswaad.model.CategoryItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;
    RecyclerView detailsRecyler;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {

        holder.name.setText(categoryItemList.get(position).getName());
        holder.price.setText(categoryItemList.get(position).getPrice());
        Picasso.get().load(categoryItemList.get(position).getImageUrl()).into(holder.itemImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer url;
                Intent i = new Intent(context, DetailsActivity.class);
                url = categoryItemList.get(position).getImageUrl();
                i.putExtra("name", categoryItemList.get(position).getName());
                i.putExtra("price", categoryItemList.get(position).getPrice());
                i.putExtra("image", url);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView name, price;

        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            itemImage = itemView.findViewById(R.id.item_image);

        }
    }


}