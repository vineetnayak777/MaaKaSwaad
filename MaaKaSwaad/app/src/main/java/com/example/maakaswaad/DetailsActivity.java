package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class DetailsActivity extends BaseActivity {
    ArrayList<String> foodname = new ArrayList<>();
    ArrayList<String> foodtype = new ArrayList<>();
    ArrayList<String> rating = new ArrayList<>();
    ArrayList<String> content_det = new ArrayList<>();
    JSONArray jsonArray;
    JSONObject jsonObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.food_details, null, false);
        drawerLayout.addView(view, 0);
        getIncomingIntent();
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
        String ratings, contents;
        TextView name1 = findViewById(R.id.food_name_det);
        TextView price1 = findViewById(R.id.price_det);
        ImageView imageView = findViewById(R.id.food_image_det);
        TextView ratings1 = findViewById(R.id.rating_det);
        TextView content = findViewById(R.id.content_food_det);
        name1.setText(name);
        price1.setText(price);
        Picasso.get().load(image_url).into(imageView);
        for(int i = 0; i<foodname.size(); i++)
        {
            if (foodname.get(i).equals(name))
            {
                ratings = rating.get(i);
                ratings1.setText(ratings);
                contents = content_det.get(i);
                content.setText(contents);
                break;
            }
        }

    }



}
