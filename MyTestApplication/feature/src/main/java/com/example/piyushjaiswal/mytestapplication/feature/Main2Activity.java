package com.example.piyushjaiswal.mytestapplication.feature;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    RelativeLayout relativeLayout;
    EditText e1;
    EditText e2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = findViewById(R.id.button6);
        b3 = findViewById(R.id.button8);
        b2 = findViewById(R.id.button9);
        b4 = findViewById(R.id.button10);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText4);
        tv = findViewById(R.id.textView2);
        relativeLayout = findViewById(R.id.rl);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        int i = v.getId();
        String s1 = e1.getText().toString().trim();
        String s2 = e2.getText().toString().trim();
        Integer a = Integer.parseInt(s1);
        Integer b = Integer.parseInt(s2);
        Float f1 = Float.parseFloat(s1);
        Float f2 = Float.parseFloat(s2);
        if (i == R.id.button6) {
            Integer c = a + b;
            tv.setText("Sum: "+c);

        } else if (i == R.id.button8) {

            Integer c = a * b;
            tv.setText("Product: "+c);
        }
        else if (i == R.id.button9) {

            Integer c = a - b;
            tv.setText("Difference: "+c);
        }
        else if (i == R.id.button10) {

            Float c = f1 / f2;
            tv.setText("Division: "+c);
        }
    }

}
