public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 10, 15};
        int target = 9;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                System.out.println("["+ arr[left] + "," + arr[right]+"]");
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found with the given target.");
    }
}
