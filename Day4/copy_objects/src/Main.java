public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Chevrolet","Camaero",2021);
        Car car2 = new Car("Ford","Mustang",2022);

        // car1 = car2//shouldnt do this for copying => share the address => not good!
        
        // approach 1
        car2.copy(car1);//car1 and car2 has 2 different address but share same attributes

        // approach 2
        Car car3 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
