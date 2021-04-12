package by.gsu.pms;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.String.valueOf;

public class Serialization{
    public void serialise(Students[]student) {
        ObjectOutputStream ostream = null;
        try {
            System.out.println("serialized");
            ostream = new ObjectOutputStream(new FileOutputStream("D:\\java_labs\\IDZ3\\Students.dat"));
            ostream.writeObject(student);
            ostream.close();
        } catch (IOException e) {
            System.out.println(valueOf(e));
        }

    }

    }
