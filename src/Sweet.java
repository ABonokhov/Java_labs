package src;

public abstract class Sweet {

	private String name;
	private int weight;
	private int sugarCount;
    private float price;

	public Sweet(String name, int weight, float price,int sugarCount) {

		this.name = name;
		this.price = price;
		this.weight = weight;
		this.sugarCount = sugarCount;

	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}