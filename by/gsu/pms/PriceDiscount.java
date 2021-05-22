package by.gsu.pms;

import java.util.Scanner;

public class PriceDiscount extends Commodity {
    private int discount; // скидка по цене

    public PriceDiscount(String name, double price, int number, int discount) {
        super(name, price, number);
        this.discount= discount;
        
    }
    public PriceDiscount() {
        this("",0,0,0);
    }
    public PriceDiscount (Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
}
