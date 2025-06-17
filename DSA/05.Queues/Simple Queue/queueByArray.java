public  class queueByArray {
    public static class queueArray{
        int f=-1;
        int r=-1;
        int[] storage=new int[100];
        int size=0;
        public void add(int val){
            if(size==100) {
                System.out.println("Queue is full");
            }
            if(f==-1){
               storage[0]=val;
               f++;
               r++;
               size++;
            }else{
             storage[++r]=val;
             size++;
            }
        }
        public int remove(){
            if(size==0) return -1;
            size--;
            return storage[f++];
        }
        public int peek(){
            if(size==0) return -1;
            return storage[f];
        }
        public void display(){
            if(size==0) return;
            for(int i=f;i<=r;i++){
                System.out.print(storage[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueArray qu = new queueArray();
        qu.add(10);
        qu.add(34);
        qu.add(45);
        qu.display();
        System.out.println("peek: "+qu.peek());
        qu.remove();
        System.out.println("peek: "+qu.peek());
        qu.display();
        System.out.println("Size : "+qu.size);
        System.out.println(qu.remove());
        System.out.println("peek: "+qu.peek());
        System.out.println(qu.remove());
         System.out.println(qu.remove());
        System.out.println("Size : "+qu.size);
    }
}
