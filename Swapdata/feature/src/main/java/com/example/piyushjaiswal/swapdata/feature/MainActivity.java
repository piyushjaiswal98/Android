package com.example.piyushjaiswal.swapdata.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
    }

    public void ButtonClick(View v)
    {
      String s1 = e1.getText().toString();
      String s2 = e2.getText().toString();
      e1.setText(s2);
      e2.setText(s1);
    }
}
