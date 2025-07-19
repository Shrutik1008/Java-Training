public class Frequency {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3, 4,4,4,5};

        int n = arr.length;

        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        
        for (int i = 0; i < n; i++) {
            if   visited[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) 
                {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }else{
                        visited[j] = false;
                    }

                }  
                freq[i] = count;
                System.out.println("Element: " + arr[i] + ", Frequency: " + freq[i]);
            }
        }
    }
}