package Tree;

public class HeightofTree {
    static class Node{
        int data;
        Node right;
        Node left;
       public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

   public static int height(Node root){
        if (root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
//          1
//        /   \
//       2     3
//     /  \   /  \
//    4    5 6   7
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(height(root));
    }
}
