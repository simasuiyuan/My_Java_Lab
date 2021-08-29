import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;

public class App {
    public static void main(String[] args) throws Exception {

        ImageIcon image = new ImageIcon("./assets/coding.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("Bro, do you even code?");
        label.setHorizontalTextPosition(JLabel.CENTER);//CENTER, LEFT. RIGHT
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(255,255,0));
        label.setFont(new Font("MV Boli", Font.PLAIN,50));
        label.setIconTextGap(25);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,400,400);

        MyFrame myFramne = new MyFrame();
        myFramne.add(label);
        // myFramne.setLayout(null);
        myFramne.pack();

    }
}
