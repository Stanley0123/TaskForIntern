import exceptions.*;

import java.util.List;
import java.util.Map;
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
            FileReaderCSV fileReaderCSV = new FileReaderCSV();
            Search search = new Search();
            try{
                long start = System.currentTimeMillis();
               validator.execute(filterString);
               List<Map<String, Object>> list = fileReaderCSV.readAll();
               List<Map<String, Object>> bufList = search.search(fullNameString, filterString,list);
               long finish = System.currentTimeMillis();
               bufList.stream().forEach(x -> {
                   System.out.print("\"" + x.get("column[2]") + "\"");
                   System.out.println("[" + x.get("column[1]" + ", " + "\"" + x.get("column[2]") + "\"" + ", "
                           + "\"" + x.get("column[3]") + "\"" + ", " + "\"" + x.get("column[4]") + "\"" + ", "
                           + "\"" + x.get("column[5]") + "\"" + ", " + "\"" + x.get("column[6]") + "\"" + ", "
                           + x.get("column[7]") + ", " + x.get("column[8]") + ", "
                           + x.get("column[9]") + ", " + x.get("column[10]") + ", "
                           + "\"" + x.get("column[11]") + "\"" + ", " + "\"" + x.get("column[12]") + "\"" + ", "
                           + "\"" + x.get("column[13]") + "\"" + ", " + "\"" + x.get("column[14]") + "\"" + "]"));
               });
               long count = bufList.stream().count();
                long elapsed = finish - start;
                System.out.println("Количество найденных строк: " + count + " Время, затраченное на поиск: " + elapsed + "мс");
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
