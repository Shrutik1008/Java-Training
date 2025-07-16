public class Stuff {
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,2,3,0,0};
        zeroatend();



    }
     static void zeroatend(){

        
        int[] arr = {1,0,5,0,2,3,0,0};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

     }
    
}
