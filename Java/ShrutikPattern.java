import java.util.Scanner;

public class ShrutikPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern (recommended 5 or more): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            printS(n, i);
            System.out.print("  ");
            printH(n, i);
            System.out.print("  ");
            printR(n, i);
            System.out.print("  ");
            printU(n, i);
            System.out.print("  ");
            printT(n, i);
            System.out.print("  ");
            printI(n, i);
            System.out.print("  ");
            printK(n, i);
            System.out.println();
        }
    }

    static void printS(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n / 2 || i == n - 1) {
                System.out.print("*");
            } else if (i < n / 2 && j == 0) {
                System.out.print("*");
            } else if (i > n / 2 && j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printH(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printR(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1) || (j == n - 1 && i > 0 && i < n / 2) || (i - j == n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printU(int n, int i) {
        for (int j = 0; j < n; j++) {
            if ((j == 0 && i < n - 1) || (j == n - 1 && i < n - 1) || (i == n - 1 && j > 0 && j < n - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printT(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printI(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printK(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 - i || i - j == 0 && j >= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
