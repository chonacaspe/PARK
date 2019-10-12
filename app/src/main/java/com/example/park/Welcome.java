package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button find, provide, account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        find=(Button) findViewById(R.id.find);
        provide=(Button) findViewById(R.id.provide);
        account =(Button) findViewById(R.id.account);



        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, Find.class);
                startActivity(intent);
            }
        });

        provide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Welcome.this, ParkingStatus.class);
                startActivity(intent);
            }
        });


        account.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            Intent intent = new Intent(Welcome.this, ProfileDetails.class);
            startActivity(intent);
        }
    });
    }
}
