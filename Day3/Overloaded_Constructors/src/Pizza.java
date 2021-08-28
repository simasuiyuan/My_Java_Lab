public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    //constructor with no argument => signature0 => OOP
    Pizza() {
    }

    //constructor with 1 argument => signature1
    Pizza(String bread) {
        this.bread = bread;
    }

    //constructor with 2 argument => signature2
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    //constructor with 3 argument => signature3
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    //constructor with 4 argument => signature4
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

}
