package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pending extends AppCompatActivity {


    Button pending, verified, history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending);

        pending=(Button) findViewById(R.id.pending);
        verified=(Button) findViewById(R.id.verified);
        history = (Button) findViewById(R.id.history);

        pending.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Pending.this, Pending.class);
                startActivity(intent);
            }
        });
        verified.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Pending.this, Verified.class);
                startActivity(intent);
            }
        });
        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Pending.this, History.class);
                startActivity(intent);
            }
        });

    }
}
