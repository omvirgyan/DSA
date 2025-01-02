//Finding Nth Node from the end of the Linked list
public class linked_3 {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void LinkedlistMaker(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next; // Traverse to the end of the list
                }
                temp.next = newNode; // Add the new node at the end
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int findNodeFromEndAt(Node head, int idx) {
        Node temp = head;
        int count = 0;

        // First pass: count the number of nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Check if the index is valid
        if (idx > count || idx <= 0) {
            System.out.println("Invalid Index");
            return -1;
        }

        // Find the (count - idx)th node from the start
        Node index = head;
        for (int i = 0; i < count - idx; i++) {
            index = index.next;
        }

        return index.data;
    }

    public static void main(String[] args) {
        linked_3 ll = new linked_3();
        int[] a = { 3, 5, 3, 5, 21, 452, 424};
        ll.LinkedlistMaker(a);
        ll.display();
        System.out.println();
        System.out.println(ll.findNodeFromEndAt(ll.head, 2));
    }
}
