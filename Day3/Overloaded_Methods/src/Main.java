public class Main {
    public static void main(String[] args) throws Exception {
        // Overloaded methods = methods that share the same name but have different parameters
        int x = add(1,2);
        System.out.println(x);

        x = add(1,2,3);
        System.out.println(x);

        x = add(1,2,3,4);
        System.out.println(x);

        double y = add(1.0,2.0,3.0,4.0);
        System.out.println(y );

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b +c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b +c+d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded method #1 with double type");
        return a+b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #2 with double type");
        return a + b +c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #3 with double type");
        return a + b +c+d;
    }
}
