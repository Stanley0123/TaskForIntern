public class Main {
    public static void main(String[] args) {
//        String str = "column[1]>10 & column[5]='GKA' || (column[3] = 'sfdsf' & column[4]>'adasdasd' ";
//        InputNameAndFilter inputNameAndFilter = new InputNameAndFilter();
//        inputNameAndFilter.input();
        FileReaderCSV fileReaderCSV = new FileReaderCSV();
        fileReaderCSV.readAll().stream().forEach(x -> x.get("position"));
    }
}