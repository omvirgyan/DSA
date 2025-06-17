import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int i) {
            this.val = i;
        }
    }

    public static void bfsAlgo(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll(); // Remove current node
            System.out.println(temp.val); // Print its value

            // Add its children to the queue
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        root.left = a;
        Node b = new Node(3);
        root.right = b;
        Node c = new Node(4);
        a.left = c;
        Node d = new Node(5);
        a.right = d;
        Node e = new Node(6);
        b.left = e;
        Node f = new Node(7);
        b.right = f;
        Node g = root;
        bfsAlgo(g);
    }
}
