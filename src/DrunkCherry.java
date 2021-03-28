package src;

public class DrunkCherry implements SweetsBuilder {

    @Override
    public Sweet createSweet() {
        
        return new Cake("Drunk Cherry", 500, (float) 12.30, 120, true, true);
    }
}
    
