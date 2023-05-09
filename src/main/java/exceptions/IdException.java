package exceptions;

public class IdException extends MyException {
    public IdException(int position) {
        super(position);
    }

    @Override
    public String getMessage() {
        return "Ошибка в column[1], элемент в фильтре по счету " + position;
    }
}
