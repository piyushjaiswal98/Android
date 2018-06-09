package com.example.piyushjaiswal.bangaloretourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Cubbonpark extends AppCompatActivity {
    ImageButton b1cp;
    ImageButton b2cp;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubbonpark);
        b1cp = findViewById(R.id.imagebutton3cp);
        b2cp = findViewById(R.id.imagebutton4cp);
        img = findViewById(R.id.imageviewcp);
        img.setImageResource(R.drawable.cubbonpark);
        b1cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://www.horticulture.kar.nic.in/cubbon.htm";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                startActivity(i);
            }
        });
        b2cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:12.9763 77.5929"));
                startActivity(i2);
            }
        });
    }

}
