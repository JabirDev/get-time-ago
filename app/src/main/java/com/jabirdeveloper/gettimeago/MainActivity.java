package com.jabirdeveloper.gettimeago;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+'");
        try {
            Date date = df.parse("2019-12-17T14:33:00+");
            tv.setText(TimeAgo.get(date));
        } catch (ParseException e) {
            e.printStackTrace();
            tv.setText(e.getMessage());
        }

    }
}
