import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics){

    int step = WIDTH/18;   // change this for more/less density

    int x1 = 5;
    int y1 = HEIGHT/10;
    int x2 = x1 + step;
    int y2 = HEIGHT - x1;

    for (int i = 1; i < (WIDTH - x1)/step; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(x1, y1, x2, y2);
      y1 += step;
      x2 += step;
    }

    x1 = WIDTH/10;
    y1 = 5;
    x2 = WIDTH - y1;
    y2 = y1 + step;

    for (int i = 1; i <(HEIGHT - y1)/step; i++) {
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(x1, y1, x2, y2);
      x1 += step;
      y2 += step;

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
