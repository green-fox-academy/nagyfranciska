import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static void main(String[] args) {

//      Reverse words with 5 or more characters in string

        System.out.println(spinWords3("This is definitely longer then necessary"));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        String temp = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 5 && i < words.length - 1) {
                result = result + words[i] + " ";
            }   else if (words[i].length() < 5) {
                result = result + words[i];
            }   else if (words[i].length() >= 5 && i < words.length - 1) {
                temp = new StringBuilder(words[i]).reverse().toString();
                result = result + temp + " ";
            }   else {
                temp = new StringBuilder(words[i]).reverse().toString();
                result = result + temp;
            }
        }
        return result;
    }

    public static String spinWords2(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    public static String spinWords3(String sentence) {
        return Arrays.stream(sentence.split(" "))
            .map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word)
            .collect(Collectors.joining(" "));
    }

    public static String spinWords4(String sentence) {
        for (String word : sentence.split(" ")) {
            if (word.length() > 4) {
                sentence = sentence.replace(word, new  StringBuffer(word).reverse());
            }
        }
        return sentence;
    }
}
