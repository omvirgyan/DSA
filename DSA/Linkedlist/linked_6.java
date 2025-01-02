public class linked_6 {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Modified LinkedlistMaker to accept a head for different linked lists
    Node LinkedlistMaker(Node head, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;  // Traverse to the end of the list
                }
                temp.next = newNode;  // Add the new node at the end
            }
        }
        return head;
    }

    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }
     
    
    public static void main(String[] args) {
        linked_6 ll = new linked_6();
        int[] a = {100, 13, 4, 5, 12,10};
        Node ll_1 = ll.LinkedlistMaker(null, a);  // Create the first list

        int[] b = {90,9, 5, 12, 5, 12,10};
        Node ll_2 = ll.LinkedlistMaker(null, b);  // Create the second list

        ll.display(ll_1);
        System.out.println();
        ll.display(ll_2);
    }
}
