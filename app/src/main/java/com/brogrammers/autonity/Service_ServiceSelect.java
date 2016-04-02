package com.brogrammers.autonity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Service_ServiceSelect extends AppCompatActivity {
    Spinner spServiceSelect;
    TextView tvServices;
    Button showResults;
    String userSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service__service_select);

        savedInstanceState = getIntent().getExtras();
        if(savedInstanceState!=null) {
            userSelection = savedInstanceState.getString("userSelection1");
        }

        showResults = (Button)findViewById(R.id.serviceButton);
        tvServices = (TextView)findViewById(R.id.tvServices);
        spServiceSelect = (Spinner)findViewById(R.id.spServiceSelect);
        ArrayAdapter adaptor = ArrayAdapter.createFromResource(this, R.array.Services, android.R.layout.simple_spinner_item);
        spServiceSelect.setAdapter(adaptor);

        showResults.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Service_ServiceSelect.this, Service_Results.class);
                i.putExtra("brand", userSelection);
                i.putExtra("service", String.valueOf(spServiceSelect.getSelectedItem()));
                startActivity(i);
            }
        });
        }
    }
