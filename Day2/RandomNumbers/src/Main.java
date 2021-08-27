import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random(); //pesudo random generator

        int x = random.nextInt(6); //generate between 0~5
        System.out.println(x);

        x = random.nextInt(6)+1; //generate between 1~6
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
