package com.example.piyushjaiswal.bangaloretourism;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] places = {"Bangalore Palace","Vidhan Soudha","Lal Bagh","Tipu Sultan's Fort","Cubbon Park"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.font,R.id.textView2,places);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, ""+l.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
        switch (position)
        {
            case 0:
                Intent i = new Intent(MainActivity.this,bp.class);
                startActivity(i);
                break;
            case 1:
                Intent i1 = new Intent(MainActivity.this,vidhansoudha.class);
                startActivity(i1);
                break;
            case 2:
                Intent i2 = new Intent(MainActivity.this,lalbagh.class);
                startActivity(i2);
                break;
            case 3:
                Intent i3 = new Intent(MainActivity.this,tipusultanfort.class);
                startActivity(i3);
                break;
            case 4:
                Intent i4 = new Intent(MainActivity.this,Cubbonpark.class);
                startActivity(i4);
                break;
        }
    }
}
