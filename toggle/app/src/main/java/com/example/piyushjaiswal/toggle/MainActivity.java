package com.example.piyushjaiswal.toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ToggleButton tg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tg = findViewById(R.id.toggleButton);
        tg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(tg.isChecked())
        {
            Toast.makeText(this, "Hello There", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "See you later", Toast.LENGTH_LONG).show();
        }
    }
}
