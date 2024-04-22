import java.awt.*;

public class Fuelbar
{
    protected static int fuelRemaining = 128;
    protected static int timeThrough = 0;
    public Fuelbar(Graphics g2, int x, int y, int width, int height, int num)
    {
        g2.fillRect(x,y,width,height);
    }

    public static void usingFuel()
    {
        timeThrough++;
        fuelRemaining--;
    }

    public static void addFuel()
    {
        fuelRemaining += 64;
        if(fuelRemaining > 128)
        {
            fuelRemaining = 128;
        }
        timeThrough -= 64;

        if(timeThrough < 0)
        {
            timeThrough = 0;
        }
    }

    public static int getTimeThrough()
    {
        return timeThrough;
    }

    public static int getFuelRemaining()
    {
        return fuelRemaining;
    }
}
