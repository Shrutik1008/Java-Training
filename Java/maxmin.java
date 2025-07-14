import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter Elements: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

            sc.close();
    }
    
}
