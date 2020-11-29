package com.suresh.activity1_to_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity2 extends AppCompatActivity {
    private TextView txt_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);



        String strUsername = getIntent().getStringExtra("Username");

        txt_display = findViewById(R.id.txt);

        txt_display.setText("Username :-" +strUsername);
    }
}