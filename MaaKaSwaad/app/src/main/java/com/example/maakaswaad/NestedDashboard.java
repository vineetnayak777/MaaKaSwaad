package com.example.maakaswaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maakaswaad.adapter.MainRecyclerAdapter;
import com.example.maakaswaad.adapter.MothersFoodAdapter;
import com.example.maakaswaad.adapter.PopularFoodAdapter;
import com.example.maakaswaad.adapter.RestaurantFoodAdapter;
import com.example.maakaswaad.adapter.SliderAdapter;
import com.example.maakaswaad.model.AllCategory;
import com.example.maakaswaad.model.CategoryItem;
import com.example.maakaswaad.model.SliderData;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class NestedDashboard extends BaseActivity {
    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView popularRecycler, restaurantRecycler, mothersfoodRecycler;
    PopularFoodAdapter popularFoodAdapter;
    RestaurantFoodAdapter restaurantFoodAdapter;
    MothersFoodAdapter mothersFoodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_dashboard_nested, null, false);
        drawerLayout.addView(view, 0);
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));

        // added in second category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList2.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));

        // added in 3rd category
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.popularfood2));
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList3.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));


        // added in 4th category
        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList4.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));


        // added in 5th category
        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));
        categoryItemList5.add(new CategoryItem(1,"Paneer Tikka", "Rs. 140", R.drawable.maakakhana1));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Mom's Special South Indian Dishes", categoryItemList));
        allCategoryList.add(new AllCategory("Mom's Special Evening Chats", categoryItemList2));
        allCategoryList.add(new AllCategory("Restaurant Foods", categoryItemList3));
        allCategoryList.add(new AllCategory("Special Cakes", categoryItemList4));
        allCategoryList.add(new AllCategory("Sweets & Deserts", categoryItemList5));

        setMainCategoryRecycler(allCategoryList);

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(R.drawable.logo_one));
        sliderDataArrayList.add(new SliderData(R.drawable.small_icon));
        sliderDataArrayList.add(new SliderData(R.drawable.small_icon_2));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();

    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
    public void OpenProfile(View view){
        Intent i1 = new Intent(this, MainActivity.class);
        startActivity(i1);
    }

}
