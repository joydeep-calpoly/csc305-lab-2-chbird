package CSC305_Lab_2.Task1;

class Award {
private String name;
private int year;

public Award(String name, int year) {
    this.name = name;
    this.year = year;
}

@Override
public String toString() {
    return name + " (" + year + ")";
}
}