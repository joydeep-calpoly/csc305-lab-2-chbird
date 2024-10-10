package CSC305_Lab_2.Task2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Award {

@JsonProperty("name")
private final String name;

@JsonProperty("year")
private final int year;

@JsonCreator
private Award(@JsonProperty("name") String name, @JsonProperty("year") int year) {
    this.name = name;
    this.year = year;
}

@Override
public String toString() {
    return name + " (" + year + ")";
}
}
