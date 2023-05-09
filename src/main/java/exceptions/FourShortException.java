package exceptions;

public class FourShortException extends MyException {
    public FourShortException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[6], элемент в фильтре по счету " + position;
    }
}
