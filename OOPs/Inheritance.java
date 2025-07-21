package OOPs;

public class Inheritance{

    class Vehical {
        private String brand;
        private String model;

        
    }

    class Car extends Vehical{
        public static void main(String[] args) {
            
            Car obj = new Car();
            obj.setBrand("Toyota");
            obj.setModel("Corolla");
        }


        public void setBrand(String brand){
            this.brand = brand;
            
        }
    }
} 