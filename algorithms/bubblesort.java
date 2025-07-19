package algorithms;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        
    
    int[] arr ={1,2,9,4,8,6,7};
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++){
      if(arr[i]<arr[j]){
        int temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
      }

    }

    }
    
    System.out.println(Arrays.toString(arr));
}

}