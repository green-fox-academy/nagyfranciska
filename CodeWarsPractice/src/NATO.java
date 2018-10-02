import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NATO {
    public static void main(String[] args) {

//        UNFINISHED, NOT PUNCTUATIONS YET

//        Create NATO alphabet sentences from the Strings.
//        Keep the punctuation, and remove the spaces.
//        Use Xray without dash or space.


        String s1 = "Hey Jude, how are you?";
        String s2 = "Good! Xoxo!";

        System.out.println(speakNATO(s1));
        System.out.println(speakNATO(s2));
    }

    public static String speakNATO(String string) {

        List<String> alphabet = new ArrayList<>(Arrays.asList("Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu"));
        char[] specChars = {',','.', '!', '?', ':'};
        List<String> sentence = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            String a = Character.toString(string.charAt(i)).toUpperCase();
            for (int j = 0; j < alphabet.size(); j++) {
                if (Character.toString(alphabet.get(j).charAt(0)).equals(a)) {
                    sentence.add(alphabet.get(j));
                }
            }
        }
        return String.join(" ", sentence);
    }
}
