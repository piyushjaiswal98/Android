package com.example.piyushjaiswal.june5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button bt;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText4);
        bt = findViewById(R.id.button7);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String pass = e2.getText().toString();
                Intent i = new Intent(Main2Activity.this,profile.class);
                i.putExtra("username",name);
                i.putExtra("password",pass);
                startActivity(i);
            }
        });
    }
}
