public class Main {
    public static void main(String[] args) throws Exception {
        /* expression = operands & operators
         * operands = values, variables, numbers, quantity
         * operators = + - * / %
         */

        int friends = 10;

        friends = friends + 1;
        System.out.println(friends);
        friends = friends - 1;
        System.out.println(friends);
        friends = friends * 2;
        System.out.println(friends);
        friends = friends / 2;
        System.out.println(friends);
        friends = friends % 2;
        System.out.println(friends);
        friends++;
        System.out.println(friends);
        friends--;
        System.out.println(friends);

        friends = 10;
        friends  = friends/3;
        System.out.println(friends);

        double friends_too = 10;
        friends_too = 10;
        friends_too  = (double) friends_too/3;
        System.out.println(friends_too);
    }
}
