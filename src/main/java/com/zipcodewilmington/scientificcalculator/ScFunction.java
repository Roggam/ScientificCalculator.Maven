package com.zipcodewilmington.scientificcalculator;

public class ScFunction {
    private Double result;

    public ScFunction() {
        result = 0.0; // constructor to initialize variable
    }

//    public switchDisplayMode() {
//
//    }
//
//    public switchDisplayMode(String mode) {
//
//    }


    public double sin(double num1) {
        result = Math.sin(num1);
        return result;
        // this works
    }

    public double cosine(double num1) {
        result = Math.cos(num1);
        return result;
        // this works
    }


    public double tangent(double num1) {
        result = Math.tan(num1);
        return result;
        // this works
    }



    public double inverseSin(double num1) {
        result = Math.asin(num1);
        return result;
        // this works
        // num1 NEEDS TO BE BETWEEN -1 AND 1 otherwise NaN.
    }



    public double inverseCosine(double num1) {
        result = Math.acos(num1);
        return result;
        // this works
        // num1 NEEDS TO BE BETWEEN -1 AND 1 otherwise NaN
    }


    public double inverseTangent(double num1) {
        result = Math.atan(num1);
        return result;
        // this works
        // no input restrictions
    }


    public double log(double num1) {
        result = Math.log(num1);
        return result;
    }


    public double inverseLog(double num1) {
        result = Math.exp(Math.log(num1));
        return result;
    }


//    public double naturalLog(double num1) {
//
//    }
//
//    public double inverseNaturalLog(double num1) {
//
//    }
//
//    public factorial(double num1) {
//
//
//    }


}
