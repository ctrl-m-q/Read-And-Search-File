package com.company;
import java.util. *;
public class Main {

    public static void main(String[] args) {
        /*
        differential D = new differential();
        double[]y = D.fourthOrderRungeKutta(0,1,2,0.2);
        for (int i = 0; i<y.length; i++){
            System.out.println("x: " + i + "y: " + y[i]);
        }

	/*Scanner low_Interval = new Scanner (System.in);
	System.out.println("Enter the lowest interval : ");
	double a = low_Interval.nextDouble();
	Scanner high_Interval = new Scanner (System.in);
	System.out.println("Enter the highest interval : ");
	double b = low_Interval.nextDouble();
	Scanner h = new Scanner (System.in);
	System.out.println("Enter h : ");
	double step = h.nextDouble();
      /*

	 */
	root Root = new root();
	System.out.println("root with Bisection Method :" + Root.bisection(1,6,0.02));
	System.out.println("root with Newton Method :" + Root.Newton_method(1,6,0.02));
	System.out.println("root with Secant Method :" + Root.Secant(1,6,0.02));

		/*System.out.println("Evaluating definite integral by trapenzoid: " + DI.trapenzoidalMethod(a,b,step));
		System.out.println("Evaluating definite integral by left rectangle method: " + DI.left_rectangleMethod(a, b, step));
		System.out.println("Evaluating definite integral by right rectangle method: " + DI.right_rectangleMethod(a, b, step));
		System.out.println("Evaluating definite integral by middle rectangle method: " + DI.middle_rectangleMethod(a, b, step));
		System.out.println("Evaluating definite integral by Simpson's method : " + DI.simpsonsMethod(a, b, step));

         */




    }
}
