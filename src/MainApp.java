package bsu.rfe.java.group9.lab2.Ivanenko.varB;
import javax.swing.JFrame;
public class MainApplication extends JFrame {
    public static void main(String[] args) {
     /*JFrame frame = new JFrame();
    frame.setSize(500,500);
    JButton b1 = new JButton("НАЖМИ МЕНЯ");
    frame.add(b1);
    frame.setTitle(" Мое первое окошко :) ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);*/
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}