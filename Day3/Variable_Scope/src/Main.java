public class Main {
    public static void main(String[] args) throws Exception {
        //local = declare inside a method 
        //          visible only to that method
        //global = declare outside a method, but within a class
        //          visible to all parts of a class

        DiceRoller diceroller = new DiceRoller(20);
        System.out.println(diceroller.number);
        System.out.println(diceroller.range);

    }
}
