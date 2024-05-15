import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Spaceship {
    protected int x = 50;
    protected int y = 400;

    public Spaceship(Graphics g) {
        //need to find a good picture of the spaceship, and then figure out how to set its start postion
        // up and down arrow keys impact y axis
        //left and right move side to side this get hard with iso
        // /-key is shot

    }

    public Spaceship()
    {
        System.out.println("Spaceship Created");
    }

    public void drawSpaceship(Graphics g, int key)
    {
        //37 left arrow
        //38 up arrow
        //39 right arrow
        //40 down arrow
        //47 slash key
        if(key == 38)
        {
            System.out.println("up arrow pressed");
            y-=5;
            Image spaceship = null;
            try {
                File pathToFile = new File("../Pictures/spaceshipUp.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x,y+20,110,100);
            //implmentation to devlope for moving up
        } else if (key == 40)
        {
            System.out.println("down arrow pressed");
            y+=5;
            Image spaceship = null;
            try {
                File pathToFile = new File("../Pictures/spaceShipDownTwo.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x,y+20,110,100);
            //implmentation to devlope for moving down
        } else if (key == 37)
        {
            System.out.println("left arrow pressed");
            x-=5;
            Image spaceship = null;
            try {
                File pathToFile = new File("../Pictures/fpZaxxonFlyingShipOne.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x,y+20,110,100);
            //implmentation to devlop for moving to the left
        } else if (key == 39)
        {
            System.out.println("right arrow pressed");
            x+=5;
            Image spaceship = null;
            try {
                File pathToFile = new File("../Pictures/fpZaxxonFlyingShipOne.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x,y+20,110,100);
            // implmentation to devlop for moving to the right
        }
        else
        {
            Image spaceship = null;
            try {
                File pathToFile = new File("../Pictures/fpZaxxonFlyingShipOne.Png");
                spaceship = ImageIO.read(pathToFile);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            g.drawImage(spaceship, x, y, null);
            //g.setColor(Color.RED);
            //g.drawRect(x,y+20,110,100);
        }
        if(x < 0)
        {
            x += 5;
        }
        if(600 < (x + 110))
        {
            x -= 5;
        }
        if(y + 15 < 0)
        {
            y += 5;
        }
        if((y +120) > 700)
        {
            y -= 5;
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
