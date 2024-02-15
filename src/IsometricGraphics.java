import javax.swing.*;

public class IsometricGraphics {
    public IsometricGraphics()
    {
        JFrame frame = new JFrame();
        frame.setSize(900,1200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.drawTri1();
        frame.add(panel);
        frame.setVisible(true);

    }
}

