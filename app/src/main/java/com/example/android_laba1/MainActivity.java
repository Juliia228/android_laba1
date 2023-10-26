package com.example.android_laba1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    TextView inputText;
    EditText background;
    Button btnNextPage;

    public void onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inputText = (TextView) findViewById(R.id.input);
        background = (EditText) findViewById(R.id.color);
        btnNextPage = (Button) findViewById(R.id.btnNextPage);
        btnNextPage.setOnClickListener(this);
    }
    public void onClick(View view) {
        String color = background.getText().toString();
        if (color.equals("red") || color.equals("green") || color.equals("blue")) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("background", color);
            startActivity(intent);
        }
    }
}
