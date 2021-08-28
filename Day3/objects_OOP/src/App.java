public class App {
    public static void main(String[] args) throws Exception {
        // objects = a instance of a class that may contain attributes and methods
        Car mycar1 = new Car();
        Car mycar2 = new Car();

        System.out.println(mycar1.model);
        System.out.println(mycar1.make);

        System.out.println(mycar2.model);
        System.out.println(mycar2.make);
        
        // mycar2.drive();
        // mycar2.brake();
    }
}
