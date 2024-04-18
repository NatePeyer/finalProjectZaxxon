import javax.swing.*;

public class IsometricGraphics {
    public IsometricGraphics()
    {
        JFrame frame = new JFrame();
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);

    }
}

