package Problems;

public class ScalingWindow {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 7, 8, 1, 9};
        int target = 12;
        int windowSize = 3;

        for (int i = 0; i <= arr.length - windowSize; i++) {
            int sum = 0;

            for (int j = i; j < i + windowSize; j++) {
                sum += arr[j];
            }

            if (sum < target) {
                printSubarray(arr, i, i + windowSize - 1, sum);
            }
        }
    }

    public static void printSubarray(int[] arr, int start, int end, int sum) {
        System.out.print("Subarray (sum = " + sum + "): ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
