package com.brogrammers.autonity;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Objects;

import static android.widget.AdapterView.*;

public class Part_ModelSelect extends AppCompatActivity implements OnItemSelectedListener {
    Spinner modelspinner;
    ArrayAdapter adaptor;
    Button brandbutton;
    String brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part__model_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        savedInstanceState = getIntent().getExtras();
        if (savedInstanceState != null) {
            brand = savedInstanceState.getString("userSelection1");
        }

        modelspinner = (Spinner) findViewById(R.id.spinner2);

        if (Objects.equals(brand, "BMW")) {
            adaptor = ArrayAdapter.createFromResource(this, R.array.Brand_BMW, android.R.layout.simple_spinner_item);
            modelspinner.setAdapter(adaptor);
        } else if (Objects.equals(brand, "Nissan")) {
            adaptor = ArrayAdapter.createFromResource(this, R.array.Brand_Nissan, android.R.layout.simple_spinner_item);
            modelspinner.setAdapter(adaptor);
        } else if (Objects.equals(brand, "Honda")) {
            adaptor = ArrayAdapter.createFromResource(this, R.array.Brand_Honda, android.R.layout.simple_spinner_item);
            modelspinner.setAdapter(adaptor);
        }

        brandbutton = (Button) findViewById(R.id.modelbutton);
        brandbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Part_ModelSelect.this, Part_Results.class);
                i.putExtra("brand", brand);
                i.putExtra("model", String.valueOf(modelspinner.getSelectedItem()));
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
