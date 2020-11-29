package com.suresh.activity1_to_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ed_username;
    private Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_username = findViewById(R.id.username);
        btn_click = findViewById(R.id.btn);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUsername = ed_username.getText().toString();
                Intent intent = new Intent(MainActivity.this,DisplayActivity2.class);

                intent.putExtra("Username" , strUsername);
                startActivity(intent);
            }
        });
    }
}