package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.adapter.MothersFoodAdapter;
import com.example.maakaswaad.adapter.PopularFoodAdapter;
import com.example.maakaswaad.adapter.RestaurantFoodAdapter;
import com.example.maakaswaad.model.MothersFood;
import com.example.maakaswaad.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends BaseActivity {
    RecyclerView popularRecycler, restaurantRecycler, mothersFoodRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RestaurantFoodAdapter restaurantFoodAdapter;
    MothersFoodAdapter mothersFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_dashboard, null, false);
        drawerLayout.addView(view, 0);
        List<MothersFood> mothersFoodList = new ArrayList<>();
        //String name, String price, String rating, String foodby, Integer imageUrl, Integer foodbypicUrl
        mothersFoodList.add(new MothersFood("Chicago Pizza", "Rs 180", "4.5","Deepika Padukon", R.drawable.resfood2, R.drawable.profilepic1));
        mothersFoodList.add(new MothersFood("Straberry Cake", "Rs 140", "4.2","Deepika Padukon", R.drawable.resfood1, R.drawable.profilepic1));
        mothersFoodList.add(new MothersFood("Straberry Cake", "Rs 140", "4.2","Deepika Padukon", R.drawable.resfood1, R.drawable.profilepic1));
        setMothersFoodAdapter(mothersFoodList);
    }
    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setMothersFoodAdapter(List<MothersFood> mothersFoodList) {

        mothersFoodRecycler = findViewById(R.id.mother_food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mothersFoodRecycler.setLayoutManager(layoutManager);
        mothersFoodAdapter = new MothersFoodAdapter(this, mothersFoodList);
        mothersFoodRecycler.setAdapter(mothersFoodAdapter);

    }

}