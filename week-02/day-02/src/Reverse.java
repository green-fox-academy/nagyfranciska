public class Reverse {
  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverse(reversed));
  }
  public static String reverse (String textToBack){
    String text = "";
    for(int i=textToBack.length() -1;i>=0;i--) {
      text = text + textToBack.charAt(i);
    }
    return text;

  }
}
