package com.example.piyushjaiswal.june7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    AutoCompleteTextView autoCompleteTextView;
    String[] city = {"Delhi","Dehradun","Kashmir","Noida"};
    String[] name = {"Aniket","Ankit","Apurv","Ashwini","Chandan","Manu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        autoCompleteTextView.setThreshold(2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,city);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,name);
        autoCompleteTextView.setAdapter(adapter1);
        multiAutoCompleteTextView.setAdapter(adapter1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        imageView.setImageResource(R.mipmap.bangback);
                        break;
                    case 1:
                        imageView.setImageResource(R.mipmap.cubbonpark);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
