import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {
    protected Fuelbar[] fuel = new Fuelbar[128];
    protected  int x = 100;
    protected int y = 740;
    protected int height = 20;
    protected int key;
    Spaceship ship = new Spaceship();
    IsometricTriangleTop tri1 = new IsometricTriangleTop();
    IsometricTriangleBottom tri2 = new IsometricTriangleBottom();

    public MyPanel()
    {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                key = e.getKeyCode();
                System.out.println("key pressed");
            }
        });
        System.out.println("panel created");
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        tri1.drawTriTop(g);
        tri2.drawTriBottom(g);
        ship.drawSpaceship(g,key);
        key = -1;
        g.setColor(Color.BLACK);
        g.fillRect(0,700,600,100);
        //Still not drawing triangles right
        int x = this.x;
        int y = this.y;
        int height = 20;
        g.setColor(new Color(191,170,0,255));
        for(int i = 0; i < fuel.length; i++)
        {
            g.fillRect(x,y,3,height);
            //fuel[i]  = new Fuelbar(g,x,y,2,height,num);
            //System.out.println(x);
            //System.out.println(y);
           // System.out.println(height);
           // System.out.println(i);
            //System.out.println();
            x += 3;
            if(i%2 == 0)
            {
                g.setColor(new Color(223,47,0,255));
                //rgba(223,57,0,255)
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
                g.setColor(new Color(191,170,0,255));
                //rgba(191,170,0,255)
            }
        }

        //Fuelbar bar = new Fuelbar(g, 100,740,2,20,1);
        try
        {
            Thread.sleep(50);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        repaint();
    }



}
