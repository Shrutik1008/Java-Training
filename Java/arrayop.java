import java.util.*;

public class arrayop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Choose the Operation you want to perform:");
        System.out.println("1. Insert\n2. Delete\n3. Update");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the index at which you want to insert an element:");
                int insertIndex = sc.nextInt();
                System.out.println("Enter value to be inserted:");
                int insertValue = sc.nextInt();
                arr = insert(arr, insertIndex, insertValue); // Update array
                System.out.println("Array after insertion: " + Arrays.toString(arr));
                break;

            case 2:
                System.out.println("Enter the index to delete:");
                int deleteIndex = sc.nextInt();
                arr = delete(arr, deleteIndex); // Update array
                System.out.println("Array after deletion: " + Arrays.toString(arr));
                break;

            case 3:
                System.out.println("Enter the index of the element to update:");
                int updateIndex = sc.nextInt();
                System.out.println("Enter the new value:");
                int newValue = sc.nextInt();
                update(arr, updateIndex, newValue);
                System.out.println("Array after update: " + Arrays.toString(arr));
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }

    static int[] insert(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Index out of bounds");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }

    static void update(int[] arr, int index, int value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
            return;
        }
        arr[index] = value;
    }
}
