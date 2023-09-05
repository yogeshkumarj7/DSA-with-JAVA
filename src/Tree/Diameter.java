package Tree;

public class Diameter {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }
    public static int h(Node root){
        if (root==null){
            return 0;
        }
        int l=h(root.left);
        int r=h(root.right);
        return Math.max(l,r)+1;   //imp    //ipm     //imp   +1    +1    +1    +1
    }
    static int diameter(Node root){
        if (root==null){
            return 0;
        }
        int ldim=diameter(root.left);
        int rdim=diameter(root.right);
        int lh=h(root.left);
        int rh=h(root.right);
        int selfdim=rh+lh+1;
        int dim=Math.max(Math.max(ldim,rdim),selfdim);
        return dim;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root));

    }
}
