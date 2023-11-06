package Stack;

public class usingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;

//        isEmpty
        public static boolean isEmpty(){
            return head==null;
        }
//        push
       public static void push(int data){
            Node newnode=new Node(data);
            if (isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
//        pop
        static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
//        peek
        static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

