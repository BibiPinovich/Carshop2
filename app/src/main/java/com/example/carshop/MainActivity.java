package com.example.carshop;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    int countqua = 0;
    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
         spinnerArrayList = new ArrayList();
        spinnerArrayList.add("VW Polo");
        spinnerArrayList.add("VW Golf");
        spinnerArrayList.add("VW Tiguan");
        spinnerArrayList.add("VW Tuareg");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

    }

    public void increaseQuantity(View view) {
        TextView countText = findViewById(R.id.countText);
        countqua++;

        countText.setText(Integer.toString(countqua));
    }

    public void minQuantity(View view) {
        TextView countText = findViewById(R.id.countText);

        if (countqua != 0) {
            countqua--;
            countText.setText(Integer.toString(countqua));
        }else countqua = 0;
    }
}