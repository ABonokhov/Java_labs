package by.gsu.asoilab;

public class Runner {
    public static void main(String[] args) { // переделать

    uniformMaterial1[] material = {
        new uniformMaterial1 ("steel", 0.3),
        new uniformMaterial1 ("cobalt", 0.4),
    };
    for (int i =0;i<2;i++)
    System.out.println (material[i]);
}
}
