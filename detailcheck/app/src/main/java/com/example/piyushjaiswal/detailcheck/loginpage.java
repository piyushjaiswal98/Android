package com.example.piyushjaiswal.detailcheck;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
EditText e_user,e_pass;
Button bt,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        e_user = findViewById(R.id.editText);
        e_pass = findViewById(R.id.editText6);
        bt = findViewById(R.id.button3);
        register = findViewById(R.id.button4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = e_user.getText().toString();
                String pass = e_pass.getText().toString();
                SharedPreferences sp = getSharedPreferences("IDvalue", 0);
                String ucheck = sp.getString(user+"id","");
                String pcheck = sp.getString(user,"");
                if(ucheck.contentEquals(user)&&pcheck.contentEquals(pass))
                {
                    Intent i1 = new Intent(loginpage.this,Details.class);
                    i1.putExtra("name",ucheck);
                    startActivity(i1);
                }
                else {
                    Toast.makeText(loginpage.this, "User does not exist! Please Register", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(loginpage.this,MainActivity.class);
                startActivity(i2);
                finish();
            }
        });
    }
}
