package IDZ2;
public class Gingerbread extends Sweet {
    private boolean raisins; //изюм
    private boolean honey; //мёд

    public Gingerbread(String name, int weight, float price, int sugarCount, boolean raisins, boolean honey ) {
        super(name, weight, price, sugarCount);

        this.raisins = raisins;
		this.honey = honey;

    }

    public boolean isRaisins() {
        return raisins;
    }

    public void setRaisins(boolean raisins) {
        this.raisins = raisins;
    }

    public boolean isHoney() {
        return honey;
    }

    public void setHoney(boolean honey) {
        this.honey = honey;
    }
    
    
    
}
