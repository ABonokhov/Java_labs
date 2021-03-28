package src;

public class Tula implements SweetsBuilder{

    @Override
    public Sweet createSweet() {

        return new Gingerbread("Tula", 12, (float) 0.85, 17, true, false);
    }
    
    
}
