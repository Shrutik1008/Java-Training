public class SwapVowels {
    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println("Original: " + str);
        swapVowels(str);
        System.out.println("Swapped: " + swapVowels(str));

    }

    static String swapVowels(String str) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right =str.length()-1;
        char[] chars =str.toCharArray();

        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

}