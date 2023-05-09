package exceptions;

public class DoubleIntNullException extends MyException {
    public DoubleIntNullException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[10], элемент в фильтре по счету " + position;
    }
}
