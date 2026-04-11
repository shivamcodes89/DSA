package Stacks;

import java.util.Stack;
public class BalancedBracket {
    public static void main(String[] args) {
        String str = "{([])}()";
        System.out.println(isBalanced(str));
    }

    static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(sameStyle(top, ch)) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    static boolean sameStyle(char a, char b){
        if(a == '[' && b == ']' ) return true;
        if(a == '{' && b == '}' ) return true;
        if(a == '(' && b == ')' ) return true;
        return false;
    }
}