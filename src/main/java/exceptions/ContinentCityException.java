package exceptions;

public class ContinentCityException extends MyException {
    public ContinentCityException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[12], элемент в фильтре по счету " + position;
    }
}
