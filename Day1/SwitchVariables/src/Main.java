public class Main {
    public static void main(String[] args) throws Exception {
        String x = "water";
        String y = "Koo-Aid";

        System.out.println("x : " + x);
        System.out.println("y : " + y);

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("After switch");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
