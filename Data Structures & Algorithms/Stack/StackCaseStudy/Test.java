package Day08_Stack;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Expression :");
        String exp = sc.nextLine();

        if (isValid(exp)) {
            System.out.println("Expression is VALID");
        } else {
            System.out.println("Expression is INVALID");
        }
    }

    public static boolean isValid(String exp) {

        Stack s1 = new Stack(50);   // ✅ your custom stack

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                s1.push(ch);
            }
            // Closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (s1.isEmpty()) {
                    return false;
                }

                char top = (char) s1.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Finally stack empty hona chahiye
        return s1.isEmpty();
    }
}
