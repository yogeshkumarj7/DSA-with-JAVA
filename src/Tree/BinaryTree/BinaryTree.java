//package Tree.BinaryTree;
//
//import java.util.Scanner;
//
//public class BinaryTree {
//
//     //    Node creation
//    private static class Node {
//        int value;
//        Node right;
//        Node left;
//
//        Node(int value) {
//            this.value = value;
//        }
//        private Node root;
//
////        insert element
//         public void populate(Scanner scanner){
//             System.out.println("Enter the root node value");
//             int value= scanner.nextInt();
//             root=new Node(value);
//         }
//
//         public void populate(Scanner scanner,Node node){
//             System.out.println("Do you want to enter left of"+node.value);
//             boolean left=scanner.nextBoolean();
//             if (left){
//                 System.out.println("Enter the value of the left of the"+node.value);
//                 int value=scanner.nextInt();
//                 node.left=new Node(value);
//                 populate(scanner,node.left);
//             }
//
//         }
//         public void display(){
//             display(root,"");
//         }
//         private display(Node node,String indent){
//             System.out.println(indent+node.value);
//         }
//    }
//
//}