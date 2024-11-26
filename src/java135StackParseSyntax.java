//name: programmerJohn
//demonstrate using the Stack data structure to parse through syntax
import java.util.Stack;

public class java135StackParseSyntax {
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();

        for(char ch: expression.toCharArray()){

            if(ch == '(' || ch == '[' || ch =='{'){
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){

        String[] expressions = {
                "(a + b) & (c - d)",
                "((a + b) * (c - d)",
                "{ [a + b] * [c - d)}",
                "([)]",
                ""
        };

        for(String expr: expressions){
            System.out.println("Expressions: " + expr);

            //call the static method & check on the expression
            System.out.println("Is balanced " + isBalanced(expr));
            System.out.println();
        }
    }
}
