public class stackByLL {
    public static class Node{  //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next = null;
        }
    }
    public static class LLStack{ //user defined data type
       Node head=null;
       int size=0;
       void push(int x){
              Node temp=new Node(x);
              temp.next=head;
              head=temp;
              size++;
       }
       int pop(){
        if(head==null) return -1;
        int x=head.val;
        head=head.next;
        size--;
        return x;
       }
       void revDisplay(Node temp){
        if(temp==null) return;
        revDisplay(temp.next);
        System.out.print(temp.val+" ");
        
       }
       void display(){
        if(size==0) {
            System.out.println("Stack is Empty");
            return;
        };
           revDisplay(head);
           System.out.println();
       }
       int peek(){
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.val;
       }
       int size(){
        return size;
       }
       boolean isEmpty(){
        if(head==null) return true;
        return false;
       }
      
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(5);
        st.push(15);
        st.push(1);
        st.push(2);
        st.display();
        System.out.println("Pooped element :"+st.pop());
        System.out.println("Pooped element :"+st.pop());
        System.out.println("Pooped element :"+st.pop());
        System.out.println("Pooped element :"+st.pop());
        st.display();
        System.out.println("Peeak :"+st.peek());
        System.out.println("size :"+st.size());
        st.push(1);
        System.out.println(st.isEmpty());
    }
}
