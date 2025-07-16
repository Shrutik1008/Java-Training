public class PanNoChecker {
    public static void main(String[] args) {
        String panNo = "ABCDE1234F";

        if (panNo.length() != 10) {
            printValidity(false);
            return;
        }

        boolean isValid = true;

        for (int i = 0; i < 10; i++) {
            char ch = panNo.charAt(i);

            if (i < 5) {
                if (!Character.isUpperCase(ch)) {
                    isValid = false;
                    break;
                }
            } else if (i < 9) {
                if (!Character.isDigit(ch)) {
                    isValid = false;
                    break;
                }
            } else {
                if (!Character.isUpperCase(ch)) {
                    isValid = false;
                }
            }
        }

        printValidity(isValid);
    }

    static void printValidity(boolean isValid) {
        if (isValid) {
            System.out.println("PAN No is valid");
        } else {
            System.out.println("PAN No is invalid");
        }
    }
}
