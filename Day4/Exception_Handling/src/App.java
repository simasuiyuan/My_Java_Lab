import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exception = an event that occurs during the execution of a program that
        //              disrupt the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divided by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("result: "+z);
        }
        catch(ArithmeticException e) {
            System.out.println("You cant divided by zero! idiot!");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a number! OMFG!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}
