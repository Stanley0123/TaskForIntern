import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Search {
    public List<Map<String, Object>> search(String fullName, String filters, List<Map<String, Object>> mapList){
        int size = 7184;
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            if (mapList.get(i).get("fullName").toString().matches("^\\s*" + fullName + ".*")){
                FileReaderCSV fileReaderCSV = new FileReaderCSV();
                Map<String, Object> map = fileReaderCSV.getMapFromPosition(Integer.parseInt(mapList.get(i)
                        .get("position").toString()));
                list.add(map);
            }
        }
        PredicateScanner predicateScanner = new PredicateScanner();
        Comparator<Map<String, Object>> comparator = (a, b) -> a.get("column[2]").toString().compareTo(b.get("column[2]").toString());
        return list.stream().filter(predicateScanner.whereScanner(filters)).sorted(comparator).toList();
    }
}
