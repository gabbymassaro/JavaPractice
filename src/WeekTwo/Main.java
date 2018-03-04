package WeekTwo;

import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {
        // below is a program that asks the user how old they are and stores the
        // response in the variable `response`. Write some code that then shows
        // another message dialog and if the user is over 21, tell the user
        // that they are old enough to party, otherwise, tell them to go back
        // to school

        String response = JOptionPane.showInputDialog(null, "How old are you?");

        // Convert the response into a number just Integer.parseInt.
        // Note: If the users response is not a number, show a message that says
        // "Please restart the program and enter a valid number"
        int age = -999999;

        // check if the number entered is equal to, or over 21 and show message
        // dialog that says "You are old enough to party"
        // otherwise, show a message dialog that says
        // "Go back to school to prove that you are not a fool"
    }
}