import java.awt.*;

public class IsometricTriangleTop {
    int[] xloc1 = {0,0, 400};
    int[] yloc1 = {0,200, 0};

    public IsometricTriangleTop(Graphics g2)
    {

            g2.setColor(Color.BLACK);
            g2.fillPolygon(xloc1,yloc1,3);

    }
}
