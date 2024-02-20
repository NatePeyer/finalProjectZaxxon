import javax.swing.*;

public class IsometricGraphics {
    public IsometricGraphics()
    {
        JFrame frame = new JFrame();
        frame.setSize(900,1200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        panel.drawTri1(panel.getGraphics());
        frame.add(panel);
        frame.setVisible(true);

    }
}

