import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    protected Fuelbar[] fuel = new Fuelbar[128];
    protected  int x = 100;
    protected int y = 740;
    protected int height = 20;

    public MyPanel()
    {
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        IsometricTriangleTop tri1 = new IsometricTriangleTop(g);
        IsometricTriangleBottom tri2 = new IsometricTriangleBottom(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,700,600,100);
        //Still not drawing triangles right
        int x = this.x;
        int y = this.y;
        int height = 20;
        g.setColor(Color.BLUE);
        for(int i = 0; i < fuel.length; i++)
        {
            g.fillRect(x,y,2,height);
            //fuel[i]  = new Fuelbar(g,x,y,2,height,num);
            System.out.println(x);
            System.out.println(y);
            System.out.println(height);
            System.out.println(i);
            System.out.println();
            x += 3;
            if(i%2 == 0)
            {
                g.setColor(Color.ORANGE);
                y++;
                height-=2;
                if(i%8==0)
                {
                    height = 20;
                    y = this.y;
                }
            }
            else
            {
                g.setColor(Color.BLUE);
            }
        }

        //Fuelbar bar = new Fuelbar(g, 100,740,2,20,1);
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        repaint();
    }



}
