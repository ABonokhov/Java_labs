import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public Students[] deserialize() throws FileNotFoundException, IOException, ClassNotFoundException{
        Students[] newstudent = null; // десериализация в новый список
        try 
        {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students.dat"));
        newstudent=(Students[])ois.readObject();
        ois.close();
        }
        catch(IOException e){
            System.out.println("deserialized");
            System.out.println(e.getMessage());
            System.out.println(newstudent);
        }
        return newstudent;
    }
}

