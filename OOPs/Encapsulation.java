package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
        
        info myobj = new info();
        myobj.setName("Shrutik");
        myobj.age("20");

        System.out.println("Name: " + myobj.getName() + " Age: " + myobj.getage());
    }
       public static class info{
        private String name;
        private int age;

        public String getName(){
            return name;
        }

        public String setName(String name){
            this.name = name;
            return name;
        }

        public int getage(){
            return age;
        }

       public void age(String age){
           this.age = Integer.parseInt(age);
           
        }    

    }

}
