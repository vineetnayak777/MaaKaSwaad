package com.example.maakaswaad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MissionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_mission, null, false);
        drawerLayout.addView(view, 0);
    }
}