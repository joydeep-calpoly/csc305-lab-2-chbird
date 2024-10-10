package CSC305_Lab_2.Task1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JSONParser {
public static List<Dignitary> parseDignitaries(String jsonString) throws JSONException
{
    List<Dignitary> dignitaries = new ArrayList<>();
    
    JSONObject personObject = new JSONObject(jsonString);
    
    String name = personObject.getString("name");
    
    JSONArray knownForArray = personObject.getJSONArray("knownFor");
    List<String> knownFor = parseJSONArrayToList(knownForArray);
    
    JSONArray awardsArray = personObject.getJSONArray("awards");
    List<Award> awards = parseAwards(awardsArray);
    
    dignitaries.add(new Dignitary(name, knownFor, awards));
    
    return dignitaries;
}

private static List<String> parseJSONArrayToList(JSONArray jsonArray) throws JSONException
{
    List<String> list = new ArrayList<>();
    for (int i = 0; i < jsonArray.length(); i++) {
        list.add(jsonArray.getString(i));
    }
    return list;
}

private static List<Award> parseAwards(JSONArray awardsArray) throws JSONException
{
    List<Award> awards = new ArrayList<>();
    for (int j = 0; j < awardsArray.length(); j++) {
        JSONObject awardObject = awardsArray.getJSONObject(j);
        String awardName = awardObject.getString("name");
        int awardYear = awardObject.getInt("year");
        awards.add(new Award(awardName, awardYear));
    }
    return awards;
}
}
