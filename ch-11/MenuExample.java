import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Example");

        JMenuBar mb = new JMenuBar();

        JMenu menu1 = new JMenu("Courses");
        JMenuItem item1 = new JMenuItem("BCA");
        JMenuItem item2 = new JMenuItem("BBA");

        menu1.add(item1);
        menu1.add(item2);
        mb.add(menu1);

        frame.setJMenuBar(mb);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
