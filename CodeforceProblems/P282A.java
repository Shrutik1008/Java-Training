package CodeforceProblems;
import java.util.*;

public class P282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;

        for (int i = 0; i < n+1; i++) {
            String s = sc.nextLine(); 
            if (s.contains("++")) {
                X++;
            } else if (s.contains("--")) {
                --X;
            }
        }

        System.out.println(X);
        sc.close();
    }
}
