public class tryi {
    public static class Node{
      Node left;
      int val;
      Node right;
      public  Node(int i){
        this.val=i;
    }    
       public static void display(Node root){
        if(root==null) return;
        display(root.left);
        System.out.print(root.val +" ");
        display(root.right);
    }
    
}
    public static void main(String[] args) {
       Node root =new Node(5);
       Node a=new Node(10);
       root.right=a;
       tryi.Node.display(root);
    }
}
