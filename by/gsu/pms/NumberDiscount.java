package by.gsu.pms;

import java.util.Scanner;

public class NumberDiscount extends Commodity {
    private double discount; // скидка которая будет представлена, если количество купленных единиц больше, чем заданная константа подкласса.
    public double getDiscount() {
        return discount;
    }
    public NumberDiscount(String name, double price, int number, double discount) {
        super(name, price, number);
        this.discount = discount;
        }

    public NumberDiscount (Scanner scanner){
        this(scanner.next(),  scanner.nextDouble(),scanner.nextInt(),scanner.nextInt());
    }

    public NumberDiscount() {
        this("",0,0,0);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCost(){
        return super.price*this.number*(1-this.discount/100);
    }
    
   
}