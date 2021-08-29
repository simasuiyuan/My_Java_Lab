import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Jthis title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.getContentPane().setBackground(new Color(123,50,150));

        this.setVisible(true);
    }
}
