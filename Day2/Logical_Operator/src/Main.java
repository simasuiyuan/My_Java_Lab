import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // && = (AND) both copnd must be true
        // || = (OR) either cond must be treu
        // !  = (NOT) reverses boolean values of condition

        int temp = 25;

        if(temp > 30) {
            System.out.println("It is hot outside!");
        }
        else if (temp>= 20 && temp<=30) {
            System.out.println("it is warm outside");
        }
        else {
            System.out.println("It is code outside");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game press Q to quit!");
        String response = scanner.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game!");
        }
        else {
            System.out.println(" you quit the game");
            
        }


    }
}
