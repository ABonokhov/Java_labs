package IDZ2;

public class ChocolateBar extends Sweet {

    private boolean porous; // пористый
    private String chocolateType; // темный/молочный
    private boolean bitter; // горький


    public ChocolateBar(String name, int weight, float price, int sugarCount, boolean porous, String chocolateType, boolean bitter ) {
        super(name, weight, price, sugarCount);
        this.porous=porous;
        this.chocolateType=chocolateType;
        this.bitter=bitter;
       
    }


    public boolean isPorous() {
        return porous;
    }


    public void setPorous(boolean porous) {
        this.porous = porous;
    }


    public String getChocolateType() {
        return chocolateType;
    }


    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }


    public boolean isBitter() {
        return bitter;
    }


    public void setBitter(boolean bitter) {
        this.bitter = bitter;
    }
    
}
