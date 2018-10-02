import java.util.ArrayList;
import java.util.List;

public class PigLatin {
    public static void main(String[] args) {

//        Move the first letter of each word to the end of it,
//        then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !

        String s = "Pig latin is cool";
        String r = "Hello world !";

        System.out.println(pigLatin(s));
        System.out.println(pigLatin(r));
        System.out.println(pigIt(s));
        System.out.println(pigIt(r));
    }

    public static String pigLatin(String string) {

        List<String> piggy = new ArrayList<>();
        for (String word : string.split(" ")) {
            if (word.matches("[!,:;?]")) {
                piggy.add(word);
            } else {
                piggy.add(word.substring(1) + word.substring(0, 1) + "ay");
            }
        }
        return String.join(" ", piggy);
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
