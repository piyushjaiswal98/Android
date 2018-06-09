package com.example.piyushjaiswal.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    EditText et;
    TextView txt;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button7);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button5);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button15);
        b10 = findViewById(R.id.button16);
        b11 = findViewById(R.id.button17);
        b12 = findViewById(R.id.button18);
        b13 = findViewById(R.id.button19);
        b14 = findViewById(R.id.button20);
        b15 = findViewById(R.id.button21);
        b16 = findViewById(R.id.button22);
        et = findViewById(R.id.editText3);
        txt = findViewById(R.id.textView);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if(i== R.id.button20)
        {
            et.setText(et.getText().toString() + "0");
        }
        if(i== R.id.button)
        {
            et.setText(et.getText().toString() + "1");
        }
        if(i== R.id.button2)
        {
            et.setText(et.getText().toString() + "2");
        }
        if(i== R.id.button3)
        {
            et.setText(et.getText().toString() + "3");
        }
        if(i== R.id.button7)
        {
            et.setText(et.getText().toString() + "4");
        }
        if(i== R.id.button6)
        {
            et.setText(et.getText().toString() + "5");
        }
        if(i== R.id.button5)
        {
            et.setText(et.getText().toString() + "6");
        }
        if(i== R.id.button15)
        {
            et.setText(et.getText().toString() + "7");
        }
        if(i== R.id.button16)
        {
            et.setText(et.getText().toString() + "8");
        }
        if(i== R.id.button17)
        {
            et.setText(et.getText().toString() + "9");
        }
        if(i== R.id.button19)
        {
            compute();
            ACTION = ADDITION;
            txt.setText(String.valueOf(val1) + "+");
            et.setText(null);
        }
        if(i== R.id.button8)
        {
            compute();
            ACTION = SUBTRACTION;
            txt.setText(String.valueOf(val1) + "-");
            et.setText(null);
        }
        if(i== R.id.button18)
        {
            compute();
            ACTION = MULTIPLICATION;
            txt.setText(String.valueOf(val1) + "*");
            et.setText(null);
        }
        if(i== R.id.button21)
        {
            compute();
            ACTION = DIVISION;
            txt.setText(String.valueOf(val1) + "/");
            et.setText(null);
        }
        if(i== R.id.button22) {
            compute();
            ACTION = EQU;
            txt.setText(String.valueOf(val1));
            et.setText(null);
        }
        if (i == R.id.button4) {
            if (et.getText().length() > 0) {
                CharSequence name = et.getText().toString();
                et.setText(name.subSequence(0, name.length() - 1));
            } else {
                val1 = Double.NaN;
                val2 = Double.NaN;
                et.setText(null);
                txt.setText(null);

            }
        }
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(et.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(et.getText().toString());
        }
    }
}
