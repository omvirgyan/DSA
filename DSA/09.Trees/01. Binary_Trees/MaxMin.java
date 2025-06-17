public class MaxMin {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;
        }
    }

    public static int maxNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    public static int minNode(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minNode(root.left), minNode(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(-2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(50);
        root.right.left = new Node(6);
        root.right.right = new Node(-700);

        System.out.println("Max Node Value: " + maxNode(root)); // Output: 50
        System.out.println("Min Node Value: " + minNode(root)); // Output: -700
    }
}
