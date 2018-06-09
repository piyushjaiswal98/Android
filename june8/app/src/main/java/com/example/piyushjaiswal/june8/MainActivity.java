package com.example.piyushjaiswal.june8;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b_save,b_load;
    EditText e_user,e_pass;
    String name = "My_Preference";
    SharedPreferences sp;
    String pKey = "passkey",uKey="Userkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_save = findViewById(R.id.button);
        b_load = findViewById(R.id.button2);
        e_user = findViewById(R.id.editText);
        e_pass = findViewById(R.id.editText2);
        sp = getSharedPreferences(name,MODE_PRIVATE);
        b_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writedata();
            }
        });
        b_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readdata();
            }
        });
    }
    public void writedata()
    {
        String name = e_user.getText().toString();
        String pass = e_pass.getText().toString();
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(uKey,name);
        editor.putString(pKey,pass);
        editor.commit();
        e_user.setText("");
        e_pass.setText("");
        Toast.makeText(this, "Data Stored", Toast.LENGTH_SHORT).show();

    }
    public void readdata()
    {
        String name = sp.getString(uKey,"none");
        String pass = sp.getString(pKey,"none");
        e_user.setText(name);
        e_pass.setText(pass);
        Toast.makeText(this, "Data reading done", Toast.LENGTH_SHORT).show();
    }
}
