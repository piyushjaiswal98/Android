package com.example.piyushjaiswal.detailcheck;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,pass,address;
    RadioButton male,female;
    EditText num,mail;
    CheckBox sleep,play,read;
    Button bt,login;
    String m,sl=" ";
    SharedPreferences sp;
    String ab = "Mypreference";
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
        login = findViewById(R.id.button2);
        sp = getSharedPreferences("IDvalue",0);
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
                writedata();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,loginpage.class);
                startActivity(i);
            }
        });
    }
    public void writedata()
    {
        String name1 = uname.getText().toString();
        String passw = pass.getText().toString();
        String addres = address.getText().toString();
        String m1 = m;
        String number = num.getText().toString();
        String email = mail.getText().toString();
        String s2 = sl;

        SharedPreferences.Editor editor = sp.edit();
        editor.putString(name1+"id",name1);
        editor.putString(name1,passw);
        editor.putString(name1+"add",addres);
        editor.putString(name1+"gender",m1);
        editor.putString(name1+"number",number);
        editor.putString(name1+"email",email);
        editor.putString(name1+"hobby",s2);
        editor.commit();
        uname.setText("");
        pass.setText("");
        address.setText("");
        num.setText("");
        mail.setText("");
        if(sleep.isChecked())
            sleep.setChecked(false);
        if(read.isChecked())
            read.setChecked(false);
        if(play.isChecked())
            play.setChecked(false);
        if(male.isChecked())
            male.setChecked(false);
        if(female.isChecked())
            female.setChecked(false);
        Toast.makeText(this, "Data Stored", Toast.LENGTH_SHORT).show();

    }
}
