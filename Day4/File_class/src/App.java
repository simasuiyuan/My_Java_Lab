import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        // file = An abstract representation of file and directory pathname

        File file = new File("./assets/secret_message.txt");
        if(file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println("file path: " + file.getPath());
            System.out.println("file absolute path: " + file.getAbsolutePath());
            System.out.println("is it a file?: " + file.isFile());
        }
        else {
            System.out.println("That file doesnt exists! :(");
        }
    }
}
