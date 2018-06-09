package com.example.piyushjaiswal.june8;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class passwordremember extends AppCompatActivity {
    Button click,load;
    CheckBox checkBox;
    EditText euser, epass;
    String s = "";
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwordremember);
        euser = findViewById(R.id.editText3);
        epass = findViewById(R.id.editText4);
        click = findViewById(R.id.button3);
        load = findViewById(R.id.button4);
        checkBox = findViewById(R.id.checkBox);

        sp = getSharedPreferences(s,MODE_PRIVATE);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked())
                {
                    s = euser.getText().toString();
                    String pass = epass.getText().toString();
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString(s,pass);
                    editor.commit();

                }
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                euser.setText("");
                epass.setText("");
                if(checkBox.isChecked())
                {
                    Toast.makeText(passwordremember.this, "Password Saved", Toast.LENGTH_SHORT).show();

                }
            }
        });
      load.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String ret = euser.getText().toString();
              Toast.makeText(passwordremember.this,s, Toast.LENGTH_SHORT).show();
              if(ret.contentEquals(s))
              {
                  String p = sp.getString(s,"none");
                  epass.setText(p);
              }
          }
      });


    }
}
