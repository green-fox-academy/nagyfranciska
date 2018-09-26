public class Troll {
    public static void main(String[] args) {

//      Take out all vowels from string

        System.out.println(disemvowel("This is a troll message, let me see how it works."));
    }

    public static String disemvowel(String str) {
        str = str.replaceAll("(?i)[aeiou]", "");
        return str;
    }
}
