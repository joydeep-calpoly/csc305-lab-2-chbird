package CSC305_Lab_2.Task1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Driver {
public static void main(String[] args) {
    String jsonFilePath = "input1.json";
    List<Dignitary> dignitaries;
    
    try {
        String jsonString = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        
        dignitaries = JSONParser.parseDignitaries(jsonString);
        
        dignitaries.forEach(System.out::println);
        
    } catch (Exception e) {
        System.out.println("Error reading or processing JSON: " + e.getMessage());
    }
}
}
