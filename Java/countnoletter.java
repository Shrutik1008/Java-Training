import java.util.Scanner;
public class countnoletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        int count = 0;
        String Final = name+"\0";

        while (Final.charAt(0) != '\0') {
            char ch = Final.charAt(0);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                count++;
            }
            Final = Final.substring(1);

            
        }

        System.out.println("Number of letters in the name: " + count);
        sc.close();
    }
}
