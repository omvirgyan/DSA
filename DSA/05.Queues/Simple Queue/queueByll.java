public class queueByll {
    public static class Node{
            int val;
            Node next;
            Node(int val) {this.val = val;}
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int num){
           Node newNode=new Node(num);
            if(head==null){
                head=newNode;
                tail=head;
                size++;
            }else{
                tail.next=newNode;
                tail=newNode;
                size++;
            }
        }
        public int remove(){
            if(head==null) {
                System.out.println("Queue is Empty");
                return -1;
            };
            size--;
            int pop=head.val;
            head=head.next;
            return pop;
        }
        public int peek() {
            if(head==null) {
                System.out.println("Queue is Empty");
                return -1;
            };
            return head.val;
        }
       public void display(){
        if(size==0) {
            System.out.println("Queue is Empty");
            return;
        }
        Node dummy=head;
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }
        System.out.println();
       }
    }
    
    public static void main(String[] args) {
        queueLL ql=new queueLL();
        ql.add(90);
        ql.add(1);
        ql.add(110);
        ql.add(3);
        System.out.println(ql.size);
        System.out.println( ql.peek());
        System.out.println(ql.remove());
        System.out.println(ql.size);
        ql.display();
    }
}
