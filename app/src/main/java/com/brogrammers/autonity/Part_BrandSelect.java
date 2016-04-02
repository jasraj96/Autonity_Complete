package com.brogrammers.autonity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Part_BrandSelect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button brandbutton;
    Spinner spinner;
    ArrayAdapter adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part__brand_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = (Spinner) findViewById(R.id.spParts);
        adaptor = ArrayAdapter.createFromResource(this, R.array.Brand, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adaptor);
        spinner.setOnItemSelectedListener(this);

        brandbutton = (Button)findViewById(R.id.brandbutton);

        brandbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i =new Intent(Part_BrandSelect.this, Part_ModelSelect.class);
                i.putExtra("userSelection1", String.valueOf(spinner.getSelectedItem()));
                startActivity(i);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
