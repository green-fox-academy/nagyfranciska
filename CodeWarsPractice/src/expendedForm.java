import java.util.ArrayList;
import java.util.List;

public class expendedForm {
    public static void main(String[] args) {

//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

        int num1 = 70304;
        int num2 = 42;
        System.out.println(expandedForm(num1));
        System.out.println(expandedForm(num2));
    }

    public static String expandedForm(int num) {
        String number = Integer.toString(num);
        List<String> numbersAsString = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            if (!Character.toString(number.charAt(i)).equals("0")) {
                String temp = Character.toString(number.charAt(i));
                for (int j = 0; j < number.length() - 1 - i; j++) {
                    temp += "0";
                }
                numbersAsString.add(temp);
            }
        }
        String expForm = String.join(" + ", numbersAsString);
        return expForm;
    }
}
