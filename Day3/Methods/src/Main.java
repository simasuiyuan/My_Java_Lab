public class Main {
    public static void main(String[] args) throws Exception {
        String name = "Bro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        int answer = add(x,y);
        System.out.println("3 + 4 = " + answer);
        System.out.println(add(6,7));

    }

    //Note cannnot make a static reference to the non- static method => static void
    static void hello(String title, int age) {
        System.out.println("Hello " + title);
        System.out.println("Your age is  " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
