public class RealCamelCase {
    public static void main(String[] args) {

//      Convert String to CamelCase
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_stealth_warrior"));
    }

    static String toCamelCase(String s) {
        String camelCase = "";
        String[] arr = s.split("[-/_*?!@|]");

        if (s == null) {
            return null;
        } else if (s == "") {
            return camelCase;
        } else {
            camelCase += arr[0];
            for (int i = 1; i < arr.length; i++) {
                camelCase += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            }
            return camelCase;
        }
    }
}
