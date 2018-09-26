public class CamelCase {
    public static void main(String[] args) {

//      Capitalize Every Word Of A String!

        System.out.println(toJadenCase("Here is an example sentence, let's see if it works on it."));
    }

    public static String toJadenCase(String phrase) {

        String jadenCase = "";

        if (phrase == null || phrase == "") {
            return null;
        } else {
            for (String word : phrase.split(" ")) {
                jadenCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return jadenCase.substring(0, jadenCase.length() - 1);
    }
}
