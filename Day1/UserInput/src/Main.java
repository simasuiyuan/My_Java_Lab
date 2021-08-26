import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();// input => bro => Enter => bro\n => read bro\n => empty
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // input => 18 => Enter => 18\n => read only 18 => \n <- next line if call scanner.nextline will automatically enter

        scanner.nextLine();//<= clean \n from previous  scanner.nextInt;  try to mask this line to see the effect
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age +" years old");
        System.out.println("You like " + food );

        scanner.close();
    }
}
