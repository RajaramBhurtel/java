// Java Swing Program to demonstrate
// a simple JFrame
import javax.swing.*;
// import javax.swing.JLabel;

// Driver Class
public class JFrameExe {
    // main function
    public static void main(String[] args)
    {
        // Create a new JFrame
        JFrame frame = new JFrame();

        // Create a label
        // JLabel label
        //     = new JLabel("This is label");

        // // Add the label to the frame
        // frame.add(label);

        // Set frame properties
        frame.setSize(300,200); // Set the size of the frame

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}