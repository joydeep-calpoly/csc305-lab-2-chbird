package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
public static void main(String[] args)
{
    List<Dignitary> allDignitaries = new ArrayList<>();
    
    for (int i = 1; i <= 3; i++) {
        String jsonFilePath = "input" + i + ".json";
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            
            Dignitary dignitary = objectMapper.readValue(new File(jsonFilePath), Dignitary.class);
            
            allDignitaries.add(dignitary);
        }
        catch (Exception e)
        {
            System.out.println("Error reading or processing JSON from file " + jsonFilePath + ": " + e.getMessage());
        }
    }
    
    allDignitaries.forEach(System.out::println);
}
}
