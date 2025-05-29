import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="AppletLifecycleDemo" width=400 height=300>
</applet>
*/

public class AppletLifecycleDemo extends Applet {
    private StringBuffer messages = new StringBuffer();

    public void init() {
        addMessage("init() called - Applet initialized");
        System.out.println("init() called (console)");
    }

    public void start() {
        addMessage("start() called - Applet started");
        System.out.println("start() called (console)");
    }

    public void stop() {
        addMessage("stop() called - Applet stopped");
        System.out.println("stop() called (console)");
    }

    public void destroy() {
        // This will only appear in console
        System.out.println("destroy() called - Applet destroyed");
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

        String message = messages.toString();
        String[] lines = message.split("\n");

        int y = 20;
        for (String line : lines) {
            g.drawString(line, 10, y);
            y += 15;
        }
    }

    private void addMessage(String msg) {
        messages.append(msg).append("\n");
        repaint();
    }
}