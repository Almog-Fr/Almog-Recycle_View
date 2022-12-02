package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ed);
        TextView textView = (TextView) findViewById(R.id.textViewEd);
        textView.setText("Ed (Matt Hill) is the strong, airheaded, dimwitted, and considerate of the three who has very short hair. He wears a red-and-white striped shirt, a green jacket with two white stripes on each sleeve and purple-blue jeans.");
    }




}