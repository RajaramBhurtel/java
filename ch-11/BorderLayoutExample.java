import javax.swing.*;  
import java.awt.*; 
public class BorderLayoutExample { 
    public static void main(String[] args) { 
// Create and set up a frame window 
        JFrame frame = new JFrame("Layout");          
// Define new buttons  
        // Define new buttons with different regions 
        JButton jb1 = new JButton("NORTH");      
        JButton jb2 = new JButton("SOUTH"); 
        JButton jb3 = new JButton("WEST");       
        JButton jb4 = new JButton("EAST"); 
        JButton jb5 = new JButton("CENTER");         
        // Define the panel to hold the buttons  
        JPanel panel = new JPanel(); 
        panel.setLayout(new BorderLayout()); 
        panel.add(jb1, BorderLayout.NORTH); 
        panel.add(jb2, BorderLayout.SOUTH); 
        panel.add(jb3, BorderLayout.WEST); 
        panel.add(jb4, BorderLayout.EAST); 
        panel.add(jb5, BorderLayout.CENTER);           
// Set the window to be visible as the default to be false 
        frame.add(panel); 
        frame.pack(); 
        frame.setVisible(true);      
    } 
} 