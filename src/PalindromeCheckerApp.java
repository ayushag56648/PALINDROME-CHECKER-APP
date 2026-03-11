import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // Compare stack and queue outputs
        while(!stack.isEmpty()) {

            if(stack.pop() != queue.remove()) {
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
}g