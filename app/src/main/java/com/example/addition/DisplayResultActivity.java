package com.example.addition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Intent intent=getIntent();
        int sum = intent.getIntExtra(MainActivity.EXTRA_FIRSTNUMBER, 0) + intent.getIntExtra(MainActivity.EXTRA_SECONDNUMBER, 0);
        TextView textView = findViewById(R.id.textView);
        textView.setText(""+sum);
    }
}
