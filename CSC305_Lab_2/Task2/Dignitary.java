package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Dignitary {

@JsonProperty("name")
private String name;

@JsonProperty("knownFor")
private List<String> knownFor;

@JsonProperty("awards")
private List<Award> awards;
public Dignitary() {}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name).append("\nKnown for:\n");
    for (String known : knownFor) {
        sb.append("  - ").append(known).append("\n");
    }
    sb.append("Awards:\n");
    for (Award award : awards) {
        sb.append("  - ").append(award).append("\n");
    }
    return sb.toString();
}
}