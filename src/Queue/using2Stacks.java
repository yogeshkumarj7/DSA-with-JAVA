package Queue;
import java.util.Stack;
//2 while loops are used here in add function so time complexity will be O(N)
public class using2Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

//    isEmpty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

//    Add_______O(N)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

//    Remove_____N(1)

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

//     Peek______N(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(11);
        q.add(12);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
