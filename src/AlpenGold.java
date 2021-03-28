package src;

public class AlpenGold implements SweetsBuilder {

    @Override
    public Sweet createSweet() {
        
        return new ChocolateBar("Alpen Gold", 90, (float) 2.20, 48, false, "milk", true) ;
    }
    
    
}
