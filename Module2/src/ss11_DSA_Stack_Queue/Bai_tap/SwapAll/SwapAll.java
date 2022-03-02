package ss11_DSA_Stack_Queue.Bai_tap.SwapAll;

import java.util.Stack;

public class SwapAll {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        Stack<Number> mWord = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            mWord.push(stack.pop());
        }
        for(Number n : mWord){
            System.out.println(n);
        }

    }


}
