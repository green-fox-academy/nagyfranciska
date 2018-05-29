import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lines {
  public static void mainDraw(Graphics graphics) {

    int x = WIDTH / 4;
    int y = WIDTH / 2;
    int lenght = 250;
    fractal(graphics, x, y, lenght);

  }

  static void fractal(Graphics graphics, int x, int y, int lenght) {
    if (lenght > 1) {
      graphics.drawLine(x, y, x + lenght, y);
      y += 20;
      fractal(graphics, x, y, lenght / 3);
      fractal(graphics, x + lenght * 2 / 3, y, lenght / 3);
    }
  }




  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new Lines.ImagePanel());
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