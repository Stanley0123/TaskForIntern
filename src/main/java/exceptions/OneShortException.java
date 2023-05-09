package exceptions;

public class OneShortException extends MyException {
    public OneShortException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[11], элемент в фильтре по счету " + position;
    }
}
