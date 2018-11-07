package com.example.addition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_FIRSTNUMBER = "com.example.addition.FIRSTNUMBER";
    public static final String EXTRA_SECONDNUMBER = "com.example.addition.SECONDNUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateAddition(View view) {
        Intent intent = new Intent(this, DisplayResultActivity.class);
        EditText firstNumber = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText)findViewById(R.id.secondNumber);
        int number1, number2;
        try
        {
            number1 = Integer.parseInt(firstNumber.getText().toString());
        }
        catch(NumberFormatException ex)
        {
            number1 = 0;
        }
        try
        {
            number2 = Integer.parseInt(secondNumber.getText().toString());
        }
        catch(NumberFormatException ex)
        {
            number2 = 0;
        }
        intent.putExtra(EXTRA_FIRSTNUMBER, number1);
        intent.putExtra(EXTRA_SECONDNUMBER, number2);
        startActivity(intent);
    }
}
