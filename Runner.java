import src.Present;
import src.Sweet;

public class Runner {
        public static void main(String[] args) {

            Present present = PresentBuilder.createPresent();
    
            present.sortByWeight();
            
            for (Sweet sweet : present) {
                System.out.println(sweet);
            }
    
            System.out.println("_______________________________________________");
    
            for (Sweet sweet : present.getSweetsWithSugarAmountInRange(10, 120)) {
                System.out.println(sweet + " Sugar amount:" + sweet.getSugarAmount());
            }
    
        }
    
}
        
    
