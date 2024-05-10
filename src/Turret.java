import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Turret
{
    protected int x;
    protected int y;

    public Turret()
    {

    }

    public void moveTurret(Graphics g)
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
        g.drawImage(turret,400,300,100,100,null);

    }
    public void turretHit()
    {
        System.out.println("Turret hit and destroyed");
        //needs implmentation
    }

}
