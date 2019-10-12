package com.example.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Registration extends AppCompatActivity {

    private static final int SECOND_ACTIVITY_REQUEST_CODE = 0;

    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // get the text from MainActivity
        /*Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        // use the text in a TextView
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);*/

    }

   /* public void onButtonClick(View view) {

        // get the text to pass
          /*  EditText editText = (EditText) findViewById(R.id.textview1);
            String textToPass = editText.getText().toString();

            // start the SecondActivity
            Intent intent = new Intent(this, Profile.class);
            intent.putExtra(Intent.EXTRA_TEXT, textToPass);
            startActivity(intent);*/


// signup
    //= (Button) findViewById(R.id.signup);

       /* signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, Profile.class);
                startActivity(intent);

            }
        });*/


  /*  public void onButtonClick(View view) {

        // Start the SecondActivity
        Intent intent = new Intent(this, Profile.class);
        startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
    }

    // This method is called when the second activity finishes
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                // get String data from Intent
                String returnString = data.getStringExtra(Intent.EXTRA_TEXT);

                // set text view with string
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(returnString);
            }
        }*/


    }

