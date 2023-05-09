import exceptions.*;

import java.util.Scanner;

public class InputNameAndFilter {
    public void input(){
        boolean factor = true;
        while(factor){
            Scanner scannerFilter = new Scanner(System.in);
            System.out.println("Введите фильтр");
            String filterString = scannerFilter.nextLine();
            if (filterString.matches("\\s*!quit\\s*")){
                System.exit(0);
            }
            Scanner scannerFullName = new Scanner(System.in);
            System.out.println("Введите имя аэропорта");
            String fullNameString = scannerFullName.nextLine();
            if (fullNameString.matches("\\s*!quit\\s*")){
                System.exit(0);
            }
            Validator validator = new Validator();
            try{
               validator.execute(filterString);
            }
            catch (IdException ex){
                ex.getMessage();
                continue;
            }
            catch (FullNameException ex){
                ex.getMessage();
                continue;
            }
            catch (AirportException ex){
                ex.getMessage();
                continue;
            }
            catch (BracketException ex){
                ex.getMessage();
                continue;
            }
            catch (ContinentCityException ex){
                ex.getMessage();
                continue;
            }
            catch (CountryException ex){
                ex.getMessage();
                continue;
            }
            catch (DoubleIntNullException ex){
                ex.getMessage();
                continue;
            }
            catch (FirstDoublException ex){
                ex.getMessage();
                continue;
            }
            catch (FourShortException ex){
                ex.getMessage();
                continue;
            }
            catch (IntException ex){
                ex.getMessage();
                continue;
            }
            catch (NameException ex){
                ex.getMessage();
                continue;
            }
            catch (OneShortException ex){
                ex.getMessage();
                continue;
            }
            catch (OurAirportsException ex){
                ex.getMessage();
                continue;
            }
            catch (SecondDoubleException ex){
                ex.getMessage();
                continue;
            }
            catch (ThreeShortException ex){
                ex.getMessage();
                continue;
            }
            catch (Exception ex){
                System.out.println("Ошибка в синтаксисе");
                continue;
            }
        }
    }
}
