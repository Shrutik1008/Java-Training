package CodeforceProblems;
import java.util.*;

public class P149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Target = sc.nextInt();

         int[] arr = new int[12];
            for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
         }

         if (Target == 0) {
            System.out.println(0); 
            return;
         }
         Arrays.sort(arr);  

            int sum = 0;
            for (int i = 11; i >= 0; i--) { 
            sum += arr[i];

            if (sum >= Target) {
                System.out.println(12 - i);
                return;
            } 
            }


            if(Target>sum){
                System.out.println(-1);
            }
        }

        
}

