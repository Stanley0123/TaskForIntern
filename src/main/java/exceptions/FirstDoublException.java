package exceptions;

public class FirstDoublException extends MyException {
    public FirstDoublException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[7], элемент в фильтре по счету " + position;
    }
}
