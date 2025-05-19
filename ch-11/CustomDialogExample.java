import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Button to open dialog
        JButton openDialogBtn = new JButton("Open Dialog");
        frame.add(openDialogBtn);

        openDialogBtn.addActionListener(e -> {
            // Create dialog
            JDialog jd = new JDialog(frame, "This is a Test Dialog", true); // modal dialog
            jd.setLayout(new FlowLayout());
            jd.setSize(250, 120);

            JLabel lbl = new JLabel("Do you want to exit?");
            JButton yes = new JButton("Yes");

            yes.addActionListener(event -> {
                System.exit(0);
            });

            jd.add(lbl);
            jd.add(yes);
            jd.setLocationRelativeTo(frame); // center on main frame
            jd.setVisible(true);
        });

        frame.setVisible(true);
    }
}
