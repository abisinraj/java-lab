
// program14
// write a java program to create a rectangle applet
import java.applet.*;
import java.awt.*;

public class RectangleApplet extends Applet {
    int x, y, w, h;
    Color c;

    public void init() {
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        w = Integer.parseInt(getParameter("width"));
        h = Integer.parseInt(getParameter("height"));
        String colorName = getParameter("color");

        if (colorName.equalsIgnoreCase("red"))
            c = Color.red;
        else if (colorName.equalsIgnoreCase("green"))
            c = Color.green;
        else if (colorName.equalsIgnoreCase("blue"))
            c = Color.blue;
        else
            c = Color.black;
    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.drawRect(x, y, w, h);
        g.fillRect(x, y, w, h);
    }
}