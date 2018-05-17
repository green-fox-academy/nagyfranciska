import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    // Draw a box that has different colored lines on each edge.

    graphics.setColor(new Color(80,50,200));
    graphics.drawLine(50,50,150,50);

    graphics.setColor(new Color(250,240,0));
    graphics.drawLine(150,50,150,200);

    graphics.setColor(new Color(250,65,155));
    graphics.drawLine(150,200,50,200);

    graphics.setColor(new Color(120,250,70));
    graphics.drawLine(50,200,50,50);



  }
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
