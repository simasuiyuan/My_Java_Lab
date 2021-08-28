public class Main {
    public static void main(String[] args) throws Exception {
        //abstract = abstract classes cannot be instantiated, but they can have a subclasses
        //             abstract methods are declared without an implementation

        Car car = new Car();
        // Vehicle vehicle = new Vehicle(); cannot instantiated => avoid someone create a generic class object
        car.go();
    }
}
