import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Turret
{
    protected int x;
    protected int y;
    private int count = 0;
    private int score = 0;
    private Image turret = null;
    private boolean hadBeenHit = false;

    public Turret(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
        System.out.println("Turret Created");
    }

    public void turretHit(laserbeam beam, Graphics g, Spaceship ship)
    {
        boolean xInHit = ((beam.getX() >= x +10) && (beam.getX() <= x + 90));
        boolean yInHit = ((beam.getY() >= y + 10) && (beam.getY() <= y +90));
        if(xInHit && yInHit || hadBeenHit)
        {
            hadBeenHit = true;
            beam.laserHit(ship);
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
            g.drawImage(kabomb,x,y,100,100,null);

            try
            {
                File pathToFile = new File("Pictures/zaxxonKabom2.png");
                kabomb = ImageIO.read(pathToFile);
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(kabomb,x,y,100,100,null);
            turret = null;
            count++;
        }
        else
        {
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
                g.drawImage(turret, x, y, 100, 100, null);
                g.setColor(Color.RED);
                g.drawRect(x + 10, y + 10, 80, 80);
                hadBeenHit = false;
            }
        }
        if(count == 100)
        {
            count = 0;
            score ++;
            System.out.println("Your is now " + score + " after that hit.");
            System.out.println("Turret respawing");
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
                g.drawImage(turret, x, y, 100, 100, null);
                g.setColor(Color.RED);
                g.drawRect(x + 10, y + 10, 80, 80);
                hadBeenHit = false;
            }
        }
    }

}
