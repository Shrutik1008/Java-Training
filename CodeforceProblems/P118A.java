
package CodeforceProblems;
import java.util.*;


public class P118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String Str = sc.nextLine();

        System.out.println("Enter The String : ");

        String lower = Str.toLowerCase();
        removevowels(Str);
    
            sc.close();
    }

    public static void removevowels(String lower){
        String newstr = "";
            for (int i = 0; i < lower.length(); i++) {
                if(lower.charAt(i)=='a' || lower.charAt(i)=='e' || lower.charAt(i)=='i' ||lower.charAt(i)=='o' ||lower.charAt(i)=='u' ||lower.charAt(i)=='y'){
                    System.out.println("");
                }else{
                    newstr+='.';
                    newstr+=lower.toLowerCase().charAt(i);
                }
            }

            System.out.println(newstr);

            
    }
    
}

