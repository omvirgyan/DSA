public class intro{
    public static class Node{
        int data;  //value
        Node next; //adress of next node

        Node(int data) {
            this.data = data;
        }
    }
   
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(25);
        Node d=new Node(30);
        a.next = b;                 //next of head
          System.out.println(a.data);  //head data
        b.next = c;
        System.out.println(a.next.next.data);         // printing node C data withouing node c
        c.next = d;
        System.out.println(d.next);  // Tail pointer
    }
}