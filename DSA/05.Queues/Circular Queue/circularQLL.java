public class circularQLL {
    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class cirQll{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int num) throws Exception{
            Node temp=new Node(num);
            if(head==null){
                head=temp;
                tail=head;
            }else{
                tail.next=temp;
                tail=tail.next;
                tail.next=head;
            }
            size++;
        }
        public int remove() throws Exception{
            if(head==null){
                throw new Exception("Queue is Empty");
            }
            int x=head.val;
            head=head.next;
            tail.next=head;
            size--;
            return x;
        }
        public int peek() throws Exception{
            if(head==null){
                throw new Exception("Queue is Empty");
            }
            return head.val;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public void display() throws Exception{
            Node temp=head;
            if(head==null){
                throw new Exception("Queue is Empty");
            }else{
                do {
                    System.out.print(temp.val + " "); // Print current node's value
                    temp = temp.next; // Move to the next node
                } while (temp != head); // Stop when we reach the starting node
                System.out.println();
            }
        }

    }
    public static void main(String[] args) throws Exception {
        cirQll cqa = new cirQll();
        cqa.add(90);
        cqa.add(91);
        cqa.add(92);
        cqa.add(93);
        cqa.add(94);
        cqa.peek();
        System.out.println("front ele : " +cqa.peek());
        cqa.display();
        cqa.add(95);
        cqa.add(96);
        cqa.add(97);
        cqa.add(98);
        cqa.add(99);
        System.out.println("Removed : "+cqa.remove());
        cqa.add(88);
        cqa.display();
        cqa.remove();
        cqa.add(1);

        cqa.display();
        System.out.println("SIze of queque: "+cqa.size);
    }
}
