public class Main {
    public static void main(String[] args) throws Exception {
        //polymorphism = greek word for poly-"many", morph-"form"
        //              The ability of an object to identify as more than one (data)type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        // polymorphism car, bicycle, boat: are all identified as Vehicle type 
        Vehicle[] racers = {car, bicycle, boat};

        for(Vehicle racer: racers) {
            racer.go();
        }
    }
}
