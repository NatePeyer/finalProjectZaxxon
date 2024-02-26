import java.awt.*;

public class Fuelbar
{
    protected int fuelRemaining = 128;
    protected int timeThrough = 0;
    public Fuelbar(Graphics g2, int x, int y, int width, int height, int num)
    {
        timeThrough++;
        if(num%2 == 0)
        {
            g2.setColor(Color.ORANGE);
        }
        else
        {
            g2.setColor(Color.YELLOW);
        }
        if (timeThrough == 2)
        {
            timeThrough = 0;
            y += 2;
            height -= 4;

        }
        if(num%8 == 0)
        {
            y = 740;
        }


        // 16 triangles made up of lines
        // each made up of 8 lines starting yellow changing to orange and repeating
        //two in a pair are same size
        //g2.setColor(Color.YELLOW);
        g2.fillRect(x,y,width,height);
        //1
        /*g2.setColor(Color.red);
        g2.fillRect(102,740,2,20);
        //2
        g2.setColor(Color.yellow);
        g2.fillRect(104,742,2,16);
        //3
        g2.setColor(Color.red);
        g2.fillRect(106,742,2,16);
        //4
        g2.setColor(Color.yellow);
        g2.fillRect(108,744,2,12);
        //5
        g2.setColor(Color.red);
        g2.fillRect(110,744,2,12);
        //6
        g2.setColor(Color.yellow);
        g2.fillRect(112,746,2,8);
        //7
        g2.setColor(Color.red);
        g2.fillRect(114,746,2,8);
        //8*/
    }
}
