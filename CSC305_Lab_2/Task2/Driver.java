package CSC305_Lab_2.Task2;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
public class Driver
{

public static void main(String[] args)
{
    try
    {
        ObjectMapper objectMapper = new ObjectMapper();
        
        Dignitary dignitary = objectMapper.readValue(new File("input1.json"), Dignitary.class);
        
        System.out.println(dignitary);
        
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}
}