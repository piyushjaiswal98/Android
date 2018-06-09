package com.example.piyushjaiswal.june9;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class Cameraactivity extends AppCompatActivity {
    Button bt_click;
    ImageView imageView;
    Integer req_code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameraactivity);
        imageView = findViewById(R.id.imageView);
        bt_click = findViewById(R.id.button2);
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,req_code);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode==req_code)&&(resultCode==RESULT_OK))
        {
           Bitmap bm = (Bitmap) data.getExtras().get("data");
           imageView.setImageBitmap(bm);
           try{
               setWallpaper(bm);
           }
           catch (IOException e){
               e.printStackTrace();
           }
        }
    }
}
