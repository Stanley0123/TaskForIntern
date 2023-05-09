package exceptions;

public class CountryException extends MyException{
    public CountryException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[4], элемент в фильтре по счету " + position;
    }
}
