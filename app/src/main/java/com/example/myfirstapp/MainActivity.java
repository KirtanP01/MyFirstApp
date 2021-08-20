package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Anytime a method is to be called from button click, it MUST HAVE a specific type
    of method signature. If you don't use the right signature, your button will Not be
    allowed to call his method.

    public void methodName(view v){
    }
     */

    public void makeName(View v){
        EditText firstnameET = findViewById(R.id.firstNameEditText);
        EditText lastnameET = findViewById(R.id.lastNameEditText);

        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();

        String fullName = firstName + " " + lastName;
        TextView fullNameTextView = findViewById(R.id.completeNameTextView);
        fullNameTextView.setText(fullName);
    }
}
