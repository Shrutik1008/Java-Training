public class PasswordChecker {
    public static void main(String[] args) {
        String pass = "Shrutik@123";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (pass.length() < 8 || pass.contains(" ")) {
            printValidity(false);
        } else {
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLower = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if ("@#$%&*!".indexOf(ch) != -1) {
                    hasSpecial = true;
                }
            }

            boolean isValid = hasUpper && hasLower && hasDigit && hasSpecial;
            printValidity(isValid);
        }
    }

    static void printValidity(boolean isValid) {
        if (isValid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
