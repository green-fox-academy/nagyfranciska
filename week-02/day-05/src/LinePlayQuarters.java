import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics){

    int div = WIDTH/2;
    int center = div;
    int step = div/15;   // change this for more/less density

    int x1 = 5;
    int y1 = div/15;
    int x2 = x1 + step;
    int y2 = div - x1;

    int g = x1;
    int f = y1;

    for (int i = 0; i < 2; i++) {

      for (int j = 0; j < (div - g)/step; j++) {         //draws green pattern
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x1, y1, x2, y2);
        y1 += step;
        x2 += step;
        }
      x1 = div/10;                                         // reset coordinates for magenta pattern
      y1 = 5;
      x2 = div - y1;
      y2 = y1 + step;

      for (int k = 0; k <(div - f)/step; k++) {         // draws magenta pattern
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x1, y1, x2, y2);
        x1 += step;
        y2 += step;
      }
      x1 = div + 5;
      y1 = div/15;
      x2 = x1 + step;
      y2 = div - 5;
    }
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new LinePlayQuarters.ImagePanel());
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

