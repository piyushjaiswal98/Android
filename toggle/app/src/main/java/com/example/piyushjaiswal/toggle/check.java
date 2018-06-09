package com.example.piyushjaiswal.toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class check extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, OnClickListener{
    CheckBox cb_tea,cb_coffee,cb_milk;
    Button button;
    String order="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        cb_tea = findViewById(R.id.checkBox);
        cb_coffee = findViewById(R.id.checkBox2);
        cb_milk = findViewById(R.id.checkBox3);
        button = findViewById(R.id.button);
        cb_tea.setOnCheckedChangeListener(this);
        cb_coffee.setOnCheckedChangeListener(this);
        cb_milk.setOnCheckedChangeListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, order, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId())
        {
            case R.id.checkBox:
                if(isChecked)
                {
                    order = order+"Tea";
                    Toast.makeText(this, "Chai Chai", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox2:
                if(isChecked)
                {
                    order = order+" Coffee";
                    Toast.makeText(this, "Coffee", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3:
                if(isChecked)
                {
                    order = order + " Milk";
                    Toast.makeText(this, "Yummy Milk", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
