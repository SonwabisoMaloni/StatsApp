package com.example.statsapp;
import java.lang.Math;

import java.util.ArrayList;

public class Calculator {
    public static double getMean(ArrayList<Double> array){
        double sum = 0;
        for(int i = 0; i< array.size(); i++){
            sum += array.get(i);
        }
        return sum / array.size();
    }
    public static double getVariance(ArrayList<Double> array){
        double mean = getMean(array);
        double sum = 0;
        for(int i=0; i<array.size(); i++) {
            sum += (array.get(i) - mean) * (array.get(i) - mean);
        }
        return sum/ array.size();
    }
    public static double getStdDev(ArrayList<Double> array){
        double variance = getVariance(array);
        return Math.sqrt(variance);
    }
}
