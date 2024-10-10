package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Award {

@JsonProperty("name")
private final String name;

@JsonProperty("year")
private final int year;

public Award() {
    this.name = null;
    this.year = 0;
}

@Override
public String toString() {
    return name + " (" + year + ")";
}
}
