import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.*;
import java.util.Properties;

public class Spaceship {

    public Spaceship(Graphics g)
    {
        //need to find a good picture of the spaceship, and then figure out how to set its start postion
        // up and down arrow keys impact y axis
        //left and right move side to side this get hard with iso
        // /-key is shot
        ImageIcon flyingSpaceShipOne = new ImageIcon("Pictures/fpZaxxonFlyingShipOne.Png");
        JLabel temp = new JLabel(flyingSpaceShipOne, SwingConstants.SOUTH_EAST);
        g.drawImage("Pictures/fpZaxxonFlyingShipOne.Png", 100,100, Properties);
    }
}
