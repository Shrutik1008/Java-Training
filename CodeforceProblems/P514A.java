package CodeforceProblems;
import java.util.*;

public class P514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();  
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int digit = ch - '0';
            int inverted = 9 - digit;

            if (i == 0 && digit == 9) {
                result.append(digit); 
            } else {
                result.append(Math.min(digit, inverted));
            }
        }

        System.out.println(result);
        sc.close();
    }
}
