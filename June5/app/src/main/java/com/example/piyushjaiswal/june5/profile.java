package com.example.piyushjaiswal.june5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        Intent i = getIntent();
        String uname = i.getStringExtra("username");
        String pass = (String)i.getExtras().get("password");
        Toast.makeText(this,uname+" "+pass, Toast.LENGTH_SHORT).show();
        t1.setText(uname);
        t2.setText(pass);

    }
}
