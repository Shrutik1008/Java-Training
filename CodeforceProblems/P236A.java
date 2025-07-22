package CodeforceProblems;

import java.util.HashSet;
import java.util.Scanner;

public class P236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String Str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<Str.length();i++){
            set.add(Str.charAt(i));
        }

        if(set.size()%2 !=0){
                System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }

        sc.close();
    }


}
