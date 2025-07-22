package CodeforceProblems;

import java.util.Scanner;

public class P158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        String str = sc.nextLine();
        String[] Str = str.split(" ");

        int size = Integer.parseInt(Str[0]); 
        int k = Integer.parseInt(Str[1]);    

    
        String secondLine = sc.nextLine();
        String[] Str2 = secondLine.split(" ");

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(Str2[i]);
        }

        int kthScore = arr[k - 1];

        int count = 0;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] >= kthScore && arr[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
