package Exceptions;

public class WrongNumberException extends Exception {
    public WrongNumberException() {
        super("Калькулятор должен принимать на вход числа от 1 до 10 включительно, но не более");
    }
}