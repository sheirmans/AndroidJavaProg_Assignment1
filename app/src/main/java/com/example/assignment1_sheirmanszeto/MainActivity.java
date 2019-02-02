/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #1
 * Szeto, Sheirman
 */
package com.example.assignment1_sheirmanszeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Widgets
    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private Button submitButton = null;

    private String firstName = "";
    private String lastName = "";

    private TextView resultText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inititalize variables
        this.firstNameTextView = (TextView)findViewById(R.id.editTextFirstName);
        this.lastNameTextView = (TextView)findViewById(R.id.editTextLastName);
        this.resultText = (TextView)findViewById(R.id.textViewResult);

        this.submitButton = (Button)findViewById(R.id.buttonSubmit  );
        this.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("My Submit Button", "OnClick pressed");

                // Gather the user's input from text field widgets.
                setUserInfo();
                Log.d("First Name:", firstName);
                Log.d("Last Name:", lastName);

                // Populate the result box with collected data.
                showResult();

            }
        });
    }

    private void setUserInfo() {
        this.firstName = this.firstNameTextView.getText().toString();
        this.lastName = this.lastNameTextView.getText().toString();
    }

    private void showResult() {
        String resultStr = "Hi, nice to meet you " + firstName + " " + lastName;

        this.resultText.setText(resultStr);
    }
}
