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
    public laserbeam()
    {
        System.out.println("laser made");
    }

    public void movelaserBeam(Graphics g, int xIn, int yIn, int key)
    {
        if(!pressed)
        {
            tempX = xIn;
            tempY = yIn;
            x = xIn + x2;
            y = yIn + y2;
        }
        if(key == 47)
        {
            System.out.println("blasting lasers");
            pressed = true;
            Image laserBeam = null;
            try {
                File pathToFile = new File("Pictures/zaxxonLaserbeam-removebg-preview.png");
                laserBeam = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(laserBeam, x, y, null);
            g.setColor(Color.RED);
            g.drawRect(x + 3,y,25,25);
            x2 += 5;
            y2 -= 2;

            if (x > 600 || y < 0) {
                System.out.println("rearming laser");
                x = xIn;
                x2 = 105;
                y = yIn;
                y2 = 45;
                pressed = false;
            }
        }
        else
        {
            if(pressed) {
                if (this.hasNotCollided(800, 1000)) {
                    x = tempX + x2;
                    y = tempY + y2;
                    System.out.println("still blasting lasers");
                    Image laserBeam = null;
                    try {
                        File pathToFile = new File("Pictures/zaxxonLaserbeam-removebg-preview.png");
                        laserBeam = ImageIO.read(pathToFile);
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    g.drawImage(laserBeam, x, y, null);
                    g.setColor(Color.RED);
                    g.drawRect(x + 3,y,25,25);
                    x2 += 5;
                    y2 -= 2;

                    if (x > 600 || y < 0) {
                        System.out.println("rearming laser");
                        x = xIn;
                        x2 = 105;
                        y = yIn;
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

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
