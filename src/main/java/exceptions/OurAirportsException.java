package exceptions;

public class OurAirportsException extends MyException {
    public OurAirportsException(int position) {
        super(position);
    }
    @Override
    public String getMessage() {
        return "Ошибка в column[14], элемент в фильтре по счету " + position;
    }
}
