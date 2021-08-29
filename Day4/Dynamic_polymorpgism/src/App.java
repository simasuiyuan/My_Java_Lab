import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ploymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        //ex. A corvette is a : corvette, a car, and a vehicle and an object
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        // Dog dog;
        // Cat cat;

        System.out.println("What animal do you want?");
        System.out.println(" (1= dog) or (2=cat): ");
        
        int choice = scanner.nextInt();

        switch(choice){
            case 1: {
                animal = new Dog();
                animal.speak();
                break;
            }
            case 2: {
                animal = new Cat();
                animal.speak();
                break;
            }
            default: {
                animal = new Animal();
                animal.speak();
            }
        }
        scanner.close();
    }
}
