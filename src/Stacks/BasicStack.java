package Stacks;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Arjit");
        st.push("Anshul");
        st.push("Devraaj");
        st.push("Dev");
        st.push("Sanchit");
        st.push("Rajan");
        System.out.println(st); // A.S. = O(n)
        System.out.println(st.size()); // total size
        System.out.println(st.peek()); // topmost element
        st.pop();
        System.out.println(st.size());
        System.out.println(st.pop()); // return topmost element and than remove it.
        System.out.println(st);
    }
}
