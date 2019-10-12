package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(2 * 1000);
                    Intent intent = new Intent(getBaseContext(), Menu.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }
            }


        };
        background.start();
    }
}