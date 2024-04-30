import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class laserbeam
{
    private int x2 = 105;
    private int y2 =45;
    public laserbeam()
    {
        System.out.println("laser made");
    }

    public void movelaserBeam(Graphics g, int xIn, int yIn)
    {
        int x = xIn + x2;
        int y = yIn + y2;
        Image laserBeam = null;
        try
        {
            File pathToFile = new File("Pictures/zaxxonLaserbeam-removebg-preview.png");
            laserBeam = ImageIO.read(pathToFile);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        g.drawImage(laserBeam,x,y,null);
        x2+=5;
        y2-=5;
    }
}
