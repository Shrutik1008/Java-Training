public class evilno {
    public static void main(String[] args) {
        int number = 1234;
        String numStr = String.valueOf(number);
        
        if (numStr.contains("1") || numStr.contains("2") || numStr.contains("3") || numStr.contains("4") || 
            numStr.contains("5") || numStr.contains("6") || numStr.contains("7") || numStr.contains("8") || 
            numStr.contains("9")) {
            System.out.println(number + " is an Evil number.");
        } else {
            System.out.println(number + " is not an Evil number.");
        }
    }
}
