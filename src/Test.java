import Arrays.Binary;
public class Test {

//    Created anode class which defining the architecture of the node class
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }

//  Binary tree's node creation
    static class BinarytreeBuilder{
      static int idx=-1;
        public static Node buildRoot(int []nodes){
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildRoot(nodes);
            newnode.right=buildRoot(nodes);
            return newnode;
        }
    }

    public static void main(String[] args) {
        int nodess[]={1,7,3,4,-1,5,-1,6,7,8,9,-1};
        BinarytreeBuilder t=new BinarytreeBuilder();
        Node root=t.buildRoot(nodess);
        System.out.println(root.data);

    }
}
