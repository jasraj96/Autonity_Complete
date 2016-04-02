package com.brogrammers.autonity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class LandingPage extends AppCompatActivity {
    Button bParts, bServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        bParts = (Button)findViewById(R.id.bParts);
        bServices = (Button)findViewById(R.id.bServices);

        bParts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LandingPage.this, Part_BrandSelect.class));
            }
        });

        bServices.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LandingPage.this, Service_BrandSelect.class));
            }
        });
    }
}
