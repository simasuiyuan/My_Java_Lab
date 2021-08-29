import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class App {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("./assets/file_example_WAV_1MG.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";
        while(!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response) {
                case ("P"): {
                    clip.start();
                    break;
                }
                case ("S"): {
                    clip.stop();
                    break;
                }
                case ("R"): {
                    clip.setMicrosecondPosition(0);
                    break;
                }
                case ("Q"): {
                    clip.close();
                    break;
                }
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Byeeeeeee");
        
        scanner.close();
    }
}
