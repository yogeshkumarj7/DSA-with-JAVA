//package Tree;
//
//import java.util.ArrayList;
//
//public class LowestcommonAncestors {
//    static class Node {
//        int data;
//        Node right;
//        Node left;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    public static boolean rootToNodePath(){
//        return false;
//    }
//    public static Node lca(Node root,int n1,int n2){
//        ArrayList<Node>path1=new ArrayList<>();
//        ArrayList<Node>path2=new ArrayList<>();
//        rootToNodePath(root,n1,path1);
//        rootToNodePath(root,n1,path2);
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//
//    }
//}
