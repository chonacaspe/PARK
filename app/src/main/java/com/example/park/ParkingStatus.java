package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParkingStatus extends AppCompatActivity {


    Button pending, verified, history, add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_status);


        pending=(Button) findViewById(R.id.pending);
        verified=(Button) findViewById(R.id.verified);
        history = (Button) findViewById(R.id.history);
        add = (Button) findViewById(R.id.add);

        pending.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ParkingStatus.this, Pending.class);
                startActivity(intent);
            }
        });
        verified.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ParkingStatus.this, Verified.class);
                startActivity(intent);
            }
        });
        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ParkingStatus.this, History.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ParkingStatus.this, ViewParkingSpace.class);
                startActivity(intent);
            }
        });

    }
}
