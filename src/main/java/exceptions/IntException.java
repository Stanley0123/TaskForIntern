package exceptions;

public class IntException extends MyException {
    public IntException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[9], элемент в фильтре по счету " + position;
    }
}
