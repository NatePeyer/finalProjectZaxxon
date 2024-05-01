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
    public laserbeam()
    {
        System.out.println("laser made");
    }

    public void movelaserBeam(Graphics g, int xIn, int yIn, int key)
    {
        int pressed = 0;
        int count = 0;
        if(key == 47)
        {
            System.out.println("blasting lasers");
            pressed++;
            int x = xIn + x2;
            int y = yIn + y2;
            Image laserBeam = null;
            try {
                File pathToFile = new File("Pictures/zaxxonLaserbeam-removebg-preview.png");
                laserBeam = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(laserBeam, x, y, null);
            x2 += 5;
            y2 -= 2;

            if (x > 600 || y < 0) {
                System.out.println("reseting laser");
                x = xIn;
                x2 = 105;
                y = yIn;
                y2 = 45;

            }
        }
        else
        {
            if(pressed > 0) {
                if (this.hasNotCollided(800, 1000)) {
                    x = xIn + x2;
                    y = yIn + y2;
                    Image laserBeam = null;
                    try {
                        File pathToFile = new File("Pictures/zaxxonLaserbeam-removebg-preview.png");
                        laserBeam = ImageIO.read(pathToFile);
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    g.drawImage(laserBeam, x, y, null);
                    x2 += 5;
                    y2 -= 2;

                    if (x > 600 || y < 0) {
                        System.out.println("reseting laser");
                        x = xIn;
                        x2 = 105;
                        y = yIn;
                        y2 = 45;
                        pressed = 0;
                    }
                }
            }
        }
    }

    public boolean hasNotCollided(int xIn,int yIn)
    {
        if(x == xIn || y == yIn)
        {
            System.out.println("hit target destoryed");
            return false;
        }
        else
        {
            return true;
        }
    }
}
