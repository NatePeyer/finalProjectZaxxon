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
        for(int i = 0; i < fuel.length; i++)
        {
            int num = i++;
            fuel[i]  = new Fuelbar(g,x,y,2,height,num);
            x += 2;
            if(num%2 == 0)
            {
                y++;
                height-=2;
                if(num%8==0)
                {
                    height = 20;
                }
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
