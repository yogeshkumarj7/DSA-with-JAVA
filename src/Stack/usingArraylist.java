package Stack;
import java.util.ArrayList;

public class usingArraylist {
    static class Stack{
       static ArrayList<Integer>l=new ArrayList<>();

//    isEmpty
       public static boolean isEmpty(){
           return l.size()==0;
        }
//    push
        public static void push(int data){
           l.add(data);
        }
//    pop
       public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top=l.get(l.size()-1);
            l.remove(l.size()-1);
            return top;
        }
//    peek
        static int peek(){
            if (isEmpty()){
                return -1;
            }
            int top=l.get(l.size()-1);
            return top;
        }
    }

    public static void main(String args[]){
        Stack s=new Stack();
       s.push(10);
       s.push(20);
       s.push(30);

       while (!s.isEmpty()){
//           System.out.println(s.peek());

           System.out.println(s.pop());
       }
        System.out.println(s.isEmpty());
       s.push(70);
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.isEmpty());
    }
}
