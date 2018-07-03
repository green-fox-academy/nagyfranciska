public class Poker {
  public static void main(String[] args) {

    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "8C", "AH"};

    getHighestCard(black, white);

  }

  public static void getHighestCard(String[] black, String[] white) {
    int tempB = 0;
    int tempW = 0;
    String cardB = "";
    String cardW = "";

    for (String card : black) {
      cardB = card.substring(0, 1);
      try {
        if (Integer.parseInt(cardB) > tempB) {
          tempB = Integer.parseInt(cardB);
        }
      } catch (NumberFormatException e) {
        if (cardB.equals("T")) {
          tempB = 10;
        } else if (cardB.equals("J")) {
          tempB = 11;
        } else if (cardB.equals("D")) {
          tempB = 12;
        } else if (cardB.equals("K")) {
          tempB = 13;
        } else {
          tempB = 14;
        }
      }
    }

    for (String card : white) {
      cardW = card.substring(0, 1);
      try {
        if (Integer.parseInt(cardW) > tempW) {
          tempW = Integer.parseInt(cardW);
        }
      } catch (NumberFormatException e) {
        if (cardW.equals("T")) {
          tempW = 10;
        } else if (cardW.equals("J")) {
          tempW = 11;
        } else if (cardW.equals("D")) {
          tempW = 12;
        } else if (cardW.equals("K")) {
          tempW = 13;
        } else {
          tempW = 14;
        }
      }
    }
    if (tempB > tempW) {
      System.out.println("Black wins with a(n) " + cardB + "!");
    } else {
      System.out.println("White wins with a(n) " + cardW + "!");
    }
  }

  public static void getFlush(String[] black, String[] white) {
    String cardB = black[0].substring(1);
    String cardW = white[0].substring(1);

    for (String card : black) {
      if (card.substring(1).equals(cardB)) {
        continue;
      }
    }


  }

}
