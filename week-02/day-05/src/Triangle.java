import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics){

    int pyramidSize = 4;
    int xStep = 25;
    int yStep = 50;
    int x1 = 125;
    int x2 = x1 + xStep;
    int x3 = x2 + xStep;
    int y1 = 100;
    int y2 = 50;
    int y3 = y1;

    for (int i = 1; i < pyramidSize + 1; i++) {
      int[] xCoordinates = {x1, x2, x3};
      int[] yCoordinates = {y1, y2, y3};
      int points = 3;
      graphics.drawPolygon(xCoordinates, yCoordinates, points);
      for (int j = 0; j < i; j++) {
        x1 -= yStep;
        graphics.drawPolygon(xCoordinates, yCoordinates, points);
      }
      x1 = 125 + xStep * i;
      x2 = x1 + xStep;
      x3 = x2 + xStep;
      y1 += yStep;
      y2 += yStep;
      y3 += yStep;
    }

// draw hexagon:
//    int[] xCoordinates = {10, 30, 50, 50, 30, 10};
//    int[] yCoordinates = {20, 10, 20, 40, 50, 40};
//    int points = 6;
//    graphics.drawPolygon(xCoordinates, yCoordinates, points);

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