import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet2 extends Applet {
    public void init() {
        Label lbl1 = new Label("First Number: ");
        add(lbl1);
        TextField txt1 = new TextField(10);
        add(txt1);
        Label lbl2 = new Label("Second Number: ");
        add(lbl2);
        TextField txt2 = new TextField(10);
        add(txt2);
        Label lbl3 = new Label("Result: ");
        add(lbl3);
        Button btn = new Button("Submit");
        add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int first = Integer.parseInt(txt1.getText());
                    int second = Integer.parseInt(txt2.getText());
                    int res = first + second;
                    lbl3.setText("Result: " + res);
                } catch (NumberFormatException e) {
                    lbl3.setText("Result: Invalid input");
                }
            }
        });
    }
}