package Stack;

import java.util.Stack;

//Push at the bottom of the stack...
//Using recursion...
public class pushAtBotttom {
    static void pushAtBottom(Stack<Integer>s, int data){
       if(s.isEmpty()){
           s.push(data);
           return;
       }

       int top=s.pop();
       pushAtBottom(s,data);
       s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom(s,40);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

}
