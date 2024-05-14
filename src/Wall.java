import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Wall
{

    public Wall() {}

    public void paintWall(Graphics g)
    {

        Image wall2 = null;
        try {
            File pathToFile = new File("../Pictures/zaxxonOtherWall.Png");
            wall2 = ImageIO.read(pathToFile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        g.drawImage(wall2, 200, 200,100,100, null);

        Image wall = null;
        try {
            File pathToFile = new File("../Pictures/zaxxonOtherWall.png");
            wall = ImageIO.read(pathToFile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        g.drawImage(wall, 260, 225, 100, 100, null);
    }
}
