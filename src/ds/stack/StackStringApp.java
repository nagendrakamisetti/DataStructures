package ds.stack;

/**
 * @author Nagendra Kamisetti
 * <p>
 * Reversing a string using ds.stack data structure
 */
public class StackStringApp {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

    public static String reverseString(String str) {

        StackString stack = new StackString(str.length());
        for (int i = 0; i < str.length(); i++)
            stack.push(str.charAt(i));

        String result = "";
        while (!stack.isEmpty())
            result += stack.pop();


        return result;


    }
}
