package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Kevin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kevin);
        TextView textView = (TextView) findViewById(R.id.textViewKevin);
        textView.setText("Kevin (Kathleen Barr) is a stereotypical jock. He is cynical, sarcastic and can be cruel at times. ");
    }
}