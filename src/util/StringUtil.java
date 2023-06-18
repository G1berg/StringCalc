package util;

import Exceptions.LengthException;
import scanner.Task2;

public class StringUtil {
    public static void checkConditions(int quotaCount, String input, char operator) throws Exception {
        if (quotaCount != 4 && quotaCount != 2) {
            throw new Exception("Первым аргументом выражения, подаваемого на вход, должна быть строка");
        }
        int operIndex = input.indexOf(operator);
        if (operIndex > 3 && input.length() - operIndex > 2) {
            Task2.setLeftOperator(input.substring(0, operIndex));
            Task2.setRightOperator(input.substring(operIndex + 1));
        }
    }

    public static void checkLength(String leftOperator, String rightOperator) throws LengthException {
        if (leftOperator.length() > 10 || rightOperator.length() > 10) {
            throw new LengthException();
        }
    }
}
