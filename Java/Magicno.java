public class Magicno {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        int temp = number;

        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (sum == 1) {
            System.out.println(number + " is a Magic number.");
        } else {
            System.out.println(number + " is not a Magic number.");
        }
}
}
