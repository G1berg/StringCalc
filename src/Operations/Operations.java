package Operations;

import Exceptions.MultipyException;
import Exceptions.WrongNumberException;

public class Operations {
    public static void stringDivide(String left, String divider) throws MultipyException, WrongNumberException {
        try {
            int strLength = left.length();
            int div = Integer.parseInt(divider);
            if (div > 10 || div < 1) {
                throw new WrongNumberException();
            }
            strLength = strLength / div;
            System.out.println("\"" + left.substring(0, strLength) + "\"");
        } catch (NumberFormatException e) {
            throw new MultipyException();
        }
    }
    public static void stringMulti(String left, String multiply) throws MultipyException, WrongNumberException {
        try {
            int mult = Integer.parseInt(multiply);
            if (mult > 10 || mult < 1) {
                throw new WrongNumberException();
            }
            String out = "";
            for (int i = 1; i <= mult; i++) {
                out += left;
            }
            if (out.length() > 40) {
                out = out.substring(0, 40);
                out += "...";
            }
            System.out.println("\"" + out + "\"");
        } catch (NumberFormatException e) {
            throw new MultipyException();
        }
    }
    public static void stringSubstract(String left, String right) {
        if (left.contains(right)) {
            System.out.println("\"" + left.replace(right, "") + "\"");
        } else {
            System.out.println("\"" + left + "\"");
        }
    }
    public static void stringSum(String substring, String substring1) {
        String out = substring + substring1;
        System.out.println("\"" + out + "\"");
    }

}
