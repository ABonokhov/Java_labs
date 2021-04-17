import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
      Students[] student = {
        new Students("Baklaev", 19, 2),
        new Students("Malinin", 20, 4),
        new Students("Piraeva", 18, 0),
        null,
        new Students("Kruchilin", 21, 2),
        null,
        null,
        new Students("Voronov", 20, 0),
        new Students("Golovin", 21, 1),
        new Students("Morozova", 19, 0),

        
};

Serialization ser = new Serialization();
        ser.serialize(student);
        Deserialization deser = new Deserialization();
        Students[] NewStudents = deser.deserialize();

        for (Students newstudent : NewStudents) {
            System.out.println(newstudent);
        }
        int totalAge=0;
        int totalDebts=0;
        for (Students newstudent:NewStudents) {
            if (newstudent != null){
                totalAge+=newstudent.getAge();
                newstudent.show();
                System.out.println("______________");
            }
            if (newstudent != null) {
                if (newstudent.getDebts() !=0) {
                   totalDebts++;
                }
    }
    int avgAge=totalAge/student.length;
    System.out.println("Average age of all students = " + avgAge);
    System.out.println("Students with debts = " + totalDebts);
}
       
    }
}
