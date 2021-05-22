import by.gsu.pms.Commodity;
import by.gsu.pms.NewScanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("src/in.txt"))){
            
            final int MAX_PURCHASES = 8;
            Commodity maxCostPurchase = new Commodity(scanner);
            Commodity[] purchases = new Commodity[MAX_PURCHASES];

           
            boolean isAllEqual = true;
            for (int i = 0; i < purchases.length; i++) {
                purchases[i] = NewScanner.getclassFromFile(scanner);
                System.out.println(purchases[i]);
                if (!purchases[i].equals(purchases[0])) {
                    isAllEqual = false;
                }

                if (maxCostPurchase.getCost() < purchases[i].getCost()) {
                    maxCostPurchase = purchases[i];
                }
            }

            if (isAllEqual) {
                System.out.println("All equal");
            } else {
                System.out.println("All not equal");
            }

            System.out.println("max cost purchase = " + maxCostPurchase);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
           
    }
    
}
}