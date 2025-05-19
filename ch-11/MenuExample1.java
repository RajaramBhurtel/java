import javax.swing.*;
import java.awt.event.*;

public class MenuExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save As...");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(closeItem);
        fileMenu.addSeparator();  // Separator line
        fileMenu.add(exitItem);

        // Action for Exit
        exitItem.addActionListener(e -> System.exit(0));

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem redoItem = new JMenuItem("Redo");
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem deleteItem = new JMenuItem("Delete");
        JMenuItem selectAllItem = new JMenuItem("Select All");

        editMenu.add(redoItem);
        editMenu.add(undoItem);
        editMenu.addSeparator();
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(deleteItem);
        editMenu.add(selectAllItem);

        // Help Menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpIndexItem = new JMenuItem("Help Index");
        JMenuItem aboutItem = new JMenuItem("About...");

        helpMenu.add(helpIndexItem);
        helpMenu.add(aboutItem);

        // Add all menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
