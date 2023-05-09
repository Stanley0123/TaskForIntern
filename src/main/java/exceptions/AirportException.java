package exceptions;

public class AirportException extends MyException {
    public AirportException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[13], элемент в фильтре по счету " + position;
    }
}
