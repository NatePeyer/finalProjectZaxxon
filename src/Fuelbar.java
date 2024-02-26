import java.awt.*;

public class Fuelbar
{
    protected int fuelRemaining = 128;
    public Fuelbar(Graphics g2)
    {
// 16 triangles made up of lines
        // each made up of 8 lines starting yellow changing to orange and repeating
        //two in a pair are same size
        g2.setColor(Color.YELLOW);
        g2.fillRect(100,740,2,20);
        //1
        g2.setColor(Color.red);
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
        //8
    }
}
