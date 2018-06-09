package com.example.piyushjaiswal.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
     TextView t1,t2,t3,t4,t5,t6,t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.textView8);
        t2 = findViewById(R.id.textView9);
        t3 = findViewById(R.id.textView10);
        t4 = findViewById(R.id.textView11);
        t5 = findViewById(R.id.textView12);
        t6 = findViewById(R.id.textView13);
        t7 = findViewById(R.id.textView14);
        Intent i = getIntent();
        String user = i.getStringExtra("name");
        String pass = i.getStringExtra("password");
        String address = i.getStringExtra("address");
        String gender = i.getStringExtra("gender");
        String contact = i.getStringExtra("contact");
        String email = i.getStringExtra("email");
        String hobbies = i.getStringExtra("hobbies");
        t1.setText(user);
        t2.setText(pass);
        t3.setText(address);
        t4.setText(gender);
        t5.setText(contact);
        t6.setText(email);
        t7.setText(hobbies);
    }
}
