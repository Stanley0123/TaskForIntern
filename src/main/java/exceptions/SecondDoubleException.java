package exceptions;

public class SecondDoubleException extends MyException {
    public SecondDoubleException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[8], элемент в фильтре по счету " + position;
    }
}
