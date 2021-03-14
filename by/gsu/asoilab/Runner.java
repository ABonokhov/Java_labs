package by.gsu.asoilab;

public class Runner {
    public static void main(String[] args) { 
    uniformMaterial1 steel = new uniformMaterial1("steel",7850);
    uniformMaterial1 copper = new uniformMaterial1("copper",8500);
    //uniformMaterial2 wire = new uniformMaterial2("steel",0.03);
    
    System.out.println(steel.toString());
	System.out.println(copper.toString());
    //System.out.println(wire.toString());

    
}
}

