public class heightOfBTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int i){
            this.val=i;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        root.left =a;
        Node b = new Node(3);
        root.right =b;                                                       
        Node c = new Node(4);
        a.left =c;
        Node d = new Node(5);
        a.right =d;
        Node e = new Node(6);
        b.left =e;
        Node f = new Node(7);
        b.right =f;
        Node g=root;
        System.out.print(height(g));
    }
}
