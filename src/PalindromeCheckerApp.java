public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        char[] letters = word.toCharArray();

        boolean isPalindrome = true;

        for(int i = 0; i < letters.length / 2; i++) {

            if(letters[i] != letters[letters.length - 1 - i]) {
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}