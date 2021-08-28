public class Main {
    public static void main(String[] args) throws Exception {
        //super = keyword refers to the superclass (parent) of an object
        //          very similar to "this" keyword

        Hero hero1 = new Hero("Batman", 42,"$$$");
        Hero hero2 = new Hero("Superman", 43,"everyting");
        System.out.println(hero2.toString());

        // System.out.println(hero1.name);
        // System.out.println(hero1.age);
        // System.out.println(hero1.power);
    }
}
