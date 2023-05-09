package exceptions;

public class FullNameException extends MyException {
    public FullNameException(int i) {
        super(i);
    }

    @Override
    public String getMessage() {
        return "Ошибка в синтаксисе, Проверьте чтобы не было column[2], " +
                "так как она участвует в другом вводе. Также проверьте синтаксис";
    }
}
