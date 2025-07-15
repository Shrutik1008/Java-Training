public class duckno {
    public static void main(String[] args) {
        int number = 01234;
        String numStr = String.valueOf(number);
        
        if (numStr.contains("0")) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }
    
}
