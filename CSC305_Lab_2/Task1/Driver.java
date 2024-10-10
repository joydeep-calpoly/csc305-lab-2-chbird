package CSC305_Lab_2.Task1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Driver {
public static void main(String[] args) {
    List<Dignitary> allDignitaries = new ArrayList<>();
    
    for (int i = 1; i <= 3; i++) {
        String jsonFilePath = "input" + i + ".json";
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            
            List<Dignitary> dignitaries = JSONParser.parseDignitaries(jsonString);
            allDignitaries.addAll(dignitaries);
            
        } catch (Exception e) {
            System.out.println("Error reading or processing JSON from file " + jsonFilePath + ": " + e.getMessage());
        }
    }
    
    allDignitaries.forEach(System.out::println);
}
}
