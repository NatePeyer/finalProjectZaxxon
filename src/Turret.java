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
        System.out.println("Turret Created");
    }

    public void moveTurret(Graphics g, laserbeam beam)
    {
        boolean xInHit = ((beam.getX() >= 410) && (beam.getX() <= 490));
        boolean yInHit = ((beam.getY() >= 310) && (beam.getY() <= 390));
        Image turret = null;
        try
        {
            File pathToFile = new File("Pictures/zaxxonSprites_1_-removebg-preview.png");
            turret = ImageIO.read(pathToFile);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }

        if(!(xInHit && yInHit))
        {
            g.drawImage(turret, 400, 300, 100, 100, null);
            g.setColor(Color.RED);
            g.drawRect(400 + 10, 300 + 10, 80, 80);
        }

    }
    public void turretHit(laserbeam beam, Graphics g)
    {
        boolean xInHit = ((beam.getX() >= 410) && (beam.getX() <= 490));
        boolean yInHit = ((beam.getY() >= 310) && (beam.getY() <= 390));
        if(xInHit && yInHit)
        {
            System.out.println("Turret hit and destroyed" + "\nRespawning in 5 seconds");
            Image kabomb = null;
            try
            {
                File pathToFile = new File("Pictures/zaxxonKabom.png");
                kabomb = ImageIO.read(pathToFile);
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(kabomb,400,300,100,100,null);

            try
            {
                File pathToFile = new File("Pictures/zaxxonKabom2.png");
                kabomb = ImageIO.read(pathToFile);
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(kabomb,400,300,100,100,null);

        }
    }

}
