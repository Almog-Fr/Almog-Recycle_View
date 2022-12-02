package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Edd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edd);
        TextView textView = (TextView) findViewById(R.id.textViewEdd);
        textView.setText("Edd (Samuel Vincent) is the smartest of the Eds and the most polite, mature, curious, and somewhat ironic. As a result, he is more socially accepted by the rest of the kids than Ed and Eddy, usually acting as a peacemaker or offering the rest of the kids advice.");
    }
}