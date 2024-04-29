import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Turret
{
    protected int x;
    protected int y;

    public Turret(Graphics g)
    {
        System.out.println("Turret Created");
        Image turret = null;
        try
        {
            File pathToFile = new File("Pictures/zaxxonSprites_1_-removebg-preview.png");
            turret = ImageIO.read(pathToFile);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        g.drawImage(turret,0,0,null);

    }

    public void turretHit()
    {
        System.out.println("Turret hit and destroyed");
        //needs implmentation
    }

}
