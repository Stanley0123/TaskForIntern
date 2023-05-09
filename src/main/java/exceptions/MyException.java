package exceptions;

public class MyException extends Exception{
    protected int position = -1;
    MyException(){

    }
    public MyException(int position){
        this.position = position;
    }
    public String getMessage(){
        return "Ошибка в синтаксисе";
    }
}
