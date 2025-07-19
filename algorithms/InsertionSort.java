package algorithms;
import java.util.*;

public class InsertionSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size of an Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an Array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }


            arr[j+1]=current;
        }
        System.out.println("Sorted Array Is :");
        printArray(arr);
        sc.close();
    }
}
