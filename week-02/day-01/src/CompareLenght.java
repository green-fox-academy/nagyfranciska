public class CompareLenght {
  public static void main(String[] args) {

    int[] p1 = new int[]{1, 2, 3};
    int[] p2 = new int[]{4, 5};


    if (p1.length > p2.length) {
      System.out.println("p1 has more element than p2");
    } else {
      System.out.println("p2 has more element than p1");
    }
  }

}