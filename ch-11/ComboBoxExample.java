import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        JPanel panel=new JPanel();   

        // String arr[] = {"BCA", "BBA", "MCA", "MBA"};
        // JComboBox<String> cmb = new JComboBox<>(arr);
        // JList<String> list = new JList<>(arr);
        // JTextArea txt = new JTextArea("Enter your message here...", 5, 20);
        // JScrollPane scrollPane = new JScrollPane(txt);
        // scrollPane.setBounds(50, 50, 200, 100);
//table
        String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE"},
            {"Anand Jha", "6014", "IT"}
        };

        String[] columnNames = {"Name", "Roll Number", "Department"};
        JTable table = new JTable(data, columnNames);

        // cmb.setBounds(100, 100, 100, 30);
        // panel.add(cmb);
        // panel.add(scrollPane);
        // panel.add(list);
        panel.add(table);
        frame.add(panel); 

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setLayout(null);
        frame.setVisible(true);
    }
}
