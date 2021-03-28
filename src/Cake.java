package src;

public class Cake extends Sweet {
    private boolean biscuit; // с бисквитом
    private boolean cherry; // с вишней

    public Cake(String name, int weight, float price, int sugarCount,boolean biscuit, boolean cherry ) {
        super(name, weight, price, sugarCount);
        this.biscuit=biscuit;
        this.cherry=cherry;
    }

    public boolean isBiscuit() {
        return biscuit;
    }

    public void setBiscuit(boolean biscuit) {
        this.biscuit = biscuit;
    }

    public boolean isCherry() {
        return cherry;
    }

    public void setCherry(boolean cherry) {
        this.cherry = cherry;
    }
    

    
}
