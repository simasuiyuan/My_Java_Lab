import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // ArrayList = * a resizable array
        //             * Element can be added, removed after compilation phase
        //             * Only store reference data type => e.g. ArrayList<Integer>, onArrayList<Double>, onArrayList<String>... cannot declare primitive inside <>


        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamberger");
        food.add("hotdog");
        System.out.println("\nadd");
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.set(0, "sushi");
        System.out.println("\nset");
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.remove(2);
        System.out.println("\nremove");
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.clear();
        System.out.println("\nclear");
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
