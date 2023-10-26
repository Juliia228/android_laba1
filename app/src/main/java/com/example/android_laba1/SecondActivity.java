package com.example.android_laba1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity implements View.OnClickListener {
    Button btnBack;
    public void onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.second);
        String background = getIntent().getStringExtra("background").toString();
        View secondView = findViewById(R.id.second);
        switch (background) {
            case "red":
                secondView.setBackgroundColor(getApplicationContext().getColor(R.color.red));
                break;
            case "green":
                secondView.setBackgroundColor(getApplicationContext().getColor(R.color.green));
                break;
            case "blue":
                secondView.setBackgroundColor(getApplicationContext().getColor(R.color.blue));
                break;
            default:
                secondView.setBackgroundColor(getApplicationContext().getColor(R.color.white));
        }
        btnBack = (Button) findViewById(R.id.btnGoBack);
        btnBack.setOnClickListener(this);
    }
    public void onClick(View view) {
        finish();
    }
}
