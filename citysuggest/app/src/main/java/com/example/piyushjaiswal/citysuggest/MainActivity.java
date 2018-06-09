package com.example.piyushjaiswal.citysuggest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     Spinner s1,s2;
     String[] country = {"----Country----","India","USA","Canada","Japan","Spain","Germany"};
     String[] ind = {"----City----","Mumbai","Kolkata","Bangalore","Delhi","Chennai","Pune","Hyderabad"};
     String[] usa = {"----City----","Ney York","Chicago","Las Vegas","Los Angeles","San Francisco","Boston"};
     String[] canada = {"----City----","Torronto","Vancouver","Ottawa","Calgary","Montreal","Victoria"};
     String[] jap = {"----City----","Tokyo","Kyoto","Osaka","Yokohama","Nagoya","Shinjuku"};
     String[] spa = {"----City----","Madrid","Barcelona","Valencia","Seville","Malaga","Zaragoza"};
     String[] ger = {"----City----","Berlin","Munich","Frankfurt","Hamburg","Bonn","cologne"};
     String[] city = {"----City----"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = findViewById(R.id.spinner);
        s2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,country);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        ArrayAdapter<String> adapter0 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,city);
                        s2.setAdapter(adapter0);
                        break;
                    case 1:
                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,ind);
                        s2.setAdapter(adapter1);
                        break;
                    case 2:
                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,usa);
                        s2.setAdapter(adapter2);
                        break;
                    case 3:
                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,canada);
                        s2.setAdapter(adapter3);
                        break;
                    case 4:
                        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,jap);
                        s2.setAdapter(adapter4);
                        break;
                    case 5:
                        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,spa);
                        s2.setAdapter(adapter5);
                        break;
                    case 6:
                        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,ger);
                        s2.setAdapter(adapter6);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
