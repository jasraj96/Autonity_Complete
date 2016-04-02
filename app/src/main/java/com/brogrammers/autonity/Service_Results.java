package com.brogrammers.autonity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Objects;

public class Service_Results extends AppCompatActivity {

    String brand;
    String service;
    WebView mWebView;

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle B) {
        super.onCreate(B);
        setContentView(R.layout.activity_services__results);

        B = getIntent().getExtras();
        if(B!=null) {
            brand = B.getString("brand");
            service = B.getString("service");
        }

        mWebView = (WebView)findViewById(R.id.ServicewebView);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if(Objects.equals(brand, "BMW")){
            mWebView.loadUrl("http://www.google.com/search?q=bmw+services&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");
        }
        else if(Objects.equals(brand, "Nissan")) {
            mWebView.loadUrl("http://www.google.com/search?q=nissan+services&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");

        }
        else if(Objects.equals(brand, "Honda")) {
            mWebView.loadUrl("http://www.google.com/search?q=honda+services&oq=bmw+parts&aqs=chrome..69i57j69i65.2387j0j7&sourceid=chrome&ie=UTF-8#safe=off&q=honda+parts");

        }
        else {
            mWebView.loadUrl("www.google.com");
        }
    }
}
