import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics){



    int baseNumber = 15;
    int center = WIDTH/2;
    int size = 30;

    int x1 = center - size/2;
    int x2 = center;
    int x3 = center + size/2;

    int y1 = size;
    int y2 = 0;
    int y3 = size;

    for (int i = 0; i < 2; i++) {

      int[] xPoints = {x1, x2, x3};
      int[] yPoints = {y1, y2, y3};
      graphics.drawPolygon(xPoints, yPoints, 3);

      x1 = x1 - size/2;
      x2 = x1 - size/2;
      x3 = x1 - size/2;

      y1 =  y1 + size;
      y2 =  y1 + size;
      y3 =  y1 + size;

    }

  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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