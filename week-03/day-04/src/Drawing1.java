import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {
  public static void mainDraw(Graphics graphics) {

    int canvasSize = HEIGHT;

    drawRecursive(graphics, 0, 0, canvasSize);
  }

  private static void drawRecursive(Graphics graphics, int x, int y, int size) {

      graphics.drawRect(x, y + size/3, size/3, size/3);
      graphics.drawRect(x + size/3, y, size/3, size/3);
      graphics.drawRect(x + size/3, y + 2 * size/3, size/3, size/3);
      graphics.drawRect(x + 2 * size/3, y + size/3, size/3, size/3);

      if (size > 10) {

      drawRecursive(graphics, x, y + size/3, size/3);
      drawRecursive(graphics, x + size/3, y, size/3);
      drawRecursive(graphics, x + size/3, y + 2 * size/3, size/3);
      drawRecursive(graphics, x + 2 * size/3, y + size/3, size/3);

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