import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {

    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

    for (int i = 0; i < 3; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter starting 'x' coordinate: ");
      int userX = scanner.nextInt();
      System.out.println("Enter starting 'y' coordinate: ");
      int userY = scanner.nextInt();

      Center(userX, userY, graphics);
    }
  }

  public static void Center(int userX, int userY, Graphics graphics){
    int x1 = userX;
    int y1 = userY;
    int x2 = 160;
    int y2 = 160;
    graphics.drawLine(x1, y1, x2, y2);
  }



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

