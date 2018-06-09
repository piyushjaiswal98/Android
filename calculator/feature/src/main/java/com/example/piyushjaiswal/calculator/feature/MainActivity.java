package com.example.piyushjaiswal.calculator.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText e1;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
    }
    public void AddOp(View v)
    {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        Integer a = Integer.parseInt(s1);
        Integer b = Integer.parseInt(s2);
        Integer c = a + b;
        tv.setText("Sum: "+c);

    }
    public void SubOp(View v)
    {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        Integer a = Integer.parseInt(s1);
        Integer b = Integer.parseInt(s2);
        Integer c = a - b;
        tv.setText("Difference: "+c);

    }
    public void MulOp(View v)
    {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        Integer a = Integer.parseInt(s1);
        Integer b = Integer.parseInt(s2);
        Integer c = a * b;
        tv.setText("Product: "+c);

    }
    public void DivOp(View v)
    {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        Float a = Float.parseFloat(s1);
        Float b = Float.parseFloat(s2);
        Float c = a / b;
        tv.setText("Division: "+c);

    }
}
