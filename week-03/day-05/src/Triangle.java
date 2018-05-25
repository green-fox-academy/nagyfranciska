import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {

    int canvasSize = HEIGHT;
    int x = 0;
    int y = 0;

    int[] xCoordinates = {x, x + canvasSize, canvasSize/2};
    int[] yCoordinates = {y, y, canvasSize};

    graphics.drawPolygon(xCoordinates, yCoordinates, 3);
    fractalTriangle(graphics, x, y, canvasSize);
  }

  private static void fractalTriangle(Graphics graphics, int x, int y, int size) {

    int[] xFirst = {x, size/2, size/4};
    int[] yFirst = {y, y, size/2};

    int[] xSec = {size/2, size, 3 * size/4};
    int[] ySec = {y, y, size/2};

    int[] xThird = {size/4, 3 * size/4, size/2};
    int[] yThird = {size/2, size/2, size};

    graphics.drawPolygon(xFirst, yFirst, 3);
    graphics.drawPolygon(xSec, ySec, 3);
    graphics.drawPolygon(xThird, yThird, 3);

      if (size > 10) {

        fractalTriangle(graphics, x, y, size/2/2);
      //  fractalTriangle(graphics, x, y, size/2);
      //  fractalTriangle(graphics, x + size/3, y + 2 * size/3, size/3);

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