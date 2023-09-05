package Tree;

public class CountofTheNodes {
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

    static int nodeCounts(Node root) {
            if (root == null) {
                return 0;
            }
            int l = nodeCounts(root.left);
            int r = nodeCounts(root.right);
            int count = l + r+1;
            return count;
        }

        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.println(nodeCounts(root));

        }
    }
