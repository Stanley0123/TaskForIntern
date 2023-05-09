import exceptions.*;

public class Validator {
    public void execute(String bufferString) throws Exception {
        String[] massive = bufferString.split("((\\s+&\\s+)|(\\s+[|][|]\\s+))");
//        for (String val : massive) {
//            System.out.print("|" + val + "|" + "\t");
//        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].matches(RegexContainer.groupConditionAndBracket)) {

            }
            else {
                if (!massive[i].matches(RegexContainer.idConditionAndBracket)) {
                    throw new IdException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.nameConditionAndBracket)) {
                    throw new NameException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.countryConditionAndBracket)) {
                    throw new CountryException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.threeShortConditionAndBracket)) {
                    throw new ThreeShortException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.fourShortConditionAndBracket)) {
                    throw new FourShortException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.firstDoubleConditionAndBracket)) {
                    throw new FirstDoublException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.secondDoubleConditionAndBracket)) {
                    throw new SecondDoubleException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.intConditionAndBracket)) {
                    throw new IntException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.doubleIntNullConditionAndBracket)) {
                    throw new DoubleIntNullException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.oneShortConditionAndBracket)) {
                    throw new OneShortException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.continentCityConditionAndBracket)) {
                    throw new ContinentCityException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.airportConditionAndBracket)) {
                    throw new AirportException(i + 1);
                }
                if (!massive[i].matches(RegexContainer.ourAirportsConditionAndBracket)) {
                    throw new OurAirportsException(i + 1);
                }
            }
        }
        if (!bracketChecker(bufferString)){
            throw new BracketException();
        }
    }
    private boolean bracketChecker(String bufferString) throws Exception {
        boolean isValid = true;
        int properlyBracketCounter = 0;
        for (int i = 0; i < bufferString.length(); i++){
            char symbol = bufferString.charAt(i);
            if (symbol == '('){
                properlyBracketCounter++;
            }
            else if (symbol == ')'){
                properlyBracketCounter--;
            }
            if (properlyBracketCounter < 0){
                isValid = false;
                break;
            }
        }
        if (properlyBracketCounter > 0){
            isValid = false;
        }
        return isValid;
    }
}
