package by.gsu.pms;

import java.io.Serializable;

public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public String toString(){
        return surname + "," + age + "," +debts + ".";
    }



    public void show () {
        System.out.println("Surname  = " + String.valueOf(surname));
        System.out.println("Age = " + Integer.valueOf(age));
        System.out.println("Debts = " + Integer.valueOf(debts));
        

    }
}
