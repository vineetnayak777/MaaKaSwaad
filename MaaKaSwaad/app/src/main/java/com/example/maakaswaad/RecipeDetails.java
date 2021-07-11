package com.example.maakaswaad;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RecipeDetails extends BaseActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_recipe_details, null, false);
        drawerLayout.addView(view, 0);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("name")) {
            String name = getIntent().getStringExtra("name");
            setImage(name);
        }
    }
    private void setImage(String name){
        String name1 = name;
        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new Callback());
        if(name1.equals("Paneer Tikka")){
            webView.loadUrl("https://www.indianhealthyrecipes.com/paneer-tikka-on-stove-top/");
        }
        if(name1.matches("Paneer Lolipop")){
            webView.loadUrl("https://www.sanjeevkapoor.com/Recipe/Paneer-Lollipops.html");
        }


    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}