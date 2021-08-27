public class Main {
    public static void main(String[] args) throws Exception {
        
        /*
         * wrapper class = provides a way to use primitive data type => as reference data type
         *                  * pros:
         *                       reference data contains useful methods 
         *                       can be used with collections(ex. ArrayList) 
         *                  * Cons:
         *                      Slower than primitive data type
         * 
         * 
         * primitive        wrapper class (reference data type)
         * --------         --------
         * boolean          Boolean
         * char             Character
         * int              Integer
         * double           Double
         * 
         * autoboxing = automatic conversion provide by Java compiler => primitive data type => reference data type
         * unboxing = automatic conversion provide by Java compiler => reference data type => primitive data type 
         */

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        
        if (a == true) {
            System.out.println("Hello, World!");
        }
        
    }
}
