package JDBC.code.DB1.Exception;

public class DBException extends RuntimeException{
    static final long serialVersionUID = 1L;

    public DBException(String text){
        super(text);
    }
}
