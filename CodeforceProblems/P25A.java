package CodeforceProblems;
import java.util.Scanner;
 
public class P25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;
        int evenIndex = -1, oddIndex = -1;
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
 
            if (arr[i] % 2 == 0) {
                evenCount++;
                evenIndex = i + 1; 
            } else {
                oddCount++;
                oddIndex = i + 1;
            }
        }
 
 
        if (evenCount == 1)
            System.out.println(evenIndex);
        else
            System.out.println(oddIndex);
 
        sc.close();
    }
}