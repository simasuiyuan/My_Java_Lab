import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // String[] animals = {"cat", "dog", "rat", "bird"};
        // for(String animal : animals) {
        //     System.out.println(animal);
        // }

        ArrayList<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        for(String animal : animals) {
            System.out.println(animal);
        }
    }
}
