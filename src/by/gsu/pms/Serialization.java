import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialization {
    public void serialize(Students[]student) {
        ObjectOutputStream ostream = null;
        try {
            System.out.println("serialized");
            ostream = new ObjectOutputStream(new FileOutputStream("Students.dat"));
            ostream.writeObject(student);
            ostream.close();
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println((e.getMessage()));
        }

    }

    }
