package Excecoes.code.Exception;

public class InvalidDateException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public InvalidDateException(String text){
        super(text);
    }
}
