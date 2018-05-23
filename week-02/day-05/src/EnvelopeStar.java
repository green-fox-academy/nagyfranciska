import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    int center = WIDTH/2;
    int width = WIDTH;
    int step = 10;  // change for less/more density
    int x1 = 0;
    int y2 = center - step;

    for (int i = 0; i < center/step; i++) {
      graphics.drawLine(x1, center, center, y2);  //first quarter
      x1 += step;
      y2 -= step;
    }

    y2 = center - step;
    for (int i = 0; i < center/step; i++) {
      graphics.drawLine(width, center, center, y2);  //second quarter
      width -= step;
      y2 -= step;
    }

    x1 = 0;
    y2 = center + step;
    for (int i = 0; i < center/step; i++) {
      graphics.drawLine(x1, center, center, y2);  //third quarter
      x1 += step;
      y2 += step;
    }

    width = WIDTH;
    y2 = center + step;
    for (int i = 0; i < center/step; i++) {
      graphics.drawLine(width, center, center, y2); //forth quarter
      width -= step;
      y2 += step;
    }
  }

  static int WIDTH = 400;
  static int HEIGHT = 400;

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