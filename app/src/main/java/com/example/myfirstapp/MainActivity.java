package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Creating a constant to be used with the intent,
    // It's name should include the package name,
    // AND describe what is being sent

    public static final String EXTRA_NAME = "com.example.myfirstapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Anytime a method is to be called from button click, it MUST HAVE a specific type
    of method signature. If you don't use the right signature, your button will Not be
    allowed to call his method.

    public void methodName(View v){
    }
     */

    // This method is an example of taking text from an EditText and displaying
    // it on the SAME SCREEN (ACTIVITY)
    public void makeName(View v){
        EditText firstNameET = findViewById(R.id.firstNameEditText);
        EditText lastNameET = findViewById(R.id.lastNameEditText);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        TextView fullNameTextView = findViewById(R.id.completeNameTextView);
        fullNameTextView.setText(fullName);
    }

    // This method is an example of taking text from an EditText on one screen
    // and displaying it on A DIFFERENT SCREEN. We are using intents to switch
    // activities
    public void sendMessage(View v){
        // Creating the ability to switch screens (addressing the envelope)
        Intent intent = new Intent(this, DisplayWelcomeActivity.class);
        EditText firstNameET = findViewById(R.id.firstNameEditText);
        EditText lastNameET = findViewById(R.id.lastNameEditText);

        // Getting all the info from the screen we want to send
        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        //Sending the info with the intent (filing the envelope)
        intent.putExtra(EXTRA_NAME, fullName);
        // Telling AS to start this activity which will switch the screens
        // like mailing the envelope
        startActivity(intent);
    }

}
