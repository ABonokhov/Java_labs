package by.gsu.pms;
import java.util.Scanner;


public class Commodity {
   
    private String name;
    protected double price;
    protected int number;

    public Commodity(String name, double price, int number) {
        super();
        this.name = name;
        this.price = price;
        this.number = number;
    }
  
    public Commodity(Scanner scanner ) {
    this(scanner.next(), scanner.nextInt(), scanner.nextInt());
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public  double getCost(){
    return price*number;
    }
    
    @Override
    public String toString() {
        return "Commodity [name=" + name + ", number=" + number + ", price=" + price + getCost()+ "]";
    }


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(price);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Commodity other = (Commodity) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
        return false;
    return true;
}
}