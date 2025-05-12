import javax.swing.*;

public class MYPanel {
    // main function
    public static void main(String[] args)
    {
        JFrame f= new JFrame("Panel Example");     
        JPanel panel=new JPanel();   
        JLabel lbl=new JLabel("Testing label"); 
        JButton b = new JButton("button1");
        panel.add(lbl); 
        panel.add(b); 
        f.add(panel); 
        f.setSize(300,200);
        f.setVisible(true);
    }
}