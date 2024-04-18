import java.awt.*;

public class IsometricTriangleBottom {
    int[] xloc1 = {600, 600, 300};
    int[] yloc1 = {600, 800, 800};

    public IsometricTriangleBottom()
    {
    }

    public void drawTriBottom(Graphics g2)
    {
        g2.setColor(Color.BLACK);
        g2.fillPolygon(xloc1, yloc1, 3);
    }
}
