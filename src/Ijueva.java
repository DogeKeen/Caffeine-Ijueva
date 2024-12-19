import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Ijueva extends JFrame {
    public Ijueva(int width, int height, KeyListener listener) {
        setSize(width, height);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        System.out.println(">> Window has been generated and loaded for user to see.\n");

        addKeyListener(listener);
    }


    public void clearFrame(Graphics window, String area) {
        Graphics2D cls = (Graphics2D) window.create();

        if (area.equalsIgnoreCase("Window")) {
            cls.setStroke(new BasicStroke(1));
            cls.setColor(Color.BLACK);
            cls.fillRect(0, 0, 840, 580);
            if (Caffeine.debugInfo) {
                System.out.println(">> Screen cleared.\n");
            }
        } else if (area.equalsIgnoreCase("Dialogue")) {
            cls.setStroke(new BasicStroke(1));
            cls.setColor(Color.BLACK);
            cls.fillRect(54, 334, 718, 188);
            if (Caffeine.debugInfo) {
                System.out.println(">> Dialogue box cleared.\n");
            }
        } else if (area.equalsIgnoreCase("Options")) {
            cls.setStroke(new BasicStroke(1));
            cls.setColor(Color.BLACK);
            cls.fillRect(417, 164, 354, 162);
            if (Caffeine.debugInfo) {
                System.out.println(">> Options box cleared.\n");
            }
        } else if (area.equalsIgnoreCase("Menu")) {
            cls.setStroke(new BasicStroke(1));
            cls.setColor(Color.BLACK);
            cls.fillRect(150, 200, 700, 300);
            if (Caffeine.debugInfo) {
                System.out.println(">> Menu options cleared.\n");
            }
        }

    }

}
