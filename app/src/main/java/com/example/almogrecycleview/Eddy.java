package com.example.almogrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Eddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eddy);
        TextView textView = (TextView) findViewById(R.id.textViewEddy);
        textView.setText("Eddy (Tony Sampson) is the self-appointed leader of the Eds. He is arrogant, self-centered, ignorant, loudmouthed, immature, greedy, and hot-tempered.");
    }
}