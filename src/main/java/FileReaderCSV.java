import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReaderCSV {
    public List<Map<String, Object>> readAll(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try{
            File file = new File(getClass().getResource(String.format("/%s", "airports.csv")).toURI());
            BufferedReader csvReader = new BufferedReader(new FileReader(file));
            String row = "";
            int positionSum = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                HashMap<String, Object> map = new HashMap<>();
                map.put("fullName", data[1].substring(1, data[1].length() - 1));
                map.put("position", positionSum);
                positionSum = positionSum + row.length() + 1;
                list.add(map);
            }
            csvReader.close();
        }
        catch (Exception ex){
            System.out.println("Error in File");
        }
        return list;
    }
    public Map<String, Object> getMapFromPosition(int position){
        Map<String, Object> map = new HashMap<>();
        try{
            File file = new File(getClass().getResource(String.format("/%s", "airports.csv")).toURI());
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            raf.seek(position);
            String text = raf.readLine();
            String[] data = text.split(",");
            map.put("column[1]", Integer.parseInt(data[0]));
            map.put("column[2]", data[1].substring(1, data[1].length() - 1));
            map.put("column[3]", data[2].substring(1, data[2].length() - 1));
            map.put("column[4]", data[3].substring(1, data[3].length() - 1));
            map.put("column[5]", data[4].substring(1, data[4].length() - 1));
            map.put("column[6]", data[5].substring(1, data[5].length() - 1));
            map.put("column[7]", Double.parseDouble(data[6]));
            map.put("column[8]", Double.parseDouble(data[7]));
            map.put("column[9]", Integer.parseInt(data[8]));
            map.put("column[10]", Double.parseDouble(data[9]));
            map.put("column[11]", data[10].substring(1, data[10].length() - 1));
            map.put("column[12]", data[11].substring(1, data[11].length() - 1));
            map.put("column[13]", data[12].substring(1, data[12].length() - 1));
            map.put("column[14]", data[13].substring(1, data[13].length() - 1));
            raf.close();
        } catch (Exception e) {
            System.out.println("Error in translator");
        }
        return map;
    }
}
