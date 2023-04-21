package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Swing {
    public static void main(String[] args) {
        JFrame jframe = getFrame();
        jframe.add(new MyComponent());
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for(String s: fonts)
//        {
//            System.out.println(s);
//        }
    }
    static class MyComponent extends JComponent
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            Font font = new Font("Calibri Light", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
            g2.drawString("Say my name: ", 50, 50);
            Point2D p1 = new Point2D.Float(70, 70);
            Point2D p2 = new Point2D.Float(160, 80);
            Line2D l2 = new Line2D.Float(p1, p2);
            g2.draw(l2);
            Ellipse2D el = new Ellipse2D.Float(70, 70, 160, 80);
            g2.setPaint(new Color(70, 70, 150));
            g2.fill(el);
        }
    }
    static JFrame getFrame()
    {
        JFrame jframe = new JFrame(){};
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        jframe.setSize(500, 300);
//        jframe.setLocation(300, 500);
//        jframe.setBounds(800, 500, 500, 300);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jframe.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jframe.setTitle("this is my message");
        return jframe;
    }
}