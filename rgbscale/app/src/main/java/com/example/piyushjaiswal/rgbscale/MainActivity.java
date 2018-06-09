package com.example.piyushjaiswal.rgbscale;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener{
    Button bt;
    SeekBar r;
    SeekBar g;
    SeekBar b;
    TextView txt;
    Integer i=0,j=0,k=0;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.button);
        r = findViewById(R.id.seekBar);
        g = findViewById(R.id.seekBar2);
        b = findViewById(R.id.seekBar3);
        txt = findViewById(R.id.textView);
        txt.setText("RGB = (0,0,0)");
        r.setOnSeekBarChangeListener(this);
        g.setOnSeekBarChangeListener(this);
        b.setOnSeekBarChangeListener(this);
        bt.setOnClickListener(this);
        cl = findViewById(R.id.cl);
    }

    @Override
    public void onClick(View v) {
        cl.setBackgroundColor(Color.rgb(i,j,k));

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        i = r.getProgress();
        j = g.getProgress();
        k = b.getProgress();
        txt.setText("RGB = ("+r.getProgress()+","+g.getProgress()+","+b.getProgress()+")");
        txt.setTextColor(Color.rgb(i,j,k));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        r.setMax(255);
        g.setMax(255);
        b.setMax(255);

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
