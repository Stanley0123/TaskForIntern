public class RegexContainer {
    public static final String andWord = "^\\s*(\\b(?i)AND\\b)";
    public static final String orWord = "^\\s*(\\b(?i)OR\\b)";
    public static final String orAndWord = "(\\b[^']\\s*((?i)AND|(?i)OR)\\s*[^']\\b)";
    public static final String groupTrueFalseNull = "\\b((?i)true|(?i)false|(?i)null)\\b";

    public static final String idCondition = "(\\s*\\Qcolumn[1]\\E\\s*(((=|<>|>|<)\\s*(\\d+)))\\s*)";
    public static final String fullNameCondition = "(\\s*'(?i)lastName'\\s*(((=|<>)\\s*('.*'))\\s*)";
    public static final String nameCondition = "(\\s*\\Qcolumn[3]\\E\\s*(((=|<>)\\s*('.*'))\\s*))";
    public static final String countryCondition = "(\\s*\\Qcolumn[4]\\E\\s*(((=|<>)\\s*('.*'))\\s*))";
    public static final String threeShortCondition = "(\\s*\\Qcolumn[5]\\E\\s*(((=|<>)\\s*('.{3}'))\\s*))";
    public static final String fourShortCondition = "(\\s*\\Qcolumn[6]\\E\\s*(((=|<>)\\s*('.{4}'))\\s*))";
    public static final String firstDoubleCondition = "(\\s*\\Qcolumn[7]\\E\\s*((=|<>|>|<)\\s*([-]?\\d+[.]\\d+))\\s*)";
    public static final String secondDoubleCondition = "(\\s*\\Qcolumn[8]\\E\\s*((=|<>|>|<)\\s*([-]?\\d+[.]\\d+))\\s*)";
    public static final String intCondition = "(\\s*\\Qcolumn[9]\\E\\s*(((=|<>|>|<)\\s*([-]?\\d+)))\\s*)";
    public static final String doubleIntNullCondition = "(\\s*\\Qcolumn[10]\\E\\s*(((=|!=)\\s*\\\\N)|((=|<>|>|<)\\s*([-]?\\d+([.]\\d+)?)))\\s*)";
    public static final String oneShortCondition = "(\\s*\\Qcolumn[11]\\E\\s*(((=|<>)\\s*('[\\\\]?[A-Z]{1}'))\\s*))";
    public static final String continentCityCondition = "(\\s*\\Qcolumn[12]\\E\\s*(((=|<>)\\s*('.*'))\\s*))";
    public static final String airportCondition = "(\\s*\\Qcolumn[13]\\E\\s*(((=|<>)\\s*('.*'))\\s*))";
    public static final String ourAirportsCondition = "(\\s*\\Qcolumn[14]\\E\\s*(((=|<>)\\s*('.*'))\\s*))";

    public static final String idConditionAndBracket = "\\s*[(]*\\s*(" + idCondition + ")\\s*[)]*\\s*";
    public static final String nameConditionAndBracket = "\\s*[(]*\\s*(" + nameCondition + ")\\s*[)]*\\s*";
    public static final String countryConditionAndBracket = "\\s*[(]*\\s*(" + countryCondition + ")\\s*[)]*\\s*";
    public static final String threeShortConditionAndBracket = "\\s*[(]*\\s*(" + threeShortCondition + ")\\s*[)]*\\s*";
    public static final String fourShortConditionAndBracket = "\\s*[(]*\\s*(" + fourShortCondition + ")\\s*[)]*\\s*";
    public static final String firstDoubleConditionAndBracket = "\\s*[(]*\\s*(" + firstDoubleCondition + ")\\s*[)]*\\s*";
    public static final String secondDoubleConditionAndBracket = "\\s*[(]*\\s*(" + secondDoubleCondition + ")\\s*[)]*\\s*";
    public static final String intConditionAndBracket = "\\s*[(]*\\s*(" + intCondition + ")\\s*[)]*\\s*";
    public static final String doubleIntNullConditionAndBracket = "\\s*[(]*\\s*(" + doubleIntNullCondition + ")\\s*[)]*\\s*";
    public static final String oneShortConditionAndBracket = "\\s*[(]*\\s*(" + oneShortCondition + ")\\s*[)]*\\s*";
    public static final String continentCityConditionAndBracket = "\\s*[(]*\\s*(" + continentCityCondition + ")\\s*[)]*\\s*";
    public static final String airportConditionAndBracket = "\\s*[(]*\\s*(" + airportCondition + ")\\s*[)]*\\s*";
    public static final String ourAirportsConditionAndBracket = "\\s*[(]*\\s*(" + ourAirportsCondition + ")\\s*[)]*\\s*";

    public static final String groupCondition = idCondition + "|" + nameCondition
            + "|" + countryCondition + "|" + threeShortCondition + "|" + fourShortCondition
            + "|" + firstDoubleCondition + "|" + secondDoubleCondition + "|" + intCondition
            + "|" + doubleIntNullCondition + "|" + oneShortCondition + "|" + continentCityCondition
            + "|" + airportCondition + "|" + ourAirportsCondition;
    public static final String groupConditionAndBracket = "\\s*[(]*\\s*(" + idCondition + "|" + nameCondition
            + "|" + countryCondition + "|" + threeShortCondition + "|" + fourShortCondition
            + "|" + firstDoubleCondition + "|" + secondDoubleCondition + "|" + intCondition
            + "|" + doubleIntNullCondition + "|" + oneShortCondition + "|" + continentCityCondition
            + "|" + airportCondition + "|" + ourAirportsCondition + ")\\s*[)]*\\s*";
}
