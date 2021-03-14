package by.gsu.asoilab;

    public class uniformMaterial2 {
        private String name;
        private String material;
        private int volume;

        public uniformMaterial2(String name, double d) {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }
        @Override
        public String toString() {
            return "uniformMaterial2{" +
                    "name='" + name + '\'' +
                    ", material='" + material + '\'' +
                    ", volume=" + volume +
                    '}';
        }

        public double getMass(){
            return uniformMaterial1.getDensity()*this.volume;
        
}
    }
