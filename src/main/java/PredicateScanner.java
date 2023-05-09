import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredicateScanner {
    public  Predicate<Map<String, Object>> whereScanner(String str){
        Predicate<Map<String, Object>> predicate = null;
        String buffered = str.strip();
        buffered = deleteExternal(buffered);
        boolean factor = true;
        List<Predicate<Map<String, Object>>> listOr = new ArrayList<>();
        List<Predicate<Map<String, Object>>> listAnd = new ArrayList<>();
        while (factor){
            Predicate<Map<String, Object>> argument = null;
            Matcher mBracket = Pattern.compile("^\\s*[(]").matcher(buffered);
            Matcher mAttribute = Pattern.compile("^\\s*" + RegexContainer.groupCondition).matcher(buffered);
            if (mBracket.find()) {
                int finale = bracketInt(buffered);
                int start = mBracket.start();
                argument = whereScanner(buffered.substring(start, finale));
                buffered = buffered.substring(finale, buffered.length());
            }
            else if (mAttribute.find()){
                int finale = mAttribute.end();
                int start = mAttribute.start();
                String stringArg = buffered.substring(start, finale);
                if (stringArg.matches(RegexContainer.idCondition)){
                    argument = MyPredicate.columnOneToPredicate(stringArg);
                } else if (stringArg.matches(RegexContainer.nameCondition)){
                    argument = MyPredicate.columnThreeToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.countryCondition)){
                    argument = MyPredicate.columnFourToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.threeShortCondition)){
                    argument = MyPredicate.columnFiveToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.fourShortCondition)){
                    argument = MyPredicate.columnSixToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.firstDoubleCondition)){
                    argument = MyPredicate.columnSevenToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.secondDoubleCondition)){
                    argument = MyPredicate.columnEightToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.intCondition)){
                    argument = MyPredicate.columnNineToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.doubleIntNullCondition)){
                    argument = MyPredicate.columnTenToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.oneShortCondition)){
                    argument = MyPredicate.columnElevenToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.continentCityCondition)){
                    argument = MyPredicate.columnTwelveToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.airportCondition)){
                    argument = MyPredicate.columnThirteenToPredicate(stringArg);
                }
                else if (stringArg.matches(RegexContainer.ourAirportsCondition)){
                    argument = MyPredicate.columnFourteenToPredicate(stringArg);
                }
                buffered = buffered.substring(finale, buffered.length());
            }
            Matcher mOr = Pattern.compile(RegexContainer.orWord).matcher(buffered);
            Matcher mAnd = Pattern.compile(RegexContainer.andWord).matcher(buffered);
            //a and b and c and d //or t //and y
            if (mOr.find()){
                listAnd.add(argument);
                listOr.add(and(listAnd));//*****
                listAnd.clear();
                int finaleString = mOr.end();
                buffered = buffered.substring(finaleString, buffered.length());
            }
            else if (mAnd.find()){
                listAnd.add(argument);
                int finaleString = mAnd.end();
                buffered = buffered.substring(finaleString, buffered.length());
            }
            else {
                listAnd.add(argument);
                factor = false;
            }
        }
        listOr.add(and(listAnd));
        listAnd.clear();
        predicate = or(listOr);
        return  predicate;
    }
    //определение внешняя ли скобка
    private  boolean isThisExternalBracket(String str){
        boolean val = false;
        short sizeIndex = 0;
        String regex = "^\\s*[(]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            int start = matcher.start();
            String substring = str.substring(start, str.length());
            int properlyBracketCounter = 0;
            for (int i = 0; i < substring.length(); i++){
                char symbol = substring.charAt(i);
                if (symbol == '('){
                    properlyBracketCounter++;
                }
                else if (symbol == ')'){
                    properlyBracketCounter--;
                }
                sizeIndex++;
                if (properlyBracketCounter == 0){
                    break;
                }
            }
            if (sizeIndex == substring.length()){
                val = true;
            } else if (substring.substring(sizeIndex, substring.length()).matches("^\\s+$")) {
                val = true;
            }
        }

        return val;
    }
    //определение конца скобки
    private  int bracketInt(String str){
        boolean val = false;
        short sizeIndex = 0;
        String regex = "[(]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        int start = matcher.start();
        int properlyBracketCounter = 0;
        for (int i = start; i < str.length(); i++){
            char symbol = str.charAt(i);
            if (symbol == '('){
                properlyBracketCounter++;
            }
            else if (symbol == ')'){
                properlyBracketCounter--;
            }
            sizeIndex++;
            if (properlyBracketCounter == 0){
                break;
            }
        }
        return start + sizeIndex;
    }
    //удаление внешних всех скобок
    private  String deleteExternal(String str){
        boolean factor = true;
        while (factor){
            str = str.strip();
            if (isThisExternalBracket(str)){
                str = str.substring(1, str.length()-1);
            }
            else {
                factor = false;
            }
        }
        return str;
    }

    //метод для or-ивания and всех предикатов из списка
    private  Predicate<Map<String, Object>> or(List<Predicate<Map<String, Object>>> list) {
//        Predicate<Map<String, Object>> predicate = list.get(0);
//        for (int i = 1; i < list.size(); i++){
//            predicate = predicate.or(list.get(i));
//        }
        return list.stream().reduce(Predicate::or).orElse(x -> false);
    }
    //метод для and-ивания всех предикатов из списка
    private  Predicate<Map<String, Object>> and(List<Predicate<Map<String, Object>>> list) {
//        Predicate<Map<String, Object>> predicate = list.get(0);
//        for (int i = 1; i < list.size(); i++){
//            predicate = predicate.or(list.get(i));
//        }
        return list.stream().reduce(Predicate::and).orElse(x -> true);
    }
}
