public class PasswordChecker {
    public static void main(String[] args) {
        String pass = "Abc@1234";


        boolean isValid = true;
        if(pass.length()<8 || pass.contains(" ")){
            isValid(false);
        } else {
            for(int i=0;i<pass.length();i++){
                char ch = pass.charAt(i);
                if( ch >= 'A' && ch <= 'Z' ||  ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '&' || ch == '*') {
                    continue;
                } else {
                    isValid = false;
                    break;
                }
            }

        };
        
    }

    static void isValid(boolean isValid) {
        if(isValid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
