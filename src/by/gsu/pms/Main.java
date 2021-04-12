package by.gsu.pms;

public class Main {
    public static void main(String[] args) {
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
        int totalAge=0;
        int totalDebts=0;
        for (Students students : student) {
            if (students != null){
                totalAge+=students.getAge();
                students.show();
                System.out.println("______________");
                if (students.getDebts() != 0) {
                    totalDebts++;
                    System.out.println();
                }
            }
        }
        int avgAge=totalAge/student.length;
        System.out.println("Average age of all students = " + avgAge);
        System.out.println("Students with debts = " + totalDebts);
    }
}


