package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONArray;

import java.util.Collections;
import java.util.List;

public class Dignitary {

@JsonProperty("name")
private final String name;

@JsonProperty("knownFor")
private final List<String> knownFor;

@JsonProperty("awards")
private final List<Award> awards;

@JsonCreator
public Dignitary(@JsonProperty("name") String name,
        @JsonProperty("knownFor") List<String> knownfor,
        @JsonProperty("awards") List<Award> awards)
{
    this.name = name;
    this.knownFor = knownfor;
    this.awards = awards;
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name).append("\nKnown for:\n");
    for (String known : knownFor) {
        sb.append("    ").append(known).append("\n");
    }
    sb.append("Awards:\n");
    for (Award award : awards) {
        sb.append("    ").append(award).append("\n");
    }
    return sb.toString();
}
}
