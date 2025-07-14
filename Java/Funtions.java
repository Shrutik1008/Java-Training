public class Funtions {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println("Original String: " + str);
    
      
        System.out.println("Lowercase Characters: ");
        lowerCase(str);
        System.out.println("Uppercase Uppercase Characters: ");
        upperCase(str);
        System.out.println("Reversed String: ");
        reverseString(str);
        System.out.println("Trimmed String: ");
        trim(str);
    }

    static void lowerCase(String str) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z' ) {
            ch = (char) (ch + 32);
        System.out.print(ch);
        }
        }
        System.out.println();
    }

    static void upperCase(String str) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    static void reverseString(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }

    static void trim(String str){
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                System.out.print(ch);
            }
        }
    }
}