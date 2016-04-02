package com.brogrammers.autonity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Service_BrandSelect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner brandspinner;
    Button nxtButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service__brand_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nxtButton = (Button)findViewById(R.id.brandbutton);

        nxtButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Service_BrandSelect.this, Service_ServiceSelect.class);
                i.putExtra("userSelection1", String.valueOf(brandspinner.getSelectedItem()));
                startActivity(i);
            }
        });

        brandspinner = (Spinner)findViewById(R.id.brandspinner);
        ArrayAdapter adaptor = ArrayAdapter.createFromResource(this, R.array.Brand, android.R.layout.simple_spinner_item);
        brandspinner.setAdapter(adaptor);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
