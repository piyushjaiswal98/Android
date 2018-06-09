package com.example.piyushjaiswal.detailcheck;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6,t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        t1 = findViewById(R.id.textView8);
        t2 = findViewById(R.id.textView9);
        t3 = findViewById(R.id.textView10);
        t4 = findViewById(R.id.textView11);
        t5 = findViewById(R.id.textView12);
        t6 = findViewById(R.id.textView13);
        t7 = findViewById(R.id.textView14);
        Intent i3 = getIntent();
        String uid = i3.getStringExtra("name");
        SharedPreferences sp = getSharedPreferences("IDvalue", 0);
        String name = sp.getString(uid+"id","none");
        String password = sp.getString(uid,"none");
        String address = sp.getString(uid+"add","none");
        String gender = sp.getString(uid+"gender","none");
        String number = sp.getString(uid+"number","none");
        String email = sp.getString(uid+"email","none");
        String hobby = sp.getString(uid+"hobby","none");
        t1.setText(name);
        t2.setText(password);
        t3.setText(address);
        t4.setText(gender);
        t5.setText(number);
        t6.setText(email);
        t7.setText(hobby);
    }
}
