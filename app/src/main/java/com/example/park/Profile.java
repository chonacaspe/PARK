package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


      /*      Intent intent = getIntent();

            String fName = intent.getStringExtra("firstName");
            String lName = intent.getStringExtra("lastName");*/
        }


  /*  public void onButtonClick(View view) {

        // get the text from the EditText
        EditText editText = (EditText) findViewById(R.id.textview1);
        String stringToPassBack = editText.getText().toString();

        // put the String to pass back into an Intent and close this activity
        Intent intent = new Intent();
        intent.putExtra(Intent.EXTRA_TEXT, stringToPassBack);
        setResult(RESULT_OK, intent);
        finish();

    }*/

    }

