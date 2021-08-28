import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    int range;

    DiceRoller(int range) {
        this.range = range;
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(this.range) + 1;
        System.out.println(number);
    }

    // DiceRoller() {
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    // void roll(Random random, int number){
    //     number = random.nextInt(6) + 1;
    //     System.out.println(number);
    // }
}
