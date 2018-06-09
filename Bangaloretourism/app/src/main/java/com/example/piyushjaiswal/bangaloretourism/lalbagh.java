package com.example.piyushjaiswal.bangaloretourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lalbagh extends AppCompatActivity {
ImageButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalbagh);
        b1 = findViewById(R.id.imageButton3);
        b2 = findViewById(R.id.imageButton4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://www.horticulture.kar.nic.in/lalbagh.htm";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:12.9507 77.5848"));
                startActivity(i2);
            }
        });
    }
}
