package com.brogrammers.autonity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.Objects;

public class Part_Results extends AppCompatActivity {
    String brand,model;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part__results);

        savedInstanceState = getIntent().getExtras();
        if (savedInstanceState != null) {
            brand = savedInstanceState.getString("brand");
            model = savedInstanceState.getString("model");
        }

        mWebView = (WebView)findViewById(R.id.webView);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if(Objects.equals(brand, "BMW")){
            mWebView.loadUrl("http://www.google.com/search?q=bmw+parts&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");
        }
        else if(Objects.equals(brand, "Nissan")) {
            mWebView.loadUrl("http://www.google.com/search?q=nissan+parts&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");

        }
        else if(Objects.equals(brand, "Honda")) {
            mWebView.loadUrl("http://www.google.com/search?q=honda+parts&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");

        }
        else {
            mWebView.loadUrl("www.google.com");
        }
    }
}

