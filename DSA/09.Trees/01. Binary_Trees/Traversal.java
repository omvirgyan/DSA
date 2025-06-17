public class Traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int i){
           this.val = i;
        }
     
     public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
     }
     public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
     }
     public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
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
    System.out.println("Inorder");
    Traversal.Node.inorder(g);
    System.out.println();
    System.out.println("preOrder");
    Traversal.Node.preOrder(g);
    System.err.println();
    System.out.println("postOrder");
    Traversal.Node.postOrder(g);
 }
}
