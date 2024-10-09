package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Award
{

@JsonProperty("name")
private String name;
@JsonProperty("year")
private int year;

public Award() {}

@Override
public String toString() {
    return name + " (" + year + ")";
}
}
