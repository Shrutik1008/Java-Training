public class Automorphicno {
    public static void main(String[] args) {
        int number = 25;
        int square = number * number; 

        
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        
        if (squareStr.endsWith(numStr)) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }
    }
}