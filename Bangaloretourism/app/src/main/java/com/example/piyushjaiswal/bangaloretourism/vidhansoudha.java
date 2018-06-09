package com.example.piyushjaiswal.bangaloretourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vidhansoudha extends AppCompatActivity {
ImageButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidhansoudha);
        b1 = findViewById(R.id.imageButton3);
        b2 = findViewById(R.id.imageButton4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://www.kla.kar.nic.in/";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:12.9795 77.5909"));
                startActivity(i2);
            }
        });
    }
}
