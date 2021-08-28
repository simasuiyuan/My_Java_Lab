package package1;
import package2.*;

public class A {
    protected String protectedMessage = "This is a protected message (defined in class A)";
    public static void main (String[] args) {

        // C c = new C();
        // // System.out.println(c.defaultMessage); //The field C.defaultMessage is not visible <= from different package (no modifier of C.defaultMessage)
        // System.out.println(c.publicMessage);

        B b = new B();
        // System.out.println(b.privateMessage);//The field B.privateMessage is not visible <= private 
    }
}
