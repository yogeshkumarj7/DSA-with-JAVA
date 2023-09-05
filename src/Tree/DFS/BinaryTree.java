
//////Inorder => Left, Root, Right.
//////Preorder => Root, Left, Right.
//////Post order => Left, Right, Root.

package Tree.DFS;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Binary tree node creation
    static class BinaryTreeBuilder {
        static int index = -1; // Index initialization to 0

        public static Node buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]); // Create a new node
            newNode.left = buildTree(nodes); // Create the left subtree
            newNode.right = buildTree(nodes); // Create the right subtree
            return newNode;
        }


        // Printing preorder
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            // Print the left subtree
            preorder(root.left);
            // Print the right subtree
            preorder(root.right);
        }

//       postorder
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }


//        BFS(Level-order)

        public static void levelOrder(Node root){
            if (root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node curr=q.remove();
                if (curr==null){
                    System.out.println();
                    if (q.isEmpty()){  //if queue is empty just return from the
                        break;
                    }else {
                        q.add(null); //Added null for printing nextline for next level
                    }
                }else {
                    System.out.print(curr.data+" ");
                    if (curr.left!=null){
                        q.add(curr.left);
                    }
                    if (curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,3,-1,4,5,-1,6,7};
        BinaryTreeBuilder builder = new BinaryTreeBuilder();
        Node root = builder.buildTree(nodes);
//        builder.preorder(root); //preorder
//        builder.postorder(root); //postorder
        builder.levelOrder(root); //levelorder
//        System.out.println(); // Add a newline after the preorder traversal
//        System.out.println("Root Node: " + root.data);
    }
}