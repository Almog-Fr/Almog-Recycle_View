package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Sarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarah);
        TextView textView = (TextView) findViewById(R.id.textViewSarah);
        textView.setText("Sarah (Janyse Jaud) is Ed's spoiled and short-tempered younger sister who acts cute and kind to the Eds only when it suits her.");
    }
}