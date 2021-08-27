import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("please enter your name! ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        
        // do-while loop
        {
            System.out.println("please enter your name! ");
            name = scanner.nextLine();
        }while(name.isBlank()) 

        System.out.println("Hello " + name);

    }
}
