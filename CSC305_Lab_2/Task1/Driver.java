package CSC305_Lab_2.Task1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Driver {
public static void main(String[] args) {
    List<Dignitary> dignitaries = new ArrayList<>();
    String jsonFilePath = "input1.json";
    
    try {
        String jsonString = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        
        JSONObject personObject = new JSONObject(jsonString);
        
        String name = personObject.getString("name");
        
        JSONArray knownForArray = personObject.getJSONArray("knownFor");
        List<String> knownFor = new ArrayList<>();
        for (int j = 0; j < knownForArray.length(); j++) {
            knownFor.add(knownForArray.getString(j));
        }
        
        JSONArray awardsArray = personObject.getJSONArray("awards");
        List<Award> awards = new ArrayList<>();
        for (int j = 0; j < awardsArray.length(); j++) {
            JSONObject awardObject = awardsArray.getJSONObject(j);
            String awardName = awardObject.getString("name");
            int awardYear = awardObject.getInt("year");
            awards.add(new Award(awardName, awardYear));
        }
        
        Dignitary dignitary = new Dignitary(name, knownFor, awards);
        dignitaries.add(dignitary);
        
        for (Dignitary d : dignitaries) {
            System.out.println(d);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
