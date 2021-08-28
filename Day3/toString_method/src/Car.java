import javax.swing.text.StyleConstants.ColorConstants;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    //overiding toString method
    public String toString() {
        return "car make: "+make + "\n"+ "car model: "+ model + "\n" + "car color: "+color +"\n"+"car year: "+year;
    }
}
