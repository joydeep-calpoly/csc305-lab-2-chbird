package CSC305_Lab_2.Task1;

import java.util.List;

class Dignitary
{
private String name;
private List<String> knownFor;
private List<Award> awards;

public Dignitary(String name, List<String> knownFor, List<Award> awards)
{
    this.name = name;
    this.knownFor = knownFor;
    this.awards = awards;
}

@Override
public String toString()
{
    StringBuilder sb = new StringBuilder();
    sb.append(name).append("\n\n");
    sb.append("Known for:\n");
    for (String item : knownFor)
    {
        sb.append("    ").append(item).append("\n");
    }
    sb.append("Awards:\n");
    for (Award award : awards)
    {
        sb.append("    ").append(award).append("\n");
    }
    return sb.toString();
}
}