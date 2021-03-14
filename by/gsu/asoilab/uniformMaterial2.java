package by.gsu.asoilab;

    public class uniformMaterial2 {
        private String name;
        private uniformMaterial1 material;
        private static double volume;

        public uniformMaterial2(String name, uniformMaterial1 material,double volume) {
        this.material= material;
        this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public uniformMaterial1 getMaterial() {
            return material;
        }

        public void setMaterial(uniformMaterial1 material) {
            this.material = material;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
        }

        @Override
        public String toString() {
            return "uniformMaterial2 [material=" + material + ", name=" + name + ", volume=" + volume +"]";
        }



        public static  double getMass(uniformMaterial1 steel){
            return uniformMaterial1.getDensity()*volume;

        
    }
        
}
    
