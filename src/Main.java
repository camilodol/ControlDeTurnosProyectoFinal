import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Home");
        frame.setContentPane(new Home().getPanelHome());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800,500);
        frame.setVisible(true);
    }
}
