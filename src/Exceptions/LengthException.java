package Exceptions;

public class LengthException extends Exception {
    public LengthException() {
        super("Число знаков превышает 10 символов");
    }
}
