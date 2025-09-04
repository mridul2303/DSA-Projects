import java.util.Stack;

public class ReqParanthesis {
    public static void main(String[] args) {
        String s = "((()";
        System.out.println(minAddToMakeValid(s)); // Output: 2
    }

    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // matched pair
                } else {
                    stack.push(c); // unmatched closing
                }
            }
        }
        return stack.size(); // remaining are invalid
    }
}

