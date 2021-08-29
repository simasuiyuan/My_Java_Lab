public class Main {
    public static void main(String[] args) throws Exception {
        // encapsulation = attributes of a class will be hidden or private
        //                  Can be accessed only through methods (getter & setters)
        //                  Should make attributes private if dont have a reason to make them public/protected

        Car car = new Car("Chevrolet","Camaero",2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
