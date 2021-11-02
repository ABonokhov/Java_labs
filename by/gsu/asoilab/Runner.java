import by.gsu.asoilab.uniformMaterial1;
import by.gsu.asoilab.uniformMaterial2;

public class Runner {
    public static void main(String[] args) { 
    uniformMaterial1 steel = new uniformMaterial1("steel",7850);
    uniformMaterial2 wire = new uniformMaterial2("wire",steel,0.03);
    System.out.println(wire.toString());

    wire.setMaterial(new uniformMaterial1("copper", 8500));
    System.out.println(uniformMaterial2.getMass());

    wire.setMaterial(steel);
    System.out.println(wire.toString());
    System.out.println("Масса объекта = " + uniformMaterial2.getMass());

    

    
}
}

