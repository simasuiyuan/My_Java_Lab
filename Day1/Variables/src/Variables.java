package Day1.Variables.src;
import javax.swing.plaf.synth.SynthEditorPaneUI;

import jdk.dynalink.beans.StaticClass;

public class Variables {
    public static void main(String[] args) {
        System.out.println("\"I \\love Pizza\"");
        System.out.println("Its really good!");
        
        // This is a new start for me!
        /*I will finally learn the 
         *Java!
         */
        
        // variables
        int x; // declaration
        x = 123; // assignment
        int y = 100; // initialization
        System.out.println(x);
        System.out.print("y = " + y);

        long a = 1243298327589598L;
        System.out.println(a);

        float b = 3.14f;
        System.out.println("float number b = " + b);

        float d = 3.1415926f;
        System.out.println("float number d = " + d);

        boolean c = true;
        System.out.println("boolean c = " + c);

        char symbol = '@';
        System.out.println("char symbol = " + symbol);

        String name = "Ma Yuan";
        System.out.println("String name = " + name);
    }
}
