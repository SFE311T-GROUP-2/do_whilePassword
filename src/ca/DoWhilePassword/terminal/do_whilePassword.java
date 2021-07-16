
package ca.DoWhilePassword.terminal;
import javax.swing.*;
class Password
{
    String choice = "John";
    public static void main(String[] args) {

    }

    public boolean checkPassword()
    {
        String input;
        boolean correctPassword;
        int attempts = 1;
        do
        {
            input = JOptionPane.showInputDialog("Enter Password in a password...");
            correctPassword = input.equals(choice);
            if (!correctPassword)
            {
                attempts++;
                JOptionPane.showMessageDialog(null, "Incorrect password! Please Enter Password");
            }
        }
        while (!correctPassword && attempts <= 3);
        if (correctPassword)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Sorry, maximum number of attempts exceeded! the current password is " + choice);
            return false;
        }
    }
}

