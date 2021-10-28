package com.company;
public class definite_Integrals {
    private double function(double x){
        return Math.sin(Math.pow(Math.E,x/3) + x);
    }
    public double trapenzoidalMethod(double a, double b, double step){
        double sum = 0.5 * (function(b) + function(a));
        int n = (int)((b - a)/ step);
        double current;
        for (int i = 1; i< n; i++){
            current = a + step*i;
            sum +=function(current);
        }
        return sum *step;
    }
    public double left_rectangleMethod(double a, double b, double step){
        double sum = 0.0;
        double x = a;
        int n = (int)((b - a)/step);
        for (int j = 0; j< n; j++){
            sum+=function(x+j*step);
        }
        return sum * step;
    }
    public double right_rectangleMethod(double a , double b, double step){
        double sum = 0.0;
        double x = a ;
        int n = (int)((b-a)/step);
        for(int j= 1 ; j <= n; j++){
            sum+= function(x+j*step);
        }
        return sum * step;

    }
    public double middle_rectangleMethod(double a, double b, double step){
        double sum = 0.0;
        double x = a+step/2;
        int n = (int)((b - a)/step);
        for (int j = 0; j < n ; j++){
            sum += function(x + j * step);
        }
        return sum *step;
    }
    public double simpsonsMethod(double a, double b, double step){
        int n = (int)((b-a)/ step);
        double sum = function(b) + function(a);
        double sub_sum = 0;
        double x;

        for (int i = 1; i < n; i += 2){
            x = a + step * i;
            sub_sum +=function(x);
        }

        sub_sum *= 4;
        sum += sub_sum;
        sub_sum = 0;
        for (int i = 2; i < n - 1; i += 2){
            x = a + step * i;
            sub_sum +=function(x);
        }
        sub_sum *= 2;
        sum += sub_sum;
        return sum *step / 3;
    }


}
