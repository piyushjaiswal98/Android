package com.example.piyushjaiswal.addcontent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button button;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String[] str = {"Delhi","Mumbai","Hyderabad","Piyush","Ankit","Bangalore","Abhinav","Pune","Ahmedabad"};
    ArrayList<String> lis = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        lis.addAll(Arrays.asList(str));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lis);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String news = multiAutoCompleteTextView.getText().toString();
                if (!lis.contains(news)) {
                    lis.add(news);
                    Toast.makeText(MainActivity.this, news, Toast.LENGTH_SHORT).show();
                    adapter.add(news);
                    multiAutoCompleteTextView.setAdapter(adapter);

                } else {
                    Toast.makeText(MainActivity.this, "Input already exists in the options", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
