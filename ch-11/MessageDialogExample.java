import javax.swing.*;
import java.awt.Color;


public class MessageDialogExample {
    public static void main(String[] args) {
        // Show a simple information message
        // JOptionPane.showMessageDialog(null, "This is a test message");
        Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLUE);
        System.out.println("Selected color: " + color);

    }
}
