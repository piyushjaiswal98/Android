package com.example.piyushjaiswal.june4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,SeekBar.OnSeekBarChangeListener {
    RadioButton rb_yellow,rb_red,rb_green;
    RelativeLayout rl;
    SeekBar seekBar;
    TextView txt;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb_red = findViewById(R.id.rb_red);
        rb_green = findViewById(R.id.rb_green);
        rb_yellow = findViewById(R.id.rb_yellow);
        rb_red.setOnCheckedChangeListener(this);
        rb_yellow.setOnCheckedChangeListener(this);
        rb_green.setOnCheckedChangeListener(this);
        rl = findViewById(R.id.layout);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        txt = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(rb_green.isChecked() && !rb_red.isChecked() && !rb_yellow.isChecked() ) {

            rl.setBackgroundColor(Color.GREEN);

            Toast.makeText(this,rb_green.getText().toString(), Toast.LENGTH_SHORT).show();

        }
        else if(rb_yellow.isChecked() && !rb_green.isChecked() && !rb_red.isChecked())
        {

            rl.setBackgroundColor(Color.YELLOW);

            Toast.makeText(this,rb_yellow.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else if(rb_red.isChecked() && !rb_green.isChecked() && !rb_yellow.isChecked())
        {

            rl.setBackgroundColor(Color.RED);
            Toast.makeText(this,rb_red.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        txt.setText("Progress: "+progress);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        seekBar.setMax((Integer.parseInt((editText.getText().toString().trim()))));
        Toast.makeText(this, "go go go", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, "halt!!", Toast.LENGTH_SHORT).show();

    }
}
