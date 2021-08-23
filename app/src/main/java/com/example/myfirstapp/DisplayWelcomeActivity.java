package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayWelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_welcome);

        // Receive the intent (like going to the mailbox)
        Intent intent = getIntent();

        // Extract the data using the constant name we created as its label
        // Since this constant lives in MainActivity.java, that is why we need
        // to refer to it in this way
        String welcomeName = intent.getStringExtra(MainActivity.EXTRA_NAME);

        // Get a reference to view on screen we want to display text in
        TextView displayTV = findViewById(R.id.textView);

        // Set the text to the TextView on the screen
        displayTV.setText(welcomeName);
    }
}