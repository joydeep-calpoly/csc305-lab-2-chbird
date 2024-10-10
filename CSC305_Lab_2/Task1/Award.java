package CSC305_Lab_2.Task1;

class Award {
private final String name;
private final int year;

Award(String name, int year) {
    this.name = name;
    this.year = year;
}

@Override
public String toString() {
    return name + " (" + year + ")";
}
}