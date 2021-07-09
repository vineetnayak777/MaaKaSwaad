package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.adapter.MothersFoodAdapter;
import com.example.maakaswaad.adapter.PopularFoodAdapter;
import com.example.maakaswaad.adapter.RestaurantFoodAdapter;
import com.example.maakaswaad.model.PopularFood;
import com.example.maakaswaad.model.RestaurantFood;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends BaseActivity {
    RecyclerView popularRecycler, restaurantRecycler, mothersFoodRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RestaurantFoodAdapter restaurantFoodAdapter;
    MothersFoodAdapter mothersFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_restaurant, null, false);
        drawerLayout.addView(view, 0);
        getIncomingIntent();
        //String name, String price, String rating, String foodby, Integer imageUrl, Integer foodbypicUrl

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Paneer Tikka","Rs. 120", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Paneer Lolipop","Rs. 140", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Kaju Masala","Rs. 160", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam","Rs. 120", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Paneer Lolipop","Rs. 140", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Kaju Masala","Rs. 160", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<RestaurantFood> restaurantFoodList = new ArrayList<>();
        restaurantFoodList.add(new RestaurantFood("Chicago Pizza", "$20", R.drawable.resfood1, "4.5", "Briand Restaurant"));
        restaurantFoodList.add(new RestaurantFood("Straberry Cake", "$25", R.drawable.resfood2, "4.2", "Friends Restaurant"));

        setRestaurantRecycler(restaurantFoodList);
        getIncomingIntent2();
    }
    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setRestaurantRecycler(List<RestaurantFood> restaurantFoodList) {

        restaurantRecycler = findViewById(R.id.restaurant_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        restaurantRecycler.setLayoutManager(layoutManager);
        restaurantFoodAdapter = new RestaurantFoodAdapter(this, restaurantFoodList);
        restaurantRecycler.setAdapter(restaurantFoodAdapter);

    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("name") && getIntent().hasExtra("price"))
        {
            Integer image_url = getIntent().getIntExtra("image", 0);
            String name = getIntent().getStringExtra("name");
            String price = getIntent().getStringExtra("price");
            setImage(image_url, name, price);
        }
    }
    private void setImage(Integer image_url, String name, String price){
        TextView name1 = findViewById(R.id.food_name_det);
        TextView price1 = findViewById(R.id.price_det);
        ImageView imageView = findViewById(R.id.food_image_det);
        name1.setText(name);
        price1.setText(price);
        Picasso.get().load(image_url).into(imageView);


    }
    private void getIncomingIntent2(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("name") && getIntent().hasExtra("price") && getIntent().hasExtra("rating"))
        {
            Integer image_url = getIntent().getIntExtra("image", 0);
            String name = getIntent().getStringExtra("name");
            String price = getIntent().getStringExtra("price");
            String rating = getIntent().getStringExtra("rating");
            setImage2(image_url, name, price, rating);
        }
    }
    private void setImage2(Integer image_url, String name, String price, String rating){
        TextView name1 = findViewById(R.id.food_name_det);
        TextView price1 = findViewById(R.id.price_det);
        ImageView imageView = findViewById(R.id.food_image_det);
        TextView rating1 = findViewById(R.id.rating_det);
        name1.setText(name);
        price1.setText(price);
        rating1.setText(rating);
        Picasso.get().load(image_url).into(imageView);


    }



}
