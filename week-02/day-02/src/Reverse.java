public class Reverse {
  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    String backTo = new StringBuffer(reversed).reverse().toString();
    System.out.println(backTo);


    //or as it should have been:

    reverse(reversed);

  }
  public static String reverse (String textToBack){
    char[] text = textToBack.toCharArray();
    for(int i=text.length-1;i>=0;i--) {
      System.out.print(text[i]);
    }
    return textToBack;

  }
}
