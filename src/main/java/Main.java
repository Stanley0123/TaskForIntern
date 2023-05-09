public class Main {
    public static void main(String[] args) {
//        String str = "column[1]>10 & column[5]='GKA' || (column[3] = 'sfdsf' & column[4]>'adasdasd' " +
//                "& column[6]='GKA' || column[7]>10 & column[8]='GKA')";
//        Validator validator = new Validator();
//        try {
//            validator.execute(str);
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//        String regex = "\\s*[(]*\\s*((\\s*\\Qcolumn[1]\\E\\s*(((=|<>|>|<)\\s*(\\d+)))\\s*))\\s*[)]*\\s*";
//        System.out.println(Pattern.compile(RegexContainer.groupConditionAndBracket).matcher(str).find());
            FileReaderCSV fileReaderCSV = new FileReaderCSV();
            fileReaderCSV.readAll();
    }
}