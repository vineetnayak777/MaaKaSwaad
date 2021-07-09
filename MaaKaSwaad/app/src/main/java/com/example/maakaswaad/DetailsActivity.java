package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class DetailsActivity extends BaseActivity {

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
        TextView name1 = findViewById(R.id.food_name_det);
        TextView price1 = findViewById(R.id.price_det);
        ImageView imageView = findViewById(R.id.food_image_det);
        name1.setText(name);
        price1.setText(price);
        Picasso.get().load(image_url).into(imageView);


    }



}
