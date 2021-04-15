package by.gsu.pms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public Students[] deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
        Students[] student = null;
        try 
        {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students.dat"));
        ois.close();

        student=(Students[])ois.readObject();
       // System.out.println(student); // проверить

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return student;

    }

    
}

