package com.example.piyushjaiswal.mytestapplication.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText2);
    }
    public void ButtonClick(View v)
    {

      String name = et.getText().toString();
      tv.setText("Welcome User: "+name);
      //tv.setTextSize(20);
    }
}
