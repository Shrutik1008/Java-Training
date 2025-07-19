package algorithms;

public class binarysearch {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7};
        WithoutRecursion();
        withrecursion(arr, 0, arr.length-1, 1);

    }

    public static void WithoutRecursion(){
    int[] arr={1,2,3,4,5,6,7};
    
    int start =0;
    int k=1;
   
    int end=arr.length - 1;
     

        while(start<=end){
            int mid=start+(end-start)/2;

            if(k>arr[mid]){
                start=mid+1;

            }else if(k < arr[mid]){
                end=mid-1;
            }else{
                System.out.println("element is at index: "+ mid);
                return ;
            }
            
        }
    }


    public static int withrecursion(int[] arr,int start,int end ,int k){
  
    int mid=start+(end-start)/2;
        if(start<=end){
            if(k>arr[mid]){
                return withrecursion(arr, mid+1, end, k);

            }else if(k < arr[mid]){
               return withrecursion(arr, start, mid-1, k);
            }else{
                System.out.println("element is at index: "+ mid);
                return mid;
      
                }
            }
            return -1;
    }

}

