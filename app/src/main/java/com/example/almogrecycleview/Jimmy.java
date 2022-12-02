package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Jimmy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jimmy);
        TextView textView = (TextView) findViewById(R.id.textViewJimmy);
        textView.setText("Jimmy (Keenan Christenson) is an insecure and innocent child, with a propensity to cry, and Sarah's best friend whom he is most often seen spending his time with.");
    }
}