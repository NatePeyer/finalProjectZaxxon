import java.awt.*;

public class IsometricTriangle {
    int[] xloc1 = {0,0, 600};
    int[] yloc1 = {0,300, 0};

    public IsometricTriangle(Graphics g2)
    {
        g2.setColor(Color.BLACK);
        g2.fillPolygon(xloc1,yloc1,3);
    }
}
