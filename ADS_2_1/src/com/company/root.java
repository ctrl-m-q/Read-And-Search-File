package com.company;

public class root {
    // second level task
    private double function(double x){
        return Math.pow(x,2) - 2*Math.log(x + 1);
    }
    public double bisection(double a, double b, double e){
        double x = (a + b)/2;
        while (Math.abs(function(x))>e){
            if ( function(a)* function(x) < 0){
                b = x;
            }
            else if (function(b) * function(x) < 0){
                a = x;
            }
            x = (a + b) / 2;
        }
        return x;
    }
    private double first_derivative(double x){
        return 2*x - 2/(x+1);
    }
    private double second_derivative(double x){
       return  2/ (Math.pow((x+1),2)) + 2;
    }

    public double Newton_method(double a, double b, double e){
        double x;
        if (function(a)*second_derivative(a)>0){
            x = a;
        }
        else {
            x = b;
        }
        while (Math.abs(function(x)) > e){
            x -= function(x)/first_derivative(x);
        }
        return x;
    }
    public double Secant (double a, double b, double e){
        double x;
        if(function(a)* second_derivative(a)> 0){
            x = a;
            while (Math.abs(function(x))> e){
                x= x - (x-a)*function(x)/(function(x)-function(a));
            }
        }
        else{
            x = b;
            while (Math.abs(function(x))> e){
                x = x - (b - x)*function(x) / (function(b) - (function(x)));
            }
        }
        return x;


    }
}
