package by.gsu.pms;
import java.util.Scanner;
public class NewScanner {
    public enum PurchasesTypes {
        General_Purchase, Discount_Purchase, Number_Discount_Purchase
    }
    public static Commodity getclassFromFile( Scanner sc) {
        String id = sc.next();
        PurchasesTypes type = PurchasesTypes.valueOf(id);
        switch (type) {
            case General_Purchase:
                return new Commodity(sc);
            case Discount_Purchase:
                return new PriceDiscount(sc);
            case Number_Discount_Purchase:
                return new NumberDiscount(sc);
                default:
                throw new IllegalArgumentException();

        }
       
        }
   
    }
        
    
    




