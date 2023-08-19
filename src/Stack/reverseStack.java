package Stack;
import java.util.*;
public class reverseStack {
    static void pushAtBottom(Stack<Integer>s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    static void reverseStack(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }
//    Remove top while going up
        int top=s.pop();
//        call function again
        reverseStack(s);
//        Pusing top at bottom
        pushAtBottom(s,top);

    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer>list=new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
//        printStack(list);
//        3 2 1
        reverseStack(list);
        printStack(list);
//        1 2 3
    }
}
