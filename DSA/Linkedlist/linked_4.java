//Finding Nth Node from the end of the Linked list in one traversal its means better time complexity than previous one
public class linked_4 {
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
       Node slow = head;
       Node fast = head;
       for (int i = 0; i <=idx;i++){
          fast=fast.next;
       }
       while (fast != null){
        slow=slow.next;
        fast=fast.next;
       }
       return slow.data;
    }

    public static void main(String[] args) {
        linked_4 ll = new linked_4();
        int[] a = { 3, 5, 3, 5, 21, 452, 424};
        ll.LinkedlistMaker(a);
        ll.display();
        System.out.println();
        System.out.println(ll.findNodeFromEndAt(ll.head, 2));
    }
}
