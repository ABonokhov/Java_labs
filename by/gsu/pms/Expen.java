package by.gsu.pms;
public class Expen {
   private int rate = 25000;
   private String account;
   private int expenses;
   private int days;

public Expen (String account, int expenses, int days){
    super();
    this.account = account;
    this.expenses = expenses;
    this.days = days; 
}

public Expen() {
}

public String getAccount() {
    return account;
}
public void setAccount(String account) {
    this.account = account;
}
public int getExpenses() {
    return expenses;
}
public void setExpenses(int expenses){
    this.expenses = expenses;
}
public int getDays () {
    return days;
}
public void setDays(int days){
    this.days = days;
}

public int getTotal() {
    return (rate + expenses)*days ;
}
public void show() {
    System.out.println("Rate = " + rate);
    System.out.println("Account = " + account);
    System.out.println("Transport = " + expenses);
    System.out.println("Days = " + days);
    }
@Override
public String toString(){
return rate + ";" + account + ";" + expenses + ";" + days + ";" + getTotal();
}
public static class Runner {
    public static void main(String[] args) {
        Expen[] employees = {
        new Expen("Slutsky", 25000, 5),
        new Expen("Bobrov", 17000, 3),
        null,
        new Expen("Berdiguliev", 33000, 7),
        new Expen("Adamov", 4500, 2),
        new Expen("Koryagin", 49000, 8),
        new Expen(),
        };

        
    for (Expen employee : employees) {
        if (employee != null){
            employee.show();
            System.out.println("______________");
        }
    }
    employees[6]. setExpenses(13500);
        System.out.println(employees[6]);
        System.out.println("Duration = "+(employees[0].getDays()+employees[5].getDays()));
        for (Expen employee : employees) {
        System.out.println(employee);
}
int totalExpenses = 0;
for (Expen employee : employees) {
    if (employee != null) {
        totalExpenses += employee.getTotal();
    }  
}
System.out.println("Total expenses = " + totalExpenses);
int max = 0;
        for (Expen employee : employees) {
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
        }
        System.out.println("Max = " + max);

    }
}
}





