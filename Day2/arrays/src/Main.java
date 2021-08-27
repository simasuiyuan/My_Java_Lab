public class Main {
    public static void main(String[] args) throws Exception {
        // String[] cars = {"Camaro", "Corvette", "Tesla"};

        // System.out.println(cars[0]);
        // cars[0] = "Mustang";
        // System.out.println(cars[0]);
        // System.out.println(cars[2]);

        String[] cars = new String[3];
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

        for(String car : cars) { // for each
            System.out.println(car);
        }
    }
}