class implementationBtree{
    public static class Node{
           int val;
           Node left;
           Node right;
           public Node(int i){
              this.val = i;
           }
        
        public static void display(Node root){
            if(root==null) return;
                display(root.left);
                System.out.print(root.val+" ");
                display(root.right);
        }
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
        implementationBtree.Node.display(g);
    }
}