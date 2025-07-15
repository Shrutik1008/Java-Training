public class palindrome {
    public static void main(String[] args) {
        String str="mjam";
        boolean isPalindrome = true;

        int left=0;
        int right = str.length()-1;

        while(isPalindrome && left < right){
            if(str.charAt(left)!= str.charAt(right)){
                isPalindrome = false;
            }
            left++;
            right--;
        }
        
        if(isPalindrome){
            System.out.println("String is Palindrome");
        }else{
            System.out.println(" String is Not Palindrome");
        }

    }
}
