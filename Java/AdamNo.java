import java.util.Scanner;
public class AdamNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        

          if (isAdam(n)) {
            System.out.println(n + " is an Adam number.");
        } else {
            System.out.println(n + " is not an Adam number.");
        }
    
    
        sc.close();
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean isAdam(int n) {
        int rev = reverse(n);
        int squareN = n * n;
        int squareRev = rev * rev;
        return reverse(squareN) == squareRev;
    }

}
