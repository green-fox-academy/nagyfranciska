public class DiagonalMatrix {
  public static void main(String[] args) {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    int[][] matrix = new int[4][4];

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        if (row == column) {
          matrix[row][column] = 1;
          System.out.print(matrix[row][column] + " ");
        } else {
          matrix[row][column] = 0;
          System.out.print(matrix[row][column] + " ");
        }
      }
      System.out.println(" ");
    }

  }
}

