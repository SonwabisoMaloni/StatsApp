package com.example.statsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<Double> numbers = new ArrayList<>();

    public void doAdd(View v){
        EditText e = (EditText)findViewById(R.id.editText1);
        String value = e.getText().toString();
        Double d = Double.parseDouble(value);
        numbers.add(d);
        e.setText("");
    }
    public void doMean(View v){
        double mean = Calculator.getMean(numbers);
        String result = Double.toString(mean);
        TextView out = findViewById(R.id.output1);
        out.setText(result);
    }
    public void doVariance(View v){
        double variance = Calculator.getVariance(numbers);
        String result = Double.toString(variance);
        TextView out = findViewById(R.id.output1);
        out.setText(result);
    }

    public void doStdDev(View v){
        double stdDev = Calculator.getStdDev(numbers);
        String result = Double.toString(stdDev);
        TextView out = findViewById(R.id.output1);
        out.setText(result);
    }




}