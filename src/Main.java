import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create an input dialog and store the entered input into `input`
        String input = JOptionPane.showInputDialog("Does Gabby smell like farts?");

        // Create a frame that you can put text on
        JFrame frame = new JFrame();

        String answer = input.toUpperCase();
        boolean gabbySmells = answer.equals("NO");

        if (gabbySmells != true) {
            JOptionPane.showMessageDialog(frame.getContentPane(), "Ha, Gabby smells like farts");
        } else {
            JOptionPane.showMessageDialog(frame.getContentPane(), "I guess she doesn't smell after all");
        }
    }
}