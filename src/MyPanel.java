import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel()
    {
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        IsometricTriangleTop tri1 = new IsometricTriangleTop(g);
        IsometricTriangleBottom tri2 = new IsometricTriangleBottom(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,700,600,100);
        Fuelbar bar = new Fuelbar(g);
        try
        {
            Thread.sleep(25);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        repaint();
    }



}
