package com.example.piyushjaiswal.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText uname,pass,address;
    RadioButton male,female;
    EditText num,mail;
    CheckBox sleep,play,read;
    Button bt;
    String m,sl=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = findViewById(R.id.name);
        pass = findViewById(R.id.editText2);
        address = findViewById(R.id.editText3);
        male = findViewById(R.id.radioButton);
        female = findViewById(R.id.radioButton3);
        num = findViewById(R.id.editText4);
        mail = findViewById(R.id.editText5);
        sleep = findViewById(R.id.checkBox);
        play = findViewById(R.id.checkBox2);
        read = findViewById(R.id.checkBox4);
        bt = findViewById(R.id.button);
        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(male.isChecked())
                {
                    m = male.getText().toString();
                }
            }
        });
        female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(female.isChecked())
                {
                    m = female.getText().toString();
                }
            }
        });
        sleep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sleep.isChecked())
                {
                    sl = sl + sleep.getText().toString();
                }
            }
        });
        play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(play.isChecked())
                {
                    sl = sl+","+ play.getText().toString();
                }
            }
        });
        read.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(read.isChecked())
                {
                    sl = sl+","+read.getText().toString();
                }
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid = uname.getText().toString();
                String password = pass.getText().toString();
                String addre = address.getText().toString();

                String contact = num.getText().toString();
                String em = mail.getText().toString();

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name",uid);
                i.putExtra("password",password);
                i.putExtra("address",addre);
                i.putExtra("gender",m);
                i.putExtra("contact",contact);
                i.putExtra("email",em);
                i.putExtra("hobbies",sl);
                startActivity(i);
            }
        });
    }
}
