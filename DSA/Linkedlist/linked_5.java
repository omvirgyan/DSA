//Finding Nth Node from the end of the Linked list in one traversal its means better time complexity than previous one
public class linked_5 {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void LinkedlistMaker(int[] arr){
        for(int i = 0; i < arr.length;i++){
            Node newNode = new Node(arr[i]);
            if(head == null){
                head = newNode;
            }
            else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;  // Traverse to the end of the list
                }
                temp.next = newNode;  // Add the new node at the end
            }
        }
    }
    
    void display(Node a){
        Node temp=a;
        while(temp != null){
            System.err.print(temp.data +" ");
            temp = temp.next;
        }
    }

    Node delNthElementFromEnd(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i <=idx;i++){
           fast=fast.next;
           if(fast==null){
            head=head.next;
            return head;
           }
        }
        while (fast.next!= null){
         slow=slow.next;
         fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        linked_5 ll=new linked_5();
      int[] a={3,5,3,5,21,452,424};
       ll.LinkedlistMaker(a);
       ll.display(ll.head);
       System.out.println();
       Node ans=ll.delNthElementFromEnd(ll.head, 6);
       ll.display(ans);
    }
}
