package by.gsu.asoilab;

public class uniformMaterial1 {
    private String name;
    private static double density;


    public uniformMaterial1(String name, double d) {
        super();
        this.name = name;
        uniformMaterial1.density = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        uniformMaterial1.density = density;
    }

    @Override
    public String toString() {
        return "uniformMaterial1 [density=" + density + ", name=" + name + "]";
    }

    }
