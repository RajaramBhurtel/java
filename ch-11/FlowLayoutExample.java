import javax.swing.*;  
import java.awt.*; 
public class FlowLayoutExample { 
    public static void main(String[] args) { 
// Create and set up a frame window 
        JFrame frame = new JFrame("Layout");          
// Define new buttons  
        JButton jb1 = new JButton("Button 1");       
        JButton jb2 = new JButton("Button 2"); 
        JButton jb3 = new JButton("Button 3");           
        JButton jb4 = new JButton("Button 4");           
// Define the panel to hold the buttons  
        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(3,2, 5, 5));  //setting flowlayout 
        panel.add(jb1); 
        panel.add(jb2); 
        panel.add(jb3); 
        panel.add(jb4); 
// Set the window to be visible as the default to be false 
        frame.add(panel); 
        frame.pack(); 
        frame.setVisible(true);      
    } 
} 