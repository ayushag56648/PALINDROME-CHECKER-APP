import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 1: Insert characters into stack and queue
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            stack.push(ch);   // LIFO
            queue.add(ch);    // FIFO
        }

        boolean isPalindrome = true;

        // Step 2: Compare stack pop and queue remove
        while(!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if(fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display result
        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}gi