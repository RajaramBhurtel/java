import javax.swing.*;

public class MDIExample {
    public static void main(String[] args) {
        // Main frame
        JFrame frame = new JFrame("MDI Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Desktop pane - the MDI container
        JDesktopPane desktop = new JDesktopPane();

        // Internal Frame 1
        JInternalFrame frame1 = new JInternalFrame("Internal Frame 1", true, true, true, true);
        frame1.setSize(200, 100);
        frame1.setLocation(10, 10); // position
        frame1.setVisible(true);

        // Internal Frame 2
        JInternalFrame frame2 = new JInternalFrame("Internal Frame 2", true, true, true, true);
        frame2.setSize(200, 100);
        frame2.setLocation(50, 150); // position
        frame2.setVisible(true);

        // Internal Frame 3
        JInternalFrame frame3 = new JInternalFrame("Internal Frame 3", true, true, true, true);
        frame3.setSize(200, 100);
        frame3.setLocation(300, 50); // position
        frame3.setVisible(true);

        // Add internal frames to desktop
        desktop.add(frame1);
        desktop.add(frame2);
        desktop.add(frame3);

        // Add desktop to main frame
        frame.add(desktop);
        frame.setVisible(true);
    }
}
