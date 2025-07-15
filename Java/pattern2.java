import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the letter K: ");
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            for (int j = 0; j < n; j++) {
                
                if (i + j == n / 2 || i - j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
