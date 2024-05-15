import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class laserbeam
{
    private int x2 = 105;
    private int y2 = 45;
    private int x;
    private int y;
    private int tempX;
    private int tempY;
    private boolean pressed;
    private boolean wasHit = false;
    private boolean start = false;
    private Image laserBeam;
    public laserbeam(int xIn, int yIn)
    {
        x = -1;
        y = -1;
        tempX = xIn;
        tempY = yIn;
        System.out.println("laser made");
        laserBeam = null;
        try 
        {
            File pathToFile = new File("../Pictures/zaxxonLaserbeam-removebg-preview.png");
            laserBeam = ImageIO.read(pathToFile);
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }

    }

    public void startLaser(int key, Spaceship ship)
    {
        System.out.println("start laser called");
        System.out.println("shooting lasers");
        x = ship.getX();
        y = ship.getY();
        tempX = ship.getX();
        tempY = ship.getY();
        x2 = 105;
        y2 = 45;
        pressed = true;
        start = true;
    }

    public void movelaserBeam(Graphics g, int key, Spaceship ship)
    {
        if(!pressed)
        {
            x += x2;
            y += y2;
        }
        if(start)
        {
            wasHit = false;
            System.out.println("blasting lasers");
            pressed = true;
            g.drawImage(laserBeam, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x + 3,y,25,25);
            x2 += 5;
            y2 -= 2;

            if (x > 600 || y < 0) 
            {
                System.out.println("rearming laser");
                x = ship.getX();
                x2 = 105;
                y = ship.getY();
                y2 = 45;
                pressed = false;
            }
            start = false;
        }
        else
        {
            if(pressed) {
                if (this.hasNotCollided(800, 1000) && !wasHit) {
                    x = tempX + x2;
                    y = tempY + y2;
                    System.out.println("still blasting lasers");
                    g.drawImage(laserBeam, x, y, null);
                    //g.setColor(Color.RED);
                    //g.drawRect(x + 3,y,25,25);
                    x2 += 5;
                    y2 -= 2;

                    if (x > 600 || y < 0) {
                        System.out.println("rearming laser");
                        x = ship.getX();
                        x2 = 105;
                        y = ship.getY();
                        y2 = 45;
                        pressed = false;
                    }
                }
            }
        }
    }

    public boolean hasNotCollided(int xIn,int yIn)
    {
        if(x == xIn || y == yIn)
        {
            System.out.println("hit, target destoryed");
            return false;
        }
        else
        {
            return true;
        }
    }

    public void laserHit(Spaceship ship)
    {
        System.out.println("laser hit method running");
        //x = ship.getX();
        //y = ship.getY();
        //tempX = ship.getX();
        //tempY = ship.getY();
        //x2 = 105;
        //y2 = 45;
        System.out.println("pressed reset 1");
        pressed = false;
        wasHit = true;
    }

    //get methods
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
