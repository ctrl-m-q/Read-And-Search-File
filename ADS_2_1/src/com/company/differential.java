package com.company;

public class differential {
   double func(double x, double y){
        return x*x;
   }

   public double [] fourthOrderRungeKutta(double x0, double y0, double xn, double h){
        int n = (int)((xn - x0)/h + 1);
        double k1,k2,k3,k4,k5;
        double[] x = new double [n];
        double y[] = new double[n];
        x[0] = x0;
        y[0] = y0;
        for (int i = 0; i<=n; i++){
            //formulas
            k1 = h*func(x[i - 1], y[i - 1]);
            k2 = h*func(x[i - 1] + h/2, y[i - 1] + 0.5* k1);
            k3 = h*func(x[i - 1] + h, y[i - 1] + k2* 0.5);
            k4 = h*func(x[i - 1] + h, y[i - 1] + k3);

            x[i] = x[i - 1] + h;
            y[i] = y[i - 1] + (1.0/6.0)*(k1 + 2*k2 + 2*k3 + k4);
        }
        return y;
   }

}


