package com.example.piyushjaiswal.passwordcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox ck;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText);
        ck = (CheckBox)findViewById(R.id.checkBox);
        ck.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId())
        {
            case R.id.checkBox:
                if(!isChecked)
                {
                    et.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                else
                {
                    et.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                break;


    }
}}
