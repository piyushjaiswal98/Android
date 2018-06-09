package com.example.piyushjaiswal.june4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class ui extends AppCompatActivity implements TimePicker.OnTimeChangedListener{
     TimePicker timePicker;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        timePicker = findViewById(R.id.timepicker);
        textView = findViewById(R.id.textView2);
        timePicker.setOnTimeChangedListener(this);
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        int hr = timePicker.getHour();
        int min = timePicker.getMinute();
        if(hr<=11 || (hr==12 && min==0))
        {
            textView.setText(hr+" : "+min+" AM");
        }
        else
        {
            textView.setText(hr+" : "+min+" PM");
        }

    }
}
