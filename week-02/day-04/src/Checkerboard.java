import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int x = 0;
    int y = 0;
    int width = 25;

    for (int i = 0; i < 8; i++) {                               // number of row (repeat 8 times = 8x8 field)
      for (int j = 0; j < 8; j++) {                               // number of columns (repeat 8 times = 1 full column)
        if (j % 2 == 0) {                                           // if columns index is even
          if (i % 2 == 0) {                                             // and row index is even   --> paint it black
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, width, width);
          } else {                                                      // --> otherwise white
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x, y, width, width);
          }
        } else {                                                    // or else if columns index is odd
          if (i % 2 == 0) {                                             // and row index is even   --> be white
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x, y, width, width);
          } else {                                                      // or else row index is odd  --> paint black
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, width, width);
          }
        }
        x += width;                     // after each square, it jumps next to it to the right (giving a full line))
      }
      y += width;                       // sets starting point to the next line below,
      x = 0;                            // sets starting point to the left side to start the next line from there
    }

  }

  // Don't touch the code below
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
