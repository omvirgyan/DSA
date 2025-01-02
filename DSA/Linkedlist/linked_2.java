public class linked_2 {
  Node head;

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  void delFirst() {
    if (head == null) {
      System.out.println("LinkedList is Empty");
      return;
    }
    head = head.next;
  }

  void delLast() {
    if (head == null) {
      System.out.println("LinkedList is Empty");
      return;
    }
    if (head.next == null) {
      head = null;
    }
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
  }

  void display() {
    if (head == null) {
      System.out.println("Empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
  int size() {
    Node temp = head;
    int count = 0;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
    return count;
  }
  void inserAtI(int index, int data) {
    Node newNode = new Node(data);
    if (head == null) {
          System.out.println("Empty LL");
    }
    int count =0;
    Node temp=head;
    Node prev=head;
    while (count != index) {
      prev = temp;
      temp=temp.next;
    }
    prev.next = newNode;
    newNode.next =temp;
  }
  public static void main(String[] args) {
    linked_2 ll = new linked_2();
    ll.addFirst(5);
    ll.addFirst(9);
    ll.addLast(11);
    ll.addFirst(52);
    ll.display();
    ll.delLast();
    ll.display();
    System.out.println("size Of LL is " + ll.size());
  }
}
