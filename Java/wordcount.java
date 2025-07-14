public class wordcount {
    public  static void main(String[] args) {
        String str = "Hello   World";
        int count = 0;

        String[] Final = str.split(" ");

        for (int i = 0; i < Final.length; i++) {
            if (!Final[i].isEmpty()) {
                count++;
            }
        }

        System.out.println("Number of words in the string: " + count);
    }
}
