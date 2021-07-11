package com.example.maakaswaad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DevelopersActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_developers, null, false);
        drawerLayout.addView(view, 0);
    }

    public void OpenVineetProfile(View view){
        Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vineetnayak777/"));
        startActivity(openlinkIntent);
    }

    public void OpenSushmaProfile(View view){
        Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sushmanayak05/"));
        startActivity(openlinkIntent);
    }
}