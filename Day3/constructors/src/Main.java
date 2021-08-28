public class Main {
    public static void main(String[] args) throws Exception {
        // constructor = special method that is called when an object is instantiated (created)
        Human human = new Human("Rick", 56, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();
    }
}
