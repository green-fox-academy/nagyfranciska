public class Scramblies {
    public static void main(String[] args) {

//        Complete the function scramble(str1, str2) that returns true
//        if a portion of str1 characters can be rearranged to match str2,
//        otherwise returns false.
//
//        Only lower case letters will be used (a-z). No punctuation or digits will be included.
//        Performance needs to be considered
//
//        Examples
//
//        scramble('rkqodlw', 'world') ==> True
//        scramble('katas', 'steak') ==> False

        String t1 = "rkqodlw";
        String t2 = "world";

        String f1 = "aagdlla";
        String f2 = "attila";

        System.out.println(scramble(t1, t2));
        System.out.println(scramble(f1, f2));

    }

    public static boolean scramble(String str1, String str2) {

        char[] arr = str2.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int index = str1.indexOf(arr[i]);
            if (index < 0) {
                return false;
            }
            str1 = str1.substring(0, index) + str1.substring(index + 1);
        }
        return true;
    }

    public static boolean scramble2(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s)) {
                return false;
            }
            str1 = str1.replaceFirst(s,"");
        }
        return true;
    }
}
