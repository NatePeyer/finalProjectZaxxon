import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel()
    {
    }

    public void drawTri1(Graphics g2)
    {
        IsometricTriangle tri1 = new IsometricTriangle(g2);
    }
}
