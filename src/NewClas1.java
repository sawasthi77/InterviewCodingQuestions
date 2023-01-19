import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NewClas1 {

    public static void main(String[] args) {
//        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//        An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
        System.out.println(validString("((())){{[[[}}}]]]()"));
//1. if char is open bracket (i.e. '(' or '{' or '[') then push it in stack.
// 2. if char is closed bracket therefore we can check the following conditions:
// 1: if '{' is before '}'.
// 2: if '(' is before ')'.
// 3: if '[' is before ']'.
//
    }

    public static Boolean validString (String s){
        Stack<Character> characterStack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
            {
                characterStack.push(c);
            }
            else if (c == ')'){
                if(characterStack.isEmpty()){
                    return false;
                }
                if(characterStack.pop() != '('){
                    return false;
                }
            }
            else if (c == '}'){
                if(characterStack.isEmpty()){
                    return false;
                }
                if(characterStack.pop() != '{'){
                    return false;
                }
            }
            else if (c == ']'){
                if(characterStack.isEmpty()){
                    return false;
                }
                if(characterStack.pop() != '['){
                    return false;
                }
            }
        }
        if(characterStack.empty()){
            return true;
        }
        return false;
    }
}