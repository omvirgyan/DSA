public class stackByArray {
    public static class Stack{
        private int[] arr=new int[50];
        private int idx=0;
        public void push(int num){
            if(idx==arr.length) {
                 System.out.println("Stack OverFlow");
                 return;
            }
              arr[idx]=num;
              idx++;
        }
        public int pop(){
            if(idx==arr.length) {
                System.out.println("Stack is underflow");
                return -1;
            }
            int poped=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return poped;
        }
        public int size(){
            return idx;
        }
        public void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.err.println();
        }
        public int peek(){
            return arr[idx-1];
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(15);
        st.push(1);
        st.push(2);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        
    }
}
