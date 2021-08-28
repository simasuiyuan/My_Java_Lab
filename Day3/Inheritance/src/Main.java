public class Main {
    public static void main(String[] args) throws Exception {
        // inheritance = the process where one class acquires,
        //               the attributes and methods of another\
        Car car = new Car();
        car.go();

        Bicycle bicycle = new Bicycle();
        bicycle.go();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println(car.doors);
        System.out.println(bicycle.paddles);
    }
}
