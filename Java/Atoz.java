import java.util.Scanner;
public class Atoz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >='A' && ch <= 'Z' || ch >='a' && ch <= 'z') {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
        }

            System.out.print(ch);
        }

    }
    
}

