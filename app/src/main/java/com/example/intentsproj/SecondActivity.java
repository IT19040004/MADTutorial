package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1,etNum2;
    String number1,number2;

    int n1,n2;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sum = findViewById(R.id.texsum);
        etNum1 = findViewById(R.id.editNo1);
        etNum2 = findViewById(R.id.editNo2);

        Intent intent =getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add1(View view){

        sum.setText(number1 + " + " + number2 + " = " + (n1+n2));

    }

    public void add2(View view){

        sum.setText(number1 + " - " + number2 + " = " + (n1-n2));

    }

    public void add3(View view){

        sum.setText(number1 + " x " + number2 + " = " + (n1*n2));

    }

    public void add4(View view){

        sum.setText(number1 + " / " + number2 + " = " + (n1/n2));

    }
}