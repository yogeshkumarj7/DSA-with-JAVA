package LinkedList;

public class ll {

    //  Declared basic parameters
    static Node head;
    static Node tail;
    static int size;

    //  Node class
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //    addFirst............................
    public void addFirst(int value){
//    Created a new node to add at the beginning of the list
        Node node = new Node(value);
        size++;
//    Condition to check weather head is empty or not
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //    addLast.....................................
    public void addLast(int value) {
        Node node = new Node(value);
        size++;
        if (head == null) {
            head = tail = node;
        }
        tail.next = node;
        tail = node;
    }

//    Add at particular index.....................

    public void add(int value, int index) {
//        At index 0
        if (index == 0) {
            addFirst(value);
        }
//        At last
        if (index == size) {
            addLast(value);
        }
        Node node = new Node(value);
        Node temp = head;  //Head selected here
        size++;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    //    deleteFirst
    static int deleteFirst() {
        //    If list is empty
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int value = head.value;
            head = tail = null;
            size = 0;
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    //    deleteLast
    public static int deleteLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
        } else if (size == 1) {
            int value = head.value;
            head = tail = null;
            size = 0;
            return value;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = null;
        temp = tail;
        return value;
    }

    //    Iteration over Linked List
    public int iterate(int key) {
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (temp.value == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;  //key not found
    }

//    Iteration using recursion

    //    Print the linked list.......................
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //    Reverse a linked list(Iterative Approach)
    public void revList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;


        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

//    Find and remove nth Node from the Linked List

    public void deleteNthfromEnd(int n) {

//        Calculate size of linked list
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

//        ** delete the head (no previous available)
        if (n == size) {
            head = head.next;
            return;
        }

//        size-1
        int itoFind = size - n;
        Node prev = head;
        for (int i = 1; i < itoFind; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

//    Linked list is palindrome or not

//    Find the middle of the ll

//    Using slow fast-method
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow!=null && fast.next !=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }

//    Checking for the palindrome

    public boolean checkPalindrome(){

//      Corner cases
        if (head==null || head.next==null){
            return true;
        }
//        Step 1-->Find the mid
        Node midNode=findMid(head);

//        Step--2->Reversre 2nd half
        Node prev=null;
        Node current=midNode;
        Node next;

        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node right=prev; //Right half head
        Node left=head; //left half head

//       Step--3->Check left half and right half
        while (right!=null){
            if (left.value!=right.value){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }



    public static void main(String[] args) {
        ll list=new ll();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList();

        System.out.println(list.checkPalindrome());
    }
}
