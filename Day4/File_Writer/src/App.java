import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            FileWriter writer = new FileWriter("./assets/poem.txt");
            writer.write("Roses are red \nViolets are blue\nBooty Booty Booty Booty\nRockin' everywhere");
            writer.append("\n(A poem by bro)");
            writer.close();
        } 
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
