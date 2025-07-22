package CodeforceProblems;
import java.util.*;

public class P119A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int n = sc.nextInt(); 

        while (true) {
            int g = gcd(a, n); 
            if (g > n) {
                System.out.println("1");
                break;
            }
            n -= g;

            g = gcd(b, n); 
            if (g > n) {
                System.out.println("0"); 
                break;
            }
            n -= g;
        }

        sc.close();
    }

    
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
