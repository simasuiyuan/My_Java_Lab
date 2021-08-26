import java.util.function.DoubleUnaryOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // double x = 3.14;
        // double y = -10;

        // double z = Math.max(x,y);
        // System.out.println(z);
        // z = Math.min(x,y);
        // System.out.println(z);
        // z = Math.abs(y);
        // System.out.println(z);
        // z = Math.sqrt(x);
        // System.out.println(z);
        // z = Math.round(x);
        // System.out.println(z);
        // z = Math.ceil(x);
        // System.out.println(z);
        // z = Math.floor(x);
        // System.out.println(z);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) +(y*y));
        System.out.println("The hypotenuse is " + z);

        scanner.close();



    }
}
