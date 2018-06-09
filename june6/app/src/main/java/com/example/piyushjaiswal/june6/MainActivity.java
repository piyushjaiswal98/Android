package com.example.piyushjaiswal.june6;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] cityname = {"Delhi","Agra","Chennai","Bangalore","Mysore","Mumbai","Kolkata"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cityname);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.list_item_colour,R.id.textView,cityname);
        setListAdapter(adapter1);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, ""+l.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
        switch (position)
        {
            case 0:
                Intent i = new Intent(MainActivity.this,Delhi.class);
                startActivity(i);
                break;
            case 1:
                Intent i1 = new Intent(MainActivity.this,Agra.class);
                startActivity(i1);
                break;
        }
    }
}
