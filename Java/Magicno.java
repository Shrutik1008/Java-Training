public class Magicno {
    public static void main(String[] args) {
        int number = 28;
        int sum = number;

        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        if (sum == 1) {
            System.out.println(number + " is a Magic number.");
        } else {
            System.out.println(number + " is not a Magic number.");
        }
    }
}
