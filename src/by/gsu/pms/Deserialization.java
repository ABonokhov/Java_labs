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
        student=(Students[])ois.readObject();
        ois.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            //System.out.println();
        return student;

    }

    
}

