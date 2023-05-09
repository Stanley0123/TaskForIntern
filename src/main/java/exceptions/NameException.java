package exceptions;

public class NameException extends MyException {
    public NameException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[3], элемент в фильтре по счету " + position;
    }
}
