package com.example.piyushjaiswal.june7;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notification1 extends AppCompatActivity {
    Button button;
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification1);
        button = findViewById(R.id.button);
        nm = (NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String channel_id = "my_package_channelid";
                int importance = NotificationManager.IMPORTANCE_HIGH;
                String name = "my_package_name";
                NotificationChannel nc = new NotificationChannel(channel_id,name,importance);
                Notification.Builder builder = new Notification.Builder(notification1.this,channel_id);
                //Notification.Builder builder = new Notification.Builder(notification1.this);
                builder.setSmallIcon(R.mipmap.bangback);
                builder.setContentTitle("My Notification");
                builder.setContentText("Click here to move to my app");
                Intent intent = new Intent(notification1.this,MainActivity.class);
                PendingIntent pi = PendingIntent.getActivity(notification1.this,101,intent,0);
                builder.setContentIntent(pi);
                builder.setAutoCancel(true);
                builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                nm.createNotificationChannel(nc);
                nm.notify(101,builder.build());
            }
        });
    }
}
