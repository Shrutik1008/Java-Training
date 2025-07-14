    import java.util.Arrays;

    public class sorting {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 9};
            Arrays.sort(numbers);
            System.out.println("Sorted Array: ");
            System.out.println(Arrays.toString(numbers));
            System.out.println("Minimum Value: ");
            System.out.println(numbers[0]);
            System.out.println("Maximum Value: ");
            System.out.println(numbers[numbers.length - 1]);


         
    }
}