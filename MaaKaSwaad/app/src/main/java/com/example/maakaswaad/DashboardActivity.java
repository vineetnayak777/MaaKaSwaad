package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.adapter.MothersFoodAdapter;
import com.example.maakaswaad.adapter.PopularFoodAdapter;
import com.example.maakaswaad.adapter.RestaurantFoodAdapter;
import com.example.maakaswaad.model.PopularFood;
import com.example.maakaswaad.model.RestaurantFood;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends BaseActivity {
    RecyclerView popularRecycler, restaurantRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RestaurantFoodAdapter restaurantFoodAdapter;
    MothersFoodAdapter mothersFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_dashboard, null, false);
        drawerLayout.addView(view, 0);

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

}