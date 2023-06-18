package scanner;

import java.util.Scanner;

import static Operations.Operations.*;
import static util.StringUtil.checkConditions;
import static util.StringUtil.checkLength;

public class Task2 {
    public static char operator;
    private static String leftOperator = "";
    private static String rightOperator = "";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        int quotaCount = 0;
        operator = '$';
        for (char tempChar : chars) {
            if (tempChar == '\"') quotaCount++;
            if (tempChar == '+' || tempChar == '-' || tempChar == '*' || tempChar == '/') {
                operator = tempChar;
            }
        }
        checkConditions(quotaCount, input, operator);
        leftOperator = leftOperator.replace("\"", "").trim();
        rightOperator = rightOperator.replace("\"", "").trim();
        checkLength(leftOperator, rightOperator);

        switch (operator) {
            case '+' -> {
                stringSum(leftOperator, rightOperator);
            }
            case '-' -> {
                stringSubstract(leftOperator, rightOperator);
            }
            case '*' -> {
                stringMulti(leftOperator, rightOperator);
            }
            case '/' -> {
                stringDivide(leftOperator, rightOperator);
            }
            default -> {
                throw new Exception("Не соответствует одной из арифметических операций");
            }
        }
    }

    public static void setLeftOperator(String leftOperatorValue) {
        leftOperator = leftOperatorValue;
    }

    public static void setRightOperator(String rightOperatorValue) {
        rightOperator = rightOperatorValue;
    }
}
