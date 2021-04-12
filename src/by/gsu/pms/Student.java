package by.gsu.pms;

public class Student {
    private String surname;
    private int age;
    private int debts; // долги по учебе

    public Students(String surname, int age, int debts) {
        super();
        this.surname = surname;
        this.age = age;
        this.debts = debts;
    }

    public Students() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDebts() {
        return debts;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }
    public void show () {
        System.out.println("Surname  = " + surname);
        System.out.println("Age = " + age);
        System.out.println("Debts = " + debts);
    }
}

}
