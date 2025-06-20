public class Product {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;
        }
    }

    public static int multiply(Node root) {
        if (root == null) return 1; 
        if (root.val == 0) return 0; 
        return root.val * multiply(root.left) * multiply(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(multiply(root)); 
    }
}
