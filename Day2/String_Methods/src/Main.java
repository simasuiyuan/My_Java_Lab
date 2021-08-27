public class Main {
    public static void main(String[] args) throws Exception {
        String name = "Bro";

        boolean result = name.equals("bro");
        System.out.println(result);

        result = name.equalsIgnoreCase("bro");
        System.out.println(result);

        int result_int = name.length();
        System.out.println(result_int);

        char result_char = name.charAt(0);
        System.out.println(result_char);

        result_int = name.indexOf("o");
        System.out.println(result_int);

        result = name.isEmpty();
        System.out.println(result);

        String result_string = name.toUpperCase();
        System.out.println(result_string);

        result_string = name.toLowerCase();
        System.out.println(result_string);

        name = "       Bro       ";
        result_string = name.trim();
        System.out.println(result_string);

        name = "Bro";
        result_string = name.replace('o', 'u');
        System.out.println(result_string);

    }
}
