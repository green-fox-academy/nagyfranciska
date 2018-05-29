import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  public static void mainDraw(Graphics graphics) {

    int x = WIDTH / 2;
    int y = WIDTH / 10;
    int lenght = 50;
    fractal(graphics, x, y, lenght);

  }

  static void fractal(Graphics graphics, int x, int y, int lenght) {
    if (lenght > 20) {
      graphics.drawLine(x, y, x, y - lenght);

      fractal(graphics, x, y, lenght);
      fractal(graphics, );
      fractal(graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new Triangle.ImagePanel());
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