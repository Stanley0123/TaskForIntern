package exceptions;

public class ThreeShortException extends MyException {
    public ThreeShortException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[5], элемент в фильтре по счету " + position;
    }
}
