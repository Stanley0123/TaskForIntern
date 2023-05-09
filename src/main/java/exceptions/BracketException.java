package exceptions;

public class BracketException extends MyException{
    BracketException(int position) {
        super(position);
    }
    public BracketException(){
        super();
    }
    @Override
    public String getMessage() {
        return "Ошибка в растановке скобок";
    }
}
