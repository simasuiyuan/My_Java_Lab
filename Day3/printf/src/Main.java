public class Main {
    public static void main(String[] args) throws Exception {
        System.out.printf("This is a format string %d", 123);
        System.out.printf("%d This is a format string", 123);

        boolean mybool = true;
        System.out.printf("%b This is a format string \n", mybool);

        char mychar ='@';
        System.out.printf("%c This is a format string \n", mychar);

        String myString = "Bro";
        System.out.printf("%s This is a format string \n", myString);

        int myint = 0;
        System.out.printf("%d This is a format string \n", myint);

        double myDouble = 100.212;
        System.out.printf("%f This is a format string \n", myDouble);

        //[width]
        myString = "Bro";
        System.out.printf("hello %10s \n", myString);
        System.out.printf("hello %-10s \n", myString);

        //[Precision]
        System.out.printf("hello %.2f \n", myDouble);

        //[flag]
        //- : left-justify
        //+ : output a plus (+) or minus (-) sign for a numeric value
        //0 : numeric values are zeros-padded
        //, : comma grouping separator if number > 1000
        System.out.printf("hello %20f \n", myDouble);
        myDouble = 1000;
        System.out.printf("hello %+f \n", myDouble);
        myDouble = -1000;
        System.out.printf("hello %+f \n", myDouble);

        System.out.printf("hello %020f \n", myDouble);
        System.out.printf("hello %,f \n", myDouble);
    }
}
