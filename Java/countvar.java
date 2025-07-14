import java.util.*;
public class countvar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a name: ");
         String name = sc.nextLine();

        int count = 0;
        name = name.toLowerCase(); 
        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
            System.out.println("Number of vowels in the name: " + count);
            sc.close();
    }  
}