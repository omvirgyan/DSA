public class Size {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;
        }
    }

    public static int getSize(Node root) {
        if (root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
    }

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(getSize(root)); // Output: 7
    }
}
