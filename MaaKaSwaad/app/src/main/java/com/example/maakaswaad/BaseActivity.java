package com.example.maakaswaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,0,0);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.nav_dashboard:
                Intent intent1 = new Intent(BaseActivity.this, DashboardActivity.class);
                startActivity(intent1);
                break;
            case R.id.home_food:
                break;
            case R.id.popular_foods:
                break;
            case R.id.restaurant_foods:
                break;
            case R.id.mission:
                break;
            case R.id.developers:
                break;
            case R.id.mail:
                Toast.makeText(getApplicationContext(),"Mail: xxx@gmail.com",Toast.LENGTH_LONG).show();
                break;
            case R.id.call:
                Toast.makeText(getApplicationContext(),"Call: 7019XXX847",Toast.LENGTH_LONG).show();
                break;
            case R.id.myprofile:
                Intent intent = new Intent(BaseActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}