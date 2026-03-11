import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        // Pop characters to create reversed string
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare
        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}