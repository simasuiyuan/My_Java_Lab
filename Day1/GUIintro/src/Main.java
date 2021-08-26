import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null,"Your are  " + age + " years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null,"Your are  " + height + " cm tall");
    }
}
