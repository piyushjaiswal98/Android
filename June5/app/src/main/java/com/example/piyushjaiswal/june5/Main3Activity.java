package com.example.piyushjaiswal.june5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 = findViewById(R.id.button5);
        b2 = findViewById(R.id.button6);
        e1= findViewById(R.id.editText2);
        e2 = findViewById(R.id.editText3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e2.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+s));
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = e1.getText().toString();
                if(a.length()>12 || a.length()<4)
                {
                    Toast.makeText(Main3Activity.this, "Invalid Number, Please provide a 12 digit number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i2 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+"+a));
                    startActivity(i2);
                }
            }
        });
    }
}
