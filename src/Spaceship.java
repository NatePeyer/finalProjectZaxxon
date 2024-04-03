import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.tree.FixedHeightLayoutCache;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Spaceship {

    public Spaceship(Graphics g) {
        //need to find a good picture of the spaceship, and then figure out how to set its start postion
        // up and down arrow keys impact y axis
        //left and right move side to side this get hard with iso
        // /-key is shot

    }

    public Spaceship(Graphics g, int key)
    {
        //37 left arrow
        //38 up arrow
        //39 right arrow
        //40 down arrow
        //47 slash key
        if(key == 38)
        {
            //implmentation to devlope for moving up
        } else if (key == 40)
        {
            //implmentation to devlope for moving down
        } else if (key == 37)
        {
            //implmentation to devlop for moving to the left
        } else if (key == 39)
        {
            // implmentation to devlop for moving to the right
        }
        else
        {
            Image spaceship = null;
            try {
                File pathToFile = new File("Pictures/fpZaxxonFlyingShipOne.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, 50, 400, null);
        }
    }
}
